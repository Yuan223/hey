
public class CodingChallenge1 {
	public static boolean isLowercaseChar(char aChar) {
		return aChar>='a' && aChar<='z';
		 
	}
	
	public static int firstLowercaseChar(String str) {
		for(int i=0; i<str.length(); i++) {
			if (i>='a' && i<='z') {
				return i;
				}
		}
		return -1;
	}
	
	public static long ceilingOfMultiplication(int num1, double num2) {
		double newnum1=num1;
		long result = (long) (newnum1*num2);
		return result;
	}
	public static int addOctalDigits(int num) {
		int remainder=0,multiple=0;
		int result = 0;
		while (num/8!=0){
			remainder=num%8;
			result=remainder+multiple*10;
			multiple++;
		}
		return result;
		
	}
}
