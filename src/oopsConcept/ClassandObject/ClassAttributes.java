package oopsConcept.ClassandObject;

public class ClassAttributes {
    int regno = 6224;
    String sname  = "Deepak";
    char snamel = 'S';


    public static void main(String[] args) {
        ClassAttributes Obj = new ClassAttributes();
        System.out.println("student Name : "+ Obj.sname +" "+ Obj.snamel );
        System.out.println("Regno : "+Obj.regno);
    }
}
