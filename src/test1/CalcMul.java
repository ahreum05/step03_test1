package test1;

public class CalcMul implements Calc {
	private int a;
	private int b;



	@Override
	public void calculate() {
		int result = a * b;
		System.out.println(a + " * " + b + " = " + result);
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
}
