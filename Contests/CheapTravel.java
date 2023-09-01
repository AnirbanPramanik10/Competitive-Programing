import java.io.*;
import java.util.*;
public class CheapTravel {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//6  //5
			int m = sc.nextInt();//2  //2
			int a = sc.nextInt();//1  //2
			int b = sc.nextInt();//2  //3

			if(m*a>b){
				int res = (n%m)*a;
				if(res>b){
					System.out.println((n/m)*b + b);
				}else{
					System.out.println((n/m)* b + res);
				}
			}else{
				System.out.println(n*a);
			}
			
		}
}