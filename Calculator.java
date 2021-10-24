package week3.day1;


public class Calculator {
	
	public void add(int i, int j, int k) {
		int sum = i+j+k;
		System.out.println(sum);
	}
	public void add(int i, int j) {
		int sum  = i+j;
		System.out.println(sum);
	}
	public void multiply(int i, int j) {
		int multiply = i*j;
		System.out.println(multiply);
	}
	public void multiply(int i, int j, int k) {
		int multiply = i*j*k;
		System.out.println(multiply);
	}
	public void sub(int i, int j) {
		int sub = i-j;
		System.out.println(sub);
	}
	public void sub(int i, int j, int k) {
		int sub = i-j-k;
		System.out.println(sub);
	}
	private void divide(int i, int j ) {
		int divide = i/j;
		System.out.println(divide);

	}
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(2, 3);
		obj.add(2, 5, 2);
		obj.multiply(2, 6);
		obj.multiply(2, 4, 6);
		obj.sub(4, 2);
		obj.sub(10, 2, 4);
		obj.divide(40, 2);
		
	}

}
