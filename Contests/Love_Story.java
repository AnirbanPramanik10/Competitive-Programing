import java.io.*;
import java.util.*;
public class Love_Story {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner scann = new Scanner(System.in);
		int testcasse = scann.nextInt();
		String ans = "codeforces";
		while(testcasse-- > 0){
			String res = scann.next();
			int opr = 0;
			for(int z = 0; z < res.length(); z++){
				if(ans.charAt(z) != res.charAt(z))
					opr++;
			}
			System.out.println(opr);
		}
	}
}