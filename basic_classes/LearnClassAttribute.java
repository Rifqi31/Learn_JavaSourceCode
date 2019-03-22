public class LearnClassAttribute {
	// this attributes
	String first_name = "Rifqi";
	String last_name = " Muttaqin";

	int mynum = 100;
	final int myfinally = 23;		// this type cannot change

	public static void main(String[] args) {
		// access the attributes
		LearnClassAttribute sayname = new LearnClassAttribute();
		// LearnClassAttribute say_lastname = new LearnClassAttribute();
		// acces it
		System.out.println(sayname.first_name.concat(sayname.last_name));

		// you can change value from attribute
		// but access first
		LearnClassAttribute change_value = new LearnClassAttribute();
		change_value.mynum = 200;
		System.out.println(change_value.mynum);
	}
}