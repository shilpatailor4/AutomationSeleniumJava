package capge;

public class ToggleCase {

	public static void main(String[] args) {
		// convert lower to upper and upper to lower case
		
		String inputString = "Hello World";
		char[] dataArray = inputString.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for(char data : dataArray) {
			if(Character.isUpperCase(data)) {
				result.append(Character.toLowerCase(data));
			}
			else if(Character.isLowerCase(data)) {
				result.append(Character.toUpperCase(data));
			}
			else {
				result.append(data);
			}
		}
		
		System.out.println("Original String:: " + inputString);
		System.out.println("Result:: " + result.toString());

	}

}

//Original String:: Hello World
//Result:: hELLO wORLD