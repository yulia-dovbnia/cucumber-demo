package runner;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utils.User;

import java.util.List;
import java.util.Map;

import static utils.Utils.printToConsole;

public class Stepdefs {

    private static final String KEY_VALUE_TEMPLATE = "Key = %s, Value = %s";
    private static final String VALUES_ARE_DIFFERENT_MESSAGE = "Values are different";

    @When("^I print to console some text$")
    public void iPrintToConsoleSomeTexT() {
        printToConsole("Printed some text");
    }

    @And("^I print the text '(.*)'$")
    public void iPrintTheText(String textToPrint) {
        printToConsole(textToPrint);
    }

    @When("^I print user '(.*)'$")
    public void iPrintUserMyCustomUser(User user) {
        printToConsole(user);
    }

    @When("^I add '(-?\\d*)' to '(-?\\d*)' it should be '(-?\\d*)'$")
    public void iAddToItShouldBe(int first, int second, int result) {
        printToConsole(String.format("Checking that %s + %s = %s\n", first, second, result));
        Assert.assertEquals("Sum is incorrect", result, first + second);
    }

    @When("^I print the text$")
    public void iPrintTheText2(String text) {
        printToConsole(text);
    }

    @When("^I add First \\+ Second it should be Result using data table and raw:$")
    public void iAddFirstSecondItShouldBeResultUsingDataTable(DataTable dataTable) {
        List<List<String>> listList = dataTable.raw();
        //We should start from 1
        for (int i = 1; i < listList.size(); i++) {
            String first = listList.get(i).get(0);
            String second = listList.get(i).get(1);
            String result = listList.get(i).get(2);

            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);
            int resultInt = Integer.parseInt(result);

            Assert.assertEquals(VALUES_ARE_DIFFERENT_MESSAGE, firstInt + secondInt, resultInt);
        }
    }

    @When("^I add First \\+ Second it should be Result using list map:$")
    public void iAddFirstSecondItShouldBeResultUsingListMap(List<Map<String, String>> listMap) {
        //We start from 0
        for (int i = 0; i < listMap.size(); i++) {
            String first = listMap.get(i).get("first");
            String second = listMap.get(i).get("second");
            String result = listMap.get(i).get("result");

            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);
            int resultInt = Integer.parseInt(result);

            Assert.assertEquals(VALUES_ARE_DIFFERENT_MESSAGE, firstInt + secondInt, resultInt);
        }
    }

    @When("^I add First \\+ Second it should be Result using list map and foreach:$")
    public void iAddFirstSecondItShouldBeResultUsingListMapAndForEach(List<Map<String, String>> listMap) {
        //we don't care from to start
        listMap.forEach(listItem -> {
            String first = listItem.get("first");
            String second = listItem.get("second");
            String result = listItem.get("result");

            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);
            int resultInt = Integer.parseInt(result);

            Assert.assertEquals(VALUES_ARE_DIFFERENT_MESSAGE, firstInt + secondInt, resultInt);
        });
    }

    @When("^I print keys and values using data table and raw:$")
    public void iPrintKeysAndValuesUsingDataTableAndRaw(DataTable dataTable) {
        List<List<String>> listList = dataTable.raw();
        for (int i = 0; i < listList.size(); i++) {
            String key = listList.get(i).get(0);
            String value = listList.get(i).get(1);

            printToConsole(String.format(KEY_VALUE_TEMPLATE, key, value));
        }
    }

    @When("^I print keys and values using map:$")
    public void iPrintKeysAndValuesUsingMap(Map<String, String> map) {
        map.forEach((key, value) -> {
            printToConsole(String.format(KEY_VALUE_TEMPLATE, key, value));
        });
    }

    @When("^I print users using data table and raw:$")
    public void iPrintUsersUsingDataTableAndRaw(DataTable dataTable) {
        //first
        List<List<String>> listOfList = dataTable.raw();
        listOfList.forEach(element -> printToConsole(new User(element.get(0))));

        //second
        List<User> userList = dataTable.asList(User.class);
        userList.forEach(user -> printToConsole(user));
    }

    @When("^I print users using list:$")
    public void iPrintUsersUsingList(List<User> userList) {
        userList.forEach(user -> printToConsole(user));

        //Can be rewritten to:
        //userList.forEach(Utils::printToConsole);
    }
}