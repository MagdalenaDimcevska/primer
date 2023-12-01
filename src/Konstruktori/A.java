package Konstruktori;
public class A {
    int a, b, c = 0;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
        c+=a+b;
    }
    void printC() {
        System.out.println(c);
    }
    static class M21 {
        public static void m(int a, int b) {
            A m = new A(a, b);
            m.printC();
        }
    }
    public static void main(String[] args) {
        A instance = new A(2, 5);
        instance.printC();
    }}