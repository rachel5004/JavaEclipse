import java.io.*;
import java.util.*;

public class Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		System.out.println(func(n));
	}
	public static int func(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n*func(n-1);
		}
	}
}
