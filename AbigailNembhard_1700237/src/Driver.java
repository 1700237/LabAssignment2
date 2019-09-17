
public class Driver {

	public static void main(String[] args) {
		IterationMathLib iterationLibrary = 
				new IterationMathLib();
		RecursiveMathLib recursionLibrary = 
				new RecursiveMathLib();
		System.out.println("---- Recursion -----");
		runTestCode(recursionLibrary);
		System.out.println("---- Iteration -----");
		runTestCode(iterationLibrary);

	}
	
	public static void runTestCode(MathLib library) {
		System.out.println ("GCD (4, 2) = "+library.gcd(4, 2));
		System.out.println ("Ack (10, 20) = "+library.ack(10, 20));
		System.out.println ("Fib (40) = "+library.fib(40));
		System.out.println ("Hanoi (2) ="+library.hanoi(2));
	}

}
