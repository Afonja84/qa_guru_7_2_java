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

    public Children(String firstName, String lastName,String gender, int age, String mobile, String momName,
                    String fatherName, String colorHair, String hobbies, String momMobile, String fatherMobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.mobile = mobile;
        this.momName = momName;
        this.fatherName = fatherName;
        this.colorHair = colorHair;
        this.hobbies = hobbies;
        this.momMobile = momMobile;
        this.fatherMobile = fatherMobile;

    }

    public String getInfoChildren() {
        return ("Children name: " + this.firstName + ", Last name: " + this.lastName + ", " + this.age +
                " age, " + "Gender: " + this.gender + ", " +  "mobile: " + this.mobile + ", mom Name: " + this.momName +
                ", mom Mobile: " + this.momMobile + ", father Name: " + this.fatherName + ", father Mobile: " + this.fatherMobile +
                ", Hobbies: " + this.hobbies + ", colorHair: " + this.colorHair);
    }

}
