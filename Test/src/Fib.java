//Fibonacci Recursive
// Sum of last two numbers before it.
// 0, 1, 1, 2, 3, 5, ...

public class Fib {
	
	/**
	 * Returns the i-th number in the Fibonacci sequence, using 0 based indexing.
	 * @param i the index we want in the sequence
	 * @return f the fibonacci number
	 */
	public static int fib(int i){
		//base cases
		if (i == 0){
			return 0;
		} else if (i == 1){
			return 1;
		}
		
		int onebefore = i-1; //23
		int twobefore = i-2; //22
		int fibone = fib(onebefore);
		int fibtwo = fib(twobefore);
		int fib = fibone + fibtwo;
		return fib;
	}
	
	public static void main(String[] args) {
		System.out.println(fib(4));
	}
}
