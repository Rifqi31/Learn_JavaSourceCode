// operators
public class Operators {
	public static void main(String[] args) {
		// initialize variabel
		int datanum1 = 100;
		int datanum2 = 20;

		boolean datalogic1 = true;
		boolean datalogic2 = false;

		// traditional operator
		int resultAddition = datanum1 + datanum1;
		int resultSubstraction = datanum2 - datanum1;
		int resultMultiplication = datanum1 * datanum2;
		double resultDivision = datanum2 / datanum1;
		double resultModulus = datanum2 % 3;
		int resultIncrement =  datanum1+1;
		int resultDecrement = datanum1-1;

		System.out.println(resultAddition);
		System.out.println(resultSubstraction);
		System.out.println(resultMultiplication);
		System.out.println(resultDivision);
		System.out.println(resultModulus);
		System.out.println(resultIncrement);
		System.out.println(resultDecrement);


		// logical operator
		// create table logic OR v
		boolean resultOR1 = datalogic1 || datalogic1;
		boolean resultOR2 = datalogic2 || datalogic2;
		boolean resultOR3 = datalogic1 || datalogic2;
		boolean resultOR4 = datalogic2 || datalogic1;

		System.out.println(resultOR1);
		System.out.println(resultOR2);
		System.out.println(resultOR3);
		System.out.println(resultOR4);


		// create table logic AND ^
		boolean resultAND1 = datalogic1 && datalogic1;
		boolean resultAND2 = datalogic2 && datalogic2;
		boolean resultAND3 = datalogic1 && datalogic2;
		boolean resultAND4 = datalogic2 && datalogic1;

		System.out.println(resultAND1);
		System.out.println(resultAND2);
		System.out.println(resultAND3);
		System.out.println(resultAND4);

		// Comparison and... so on

	}
}