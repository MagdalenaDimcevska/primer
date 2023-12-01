package Konstruktori;

public class m_1 {
public static void main(String[]args) {
	double x=5;
	double y=m(x);
	System.out.println(y);
}
public static double m(double x) {
	return (x+3)/(x*x);
}
}
