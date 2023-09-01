import java.io.*;
import java.util.*;
public class BlankSpace {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner scann = new Scanner(System.in);
		int testcasse = scann.nextInt();
		while(testcasse-- > 0){
			int a = scann.nextInt();			
			int result = 0;
			int opr = 0;

			for(int z = 0; z < a; z++){
				int inn = scann.nextInt();

				if(inn == 0){
					opr++;
				}
				if(inn == 1 || z == a-1){
					result = Math.max(opr, result);
					opr = 0;
				}
			}
			System.out.println(result);
		}
	}
}