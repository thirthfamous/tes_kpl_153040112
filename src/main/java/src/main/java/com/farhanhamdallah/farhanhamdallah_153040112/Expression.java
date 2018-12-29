package src.main.java.com.farhanhamdallah.farhanhamdallah_153040112;

public class Expression {
	private double output;
	Argument a,b,c;
	
	public Expression(String exp, Argument a, Argument b, Argument c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getOutput() {
		return output;
	}

	public void setOutput(double output) {
		this.output = output;
	}
	
	public double calculate() {
		return (this.a.getValue() + this.b.getValue()) * this.c.getValue() ;
	}
}
