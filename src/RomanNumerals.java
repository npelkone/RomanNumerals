
public class RomanNumerals {
	public String previousString="A";
	
	public int convertToInteger(String romanNum) {
		if (checkRepeatedValues(romanNum) == false) {
			return 0;
		} else {
			String[] splitRomanNum = romanNum.split("");
			int convertedNumber = 0;
			
			for(String str : splitRomanNum) {
				if(checkThisValue(previousString) < checkThisValue(str)) {
					convertedNumber -= checkRomanNumber(previousString);
					convertedNumber -= checkRomanNumber(previousString);
					convertedNumber += checkRomanNumber(str);
				}
				else {
					convertedNumber += checkRomanNumber(str);
				}
			}
			return convertedNumber;
		}
	}
	
	public int checkThisValue(String str) {
		switch(str) {
			case "M":
				return 1000;
			case "D":
				return 500;
			case "C":
				return 100;
			case "L":
				return 50;
			case "X":
				return 10;
			case "V":
				return 5;
			case "I":
				return 1;
			default:
				return 2000;
		}
	}
	
	public int checkRomanNumber(String romanNum) {
		switch(romanNum) {
			case "M":
				previousString = romanNum;
				return 1000;
			case "D":
				previousString = romanNum;
				return 500;
			case "C":
				previousString = romanNum;
				return 100;
			case "L":
				previousString = romanNum;
				return 50;
			case "X":
				previousString = romanNum;
				return 10;
			case "V":
				previousString = romanNum;
				return 5;
			case "I":
				previousString = romanNum;
				return 1;
			default:
				return 2000;
		}
	}
	
	public boolean checkRepeatedValues(String romanNum) {
		if (romanNum.contains("IIII") || romanNum.contains("XXXX") || romanNum.contains("CCCC") || romanNum.contains("MMMM")) {
			return false;
		} else {
			return true;
		}
	}
}
