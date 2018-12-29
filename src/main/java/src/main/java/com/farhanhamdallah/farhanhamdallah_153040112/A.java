package src.main.java.com.farhanhamdallah.farhanhamdallah_153040112;

public class A {
	public double hitung(double a, double b, double c) {
		Argument argA = new Argument("a", a);
		Argument argB = new Argument("a", b);
		Argument argC = new Argument("a", c);
		Expression exp = new Expression("(a+b)*c", argB, argA, argC);
		return exp.calculate();
	}
}
