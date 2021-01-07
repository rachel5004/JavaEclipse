// 빈도수 구하기 
// word cloud
/*
 *    정수 : 0~9 사이의 난수 ===> 100
 */
public class 배열활용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 100를 저장 할 수 있는 저장 공간 
		int[] arr=new int[100];
		int[] count=new int[10];
		// 값을 입력 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10);//0~9
		}
		// 빈도수 확인 0~9
		// 00112233555 
		for(int i:arr)
		{
			System.out.println("i="+i);
			count[i]++;
		}
		// 출력 
		for(int i:arr)
		{
			System.out.print(i);
		}
		
		System.out.println("\n===== 최종 결과 =====");
		String s="";
		for(int i=0;i<count.length;i++)
		{
			for(int j=0;j<count[i];j++)
			{
				s+="*";
			}
			System.out.println(i+":"+s);
			s="";
		}
		System.out.println("===== 추천 =====");
		int max=0;
		for(int i=0;i<count.length;i++)
		{
			if(max<count[i])
			{
				max=count[i];
			}
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(max==count[i])
			{
				System.out.println(i+":"+count[i]);
			}
		}
	}

}












