import java.util.*;
import java.io.*;

// ���� (1~100���� ���� �߻�)
//up-down

public class randomgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int randomNum = (int)(Math.random()*100)+1; // Math.random() => 0.0 ~ 0.99
		while (true){
			int num = sc.nextInt();
			if (num > randomNum) {
				System.out.println("down");
			}
			else if (num < randomNum) {
				System.out.println("up");
			}
			else {
				System.out.println("������ϴ�");
				break;
			}
		}

	}

}
