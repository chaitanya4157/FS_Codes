package basics;

public class LowerCaseAsciiValues {
	public static void main(String[] args) {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch+" "+(int)ch);
		}
	}
}
