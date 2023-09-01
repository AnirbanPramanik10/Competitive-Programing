import java.io.*;
import java.util.*;
public class Matching {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			String s = sc.next();
			int ans = 1;
			if(s.charAt(0) == '0'){
				System.out.println(0);
				continue;
			}
			for(int i = 0; i < s.length(); i++){
				if(i == 0 && s.charAt(i) == '?'){
					ans *= 9;
				}else if (s.charAt(i) == '?'){
					ans *= 10;
				}
			}
			System.out.println(ans);
		}
	}
}