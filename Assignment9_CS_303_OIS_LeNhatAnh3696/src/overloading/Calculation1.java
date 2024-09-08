package overloading;

public class Calculation1 {

    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        Calculation1 obj = new Calculation1();
        obj.sum(10, 10, 10);
        obj.sum(20, 20);
    }
}
