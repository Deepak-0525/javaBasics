package oopsConcept;

public class Constructor {
    String s ;

    public Constructor() {
        s = "Dhinesh";
    }

    public static void main(String[] args) {
        Constructor Obj = new Constructor();
        System.out.println(Obj.s);
    }
}
