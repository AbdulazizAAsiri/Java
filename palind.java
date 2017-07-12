import java.util.*;
public class palind {
	static boolean checkPalind (String []S , String [] words)  {
		for (int i = 0; i<S.length;i++ ) {
			if (!(S[i].equals(words[i]))) {
				return false ; 
			}
		}
		return true ; 
	}
	public static void main (String [] args) {
		Scanner user_input = new Scanner( System.in );
		String sentence = user_input.nextLine(); 
		String [] words = sentence.split(" ");
		String [] temp = new String[words.length];
		for (int i = words.length-1; i>=0 ;i-- ) {
			temp[words.length-i-1] = words[i];
		}
		boolean check = checkPalind (temp,words); 
		if(check) {
			System.out.println("Palindrime :)");
		} else {
			System.out.println("Not Palindrime :(");
		}
	}
}