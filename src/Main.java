public class Main {

    public static void main(String[] args) {
    	/*
		int myVar = 50;
	    System.out.println(myVar);

	    int anotherVar = 100;
	    System.out.println(anotherVar);

	    myVar = anotherVar;
	    System.out.println(myVar);

	    anotherVar = 200;
	    System.out.println(anotherVar);

	    int increment = 5;
	    System.out.println(increment++);
	    System.out.println(increment);

	    int compoundAssignment = 50;
	    compoundAssignment -= 15;
	    System.out.println(compoundAssignment);

	    int valA = 21;
	    int valB = 6;
	    int valC = 3;
	    int valD = 1;

	    int result1 = valA - valB / valC;
	    int result2 = (valA - valB) / valC;

	    System.out.println(result1);
	    System.out.println(result2);

	    int result3 = valA / valC * valD + valB;
		int result4 = valA / (valC * (valD + valB));

		System.out.println(result3);
		System.out.println(result4);
		*/
		float floatVal = 1.0f;
		double doubleVal = 4.0d;
		byte byteVal = 7;
		short shortVal = 7;
		long longVal = 5;

		short result1 = (short) byteVal;
		short result2 = (short) (byteVal - longVal);
		double result3 = longVal - doubleVal;
		long result4 = (long) (shortVal - longVal + floatVal + doubleVal);

		System.out.println("Success");
    }
}
