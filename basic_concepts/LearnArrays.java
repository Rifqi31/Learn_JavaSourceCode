public class LearnJava {
	public static void main(String[] args) {
		// single dimensional array
		String[] cars = {"Subaru", "Volvo", "Suzuki", "Daihatsu"};
		String[] animal = {"Tiger", "Lion", "Rabbit", "Monkey"};

		// multi dimeinsional array
		String[][] hentai = { {"Hardcore", "Anal", "Threesome", "Gangbang"}, {"Pineapple", "Bishop", "Pixel", "Black"} };

		// classic way
		int counter = 0;
		while(counter < cars.length) {
			// print all data in array
			System.out.println(cars[counter]);
			counter++;
		}

		System.out.println(""); //endl

		// for-each way
		for(String counter_animal : animal) {
			System.out.println(counter_animal);
		}

		System.out.println(""); //endl

		// result multidimensional array
		for(int counter_hentai1 = 0; counter_hentai1 < hentai.length; counter_hentai1++) {
			for(int counter_hentai2 = 0; counter_hentai2 < hentai[counter_hentai1].length;counter_hentai2++) {
				System.out.println(hentai[counter_hentai1][counter_hentai2]);
			}
		}
	}
}