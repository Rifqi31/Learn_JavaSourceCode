public class LearnClassMethod {
	// attribute
	int square_long = 200;
	double square_width = 72.3;
	// create method
	// static method can be called without creating object
	static double calcaluteSquare() {
		// access first
		LearnClassMethod squareValue = new LearnClassMethod();
		// create calculation
		double result_square = squareValue.square_long * squareValue.square_width;
		// return value
		return result_square;
	}

	// void element cannot call result numeric
	static void sayHi() {
		System.out.println("Learning Method in Java lol");
	}

	// public method
	public double roundNumber(double numberUser) {
		double resultNumber = Math.round(numberUser);
		return resultNumber;
	}

	public static void main(String[] args) {
		// just call the method
		// access static class without creating object
		sayHi();
		// access and print the result from calculatSquare method
		System.out.println(calcaluteSquare());

		// because public class create object first
		LearnClassMethod access_roundNumber = new LearnClassMethod();

		double numResult = access_roundNumber.roundNumber(21.110);
		System.out.println(numResult);
		
	}
}