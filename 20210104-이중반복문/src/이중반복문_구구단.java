/*
 *    2*1=2   =======   9*1=9  가로 8 ==> 이차 for
 *    
 *    
 *    2*9=18  =======   9*9=81
 *    세로 9 ==> 일차 for
 *    
 *    구구단 , 페이지나누기
 *    (이중 for) (1차 for)  => 반복문 (if)
 */
public class 이중반복문_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=9;i++) //줄수 
        {
        	for(int j=2;j<=9;j++)
        	{
        		System.out.print(j+"*"+i+"="+i*j+"\t");
        		// \t => 일정 간격
        	}
        	System.out.println();
        }
	}

}
