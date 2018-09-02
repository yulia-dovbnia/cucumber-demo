package utils;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static utils.Utils.printToConsole;


public class Hooks {
    @Before()
    public void methodToBeExecutedBeforeEachScenario() {
        printToConsole("Before hook\n");
    }

    @Before("@f2")
    public void methodToBeExecutedBeforeTaggedScenario() {
        printToConsole("Before hook - with tag f2\n");
    }

    @Before("@f3,@f4")
    public void methodToBeExecutedBeforeTaggedScenarios() {
        printToConsole("Before hook - with tag f3 and f4\n");
    }

    @After
    public void methodToBeExecutedAfterEachScenario() {
        printToConsole("After hook\n");
    }

}
