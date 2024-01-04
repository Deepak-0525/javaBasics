package oopsConcept;

public class MethodOverLoading {
        static int add(int a, int b) {
            return a + b;
        }

        static int add(int a, int b, int c) {
            return a + b + c;
        }
    }
    class TestOverloading {
        public static void main(String[] args) {
            System.out.println(MethodOverLoading.add(2, 3));
            System.out.println(MethodOverLoading.add(2, 3, 4));
        }
    }
