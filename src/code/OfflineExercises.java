package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		
		String modified = "";
		
		for (int i = 0; i < input.length(); i++) {
			
			for (int j = 0; j < 3; j++) {
			modified = modified + (input.charAt(i));
			}
		}
				
		return modified;
	}
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "elivc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		
		String check = "bert";
		String holder = "";
		int indexBack = 0;
		int indexFront = 0;
		String result = "";
		
		//find back bert
		while (indexBack == 0) {
		for (int i = input.length() - 1; i >= 0; i--) {
			
				if (input.toUpperCase().charAt(i) == check.toUpperCase().charAt(3)) {
					if (input.substring(i-3, i).toUpperCase().equals(check.toUpperCase())) {
						indexBack = i-3;
					}
				}
			}
			if (indexBack == 0) {
				indexBack = 1000;
			}
		}
		
		//find front bert
		while (indexFront == 0) {
			for (int i = 0; i < input.length() - 1; i++) {
				
					if (input.toUpperCase().charAt(i) == check.toUpperCase().charAt(0)) {
						if (input.substring(i, i+3).toUpperCase().equals(check.toUpperCase())) {
							indexFront = i+3;
						}
					}
				}
				if (indexFront == 0) {
					indexFront = 1000;
				}
			}
		
		//using position of berts, find substring, reverse and return
		if ((indexBack > input.length()) || (indexFront > input.length())) {
			return result;
		} else {
			holder = input.substring(indexFront+1, indexBack-1);
			for (int k = holder.length() - 1; k >= 0; k--) {
				result = result + holder.charAt(k);
			}
		}
		
		return result;
	}

	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		if ((a > b) && (a > c)) {
			z = a;
		} else if ((b > a) && (b > c)) {
			z = b;
		} else if ((c > a) && (c > b)){
			z = c;
		}
		
		if ((a < b) && (a < c)) {
			x = a;
		} else if ((b < a) && (b < c)) {
			x = b;
		} else if ((c < a) && (c < b)){
			x = c;
		}
		
		if (((x == a) && (z == c)) || ((x == c) && (z == a))) {
			y = b;
		} else if (((x == b) && (z == c)) || ((x == c) && (z == b))) {
			y = a;
		} else if (((x == b) && (z == a)) || ((x == a) && (z == b))) {
			y = c;
		}
		
		if ((z - y) == (y - x)) {
			return true;
		} else {
			return false;
		}

	}

	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		
		String front = input.substring(0, a);
		String back = input.substring(input.length() - a, input.length());
		
		String result = front + back;		
		
		return result;
	}
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("cooldev") → true
	// endsDev("jh") → false
	// endsDev("coolev") → false

	public boolean endsDev(String input) {
		
		
		String dev = "dev";
		if (input.length() > dev.length()) {
		if((input.substring(input.length() - dev.length(), input.length()).toUpperCase().equals(dev.toUpperCase()))) {
			return true;
		} else {	
			return false;
		}
		} else {
			return false;
		}
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "xxppp9"
	// yields "xp9".

	// RECURSIVE

	// stringClean("xxppp9") → "xp9"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Heellooo") → "Helo"
	public String stringClean(String input) {
	
		
		
		String result = "";
		
		
		
		
		
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i+1) == input.charAt(i)) {
				
			} else {
				return stringClean(input);
			}
				
		}
		
		
		
		
		
		
		
		
		
		return result;
	}

	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Each subsequent Fibonacci value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the sum of
	// the first
	// n numbers.

	// RECURSIVE

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 2
	// fibonacci(7) → 33

	public int fibonacci(int input) {
		
		int sum = 0;
		
		if (input == 0) {
			return 0;
		} else if (input == 1) {
			return 1;
		} else {
			sum = fibonacci(input-1) + fibonacci(input - 2);
			return sum + 1;
		}
		
	}

	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Given a number multiply that number by 2 - using recursion
	// do not use any loops

	// RECURSIVE

	// simpleRecursion(0) → 0
	// simpleRecursion(1) → 2
	// simpleRecursion(2) → 4

	public int simpleRecursion(int input) {

		
		if (input == 0) {
			return 0;
		} else {
			return simpleRecursion(input - 1) + 2;
		}

	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		
		int length = 0;
		int saved = 0;
		int i = 0;
				
			while (i < input.length()) {
				
				for (int j = 0; j < input.length() - (i + length); j++) {
					if (input.charAt(i) == input.charAt(i+length)) {
						length++;
						
						if (saved < length) {
							saved = length;
						}
						
					}
				}
				length = 0;
				i++;
			}
		
		return saved;

	}

}
