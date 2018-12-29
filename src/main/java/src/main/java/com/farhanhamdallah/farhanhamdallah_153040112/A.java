package src.main.java.com.farhanhamdallah.farhanhamdallah_153040112;

import org.mariuszgromada.math.mxparser.Argument;
import org.mariuszgromada.math.mxparser.Expression;

public class A {
	public double hitung(double a, double b, double c) {
		org.mariuszgromada.math.mxparser.Argument argA = new Argument("a", a);
		Argument argB = new Argument("b", b);
		Argument argC = new Argument("c", c);
		org.mariuszgromada.math.mxparser.Expression exp = new Expression("(a+b)*c", argB, argA, argC);
		return exp.calculate();
	}
}
