public class LearnBreakContinue {
	public static void main(String[] args) {

		// break
		for (int i = 0; i < 10; i++) {
		  if (i == 4) {
		    break;
		  }
		  System.out.println(i);
		} 

		System.out.println("");

		// continue
		for (int i = 0; i < 10; i++) {
		  if (i == 4) {
		    continue;
		  }
		  System.out.println(i);
		}

		System.out.println("");

		// break and continue in while loops
		int i = 0;
		while (i < 10) {
		  System.out.println(i);
		  i++;
		  if (i == 4) {
		    break;
		  }
		}

		while (i < 10) {
		  if (i == 4) {
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		} 

		
	}
}