package cognifyz;

public class palindromechecker {

	    public static void main(String[] args) {
	        String input = "Nandhu";
	        System.out.println(ispalindromechecker(input)); // Output: true
	    }

	    public static boolean ispalindromechecker (String s) {
	        // Remove spaces and punctuation, and convert to lowercase
	        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        // Check if the string is equal to its reverse
	        for (int i = 0; i < s.length() / 2; i++) {
	            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
