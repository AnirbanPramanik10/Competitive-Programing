import java.io.*;
import java.util.*;
public class ArrayCloningTechnique {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
			Scanner sc = new Scanner(System.in);
			int testcase = sc.nextInt();
			while(testcase-- > 0){
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();

				if(a+b >= 10 || a+c >= 10 || b+c >= 10){
					System.out.println("YES");
				}else{
					System.out.println("NO");
				}
     	  
     	}	
	}
}