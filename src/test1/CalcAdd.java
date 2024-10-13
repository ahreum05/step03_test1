package test1;

public class CalcAdd implements Calc{

	private int a;
	private int b;
	public CalcAdd(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void calculate() {
		int result = a + b;
		System.out.println(a + " + " + b + " = " + result);
		
	}
	
}
