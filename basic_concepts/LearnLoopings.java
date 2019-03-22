public class LearnLoops {
	public static void main(String[] args) {

		// array
		String[] cars = {"Subaru", "Volvo", "Suzuki", "Daihatsu"};

		int counter1 = 0;
		// while loops
		while(counter1 < cars.length) {
			System.out.println(cars[counter1]);
			counter1++;
		}
		System.out.println(""); // endl

		// do while loops
		// do{
		// 	System.out.println(cars[counter1]);
		// 	counter1++;
		// }while(counter1 < cars.length);

		System.out.println(""); // endl
		// for loops
		for(int counter2 = 0; counter2 < cars.length; counter2++) {
			System.out.println(cars[counter2]);
		}
	}
}