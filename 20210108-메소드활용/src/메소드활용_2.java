// 학점을 계산 메소드 만들기 
// replaceAll("[^가-힣]","")
//  [^0-9] [^A-Za-z]
import java.util.Scanner;
public class 메소드활용_2 {
	// 반복을 제거 
    static int input(String subject)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(subject+" 점수 입력:");
    	return scan.nextInt();
    }
    // 학점을 구하는 메소드 (다음 다시 사용) : 재사용 
    static char hakjum(int avg)
    {
    	char score='A';
    	switch(avg)
        {
        case 10:
        case 9:
        	score='A';
        	break;
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        default:
        	score='F';
        }
    	return score;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor,eng,math;
        char score='A';
        // 사용자가 입력 
        /*Scanner scan=new Scanner(System.in);
        System.out.print("국어 점수 입력:");
        kor=scan.nextInt();
        System.out.print("영어 점수 입력:");
        eng=scan.nextInt();
        System.out.print("수학 점수 입력:");
        math=scan.nextInt();*/
        kor=input("국어");
        eng=input("영어");
        math=input("수학");
        
        // 학점 
        int avg=(kor+eng+math)/30;
        score=hakjum(avg);// 메소드는 호출 => 메소드 처음부터 실행 => 결과값을 넘겨주고 다음문장으로 이동
        /*switch(avg)
        {
        case 10:
        case 9:
        	score='A';
        	break;
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        default:
        	score='F';
        }*/
        
        System.out.println("국어:"+kor);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+math);
        System.out.println("총점:"+(kor+eng+math));
        System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
        System.out.println("학점:"+score);
	}
    
}










