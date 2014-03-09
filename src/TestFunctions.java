
public class TestFunctions {

	public static void main(String[] args) {
		
	}

}

abstract class Functions {

	protected int x;
	
	protected Functions() {
	}
	
	protected Functions(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "f(x) = " + x;
	}
	
	public abstract double getFunctionA();
	public abstract double getFunctionB();
	public abstract double getFunctionC();
	public abstract double getFunctionD();
	public abstract double getFunctionE();
	public abstract double getFunctionF();
	public abstract double getFunctionG();
	
}

class FunctionExample extends Functions {

	@Override
	public double getFunctionA() {
		return Math.pow(x,x);
	}

	@Override
	public double getFunctionB() {
		return Math.sin(x);
	}

	@Override
	public double getFunctionC() {
		return Math.cos(x);
	}

	@Override
	public double getFunctionD() {
		return Math.tan(x);
	}

	@Override
	public double getFunctionE() {
		return Math.cos(x) + 5 * Math.sin(x);
	}

	@Override
	public double getFunctionF() {
		return 5 * Math.cos(x) + Math.sin(x);
	}

	@Override
	public double getFunctionG() {
		return Math.log(x) + Math.pow(x,x);
	}
	
}
