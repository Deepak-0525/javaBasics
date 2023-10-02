package oopsConcept;

public class ParameterConstructor {
    int birthYear;
    String Name;

    public ParameterConstructor(int year, String name) {
        birthYear = year;
        Name = name;
    }

    public static void main(String[] args) {
        ParameterConstructor Dob = new ParameterConstructor(2003, "Deepak");
        System.out.println(Dob.birthYear + " " + Dob.Name);
    }

}
