package qaguru;

public class Children {

    String firstName;
    String lastName;
    String momName;
    String fatherName;
    String gender;
    int age;
    String colorHair;
    String hobbies;
    String mobile;
    String momMobile;
    String fatherMobile;

    public Children() {
    }

    public Children(String firstName, String lastName,String gender, int age, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.mobile = mobile;
    }

    public String getInfoChildren() {
        return ("Children name: " + this.firstName + ", Last name: " + this.lastName + ", " + this.age +
                " age, " + "mobile: " + this.mobile);
    }

}
