/*
 *    1~100���� ���� , 3�ǹ�� ��, 5�ǹ�� ��, 7�ǹ���� ���� ��� 
 *    1-2+3-4+5-6+7-8+9-10  ��
 */
public class �ݺ���_doWhile3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1;
        int a3=0,a5=0,a7=0,sum=0;
        //  a3=3�ǹ�� , a5=5�ǹ�� a7=7�ǹ�� 
        do 
        {
            sum+=i;//����
            
            if(i%3==0) // 3�� ��� 
            	a3+=i;
            if(i%5==0) // 5�� ��� 
            	a5+=i;
            if(i%7==0) // 7�� ���
            	a7+=i;
            i++;
        }while(i<=100);
        System.out.println("����:"+sum);
        System.out.println("3�ǹ�� ��:"+a3);
        System.out.println("5�ǹ�� ��:"+a5);
        System.out.println("7�ǹ�� ��:"+a7);
        // 1-2+3-4+5-6+7-8+9-10 ���� 
        // Ȧ�� : +
        // ¦�� : -
        i=1;
        sum=0;
        do {
        	 if(i%2==0)
        		 sum-=i;
        	 else
        		 sum+=i;
        	 i++;
        }while(i<=10);
        System.out.println("��:"+sum);
        
        i=1;
        sum=0;
        do
        {
           sum = (sum + i) * -1;
		   i++;
        }while(i<=10);
        System.out.println("��:"+sum);

	}

}
