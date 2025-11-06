package no.hvl.dat100.common;

public class TODO {

	public static String method() {
		
		String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
		
		return "Metoden " + methodName + " er ikke implementert";
	}

    //hello world! -grethe
    //Hei - Solfrid
    //hvordan går det -grethe

	public static String constructor(String className) {
				
	   return "Konstruktøren for klassen " + className + " er ikke implementert";
		
	}

}
