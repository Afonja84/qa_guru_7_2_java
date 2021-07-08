package qaguru;

public class main {
    public static void main(String[] args) {
        Children anna = new Children();
        anna.firstName = "Anna";
        anna.lastName = "Usatenko";
        anna.gender = "Girl";
        anna.age = 5;

        System.out.println(anna.getInfoChildren());
    }
}
