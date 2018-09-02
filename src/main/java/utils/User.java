package utils;

public class User {
    private String name;
    private int age;
    private boolean isMale;


    public User(String name) {
        String user = "user.";
        String fullName = PropertyUtil.getProperty(user + name + ".name");
        String ageString = PropertyUtil.getProperty(user + name + ".age");
        String gender = PropertyUtil.getProperty(user + name + ".gender");

        this.name = fullName;
        this.age = Integer.parseInt(ageString);
        this.isMale = gender.equalsIgnoreCase("M");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
