/*
 *    ���α׷� 
 *    ======
 *    �ʿ��� �����͸� ������ ����(����)
 *    ====================== ���� �ʿ�(�ʱⰪ) 
 *           �ʱⰪ 
 *             ������ ���� 
 *             class A
 *             {
 *                int mx=400,my=500;
 *                
 *                {
 *                   ����=>�ʱⰪ ���ؿ´� 
 *                }
 *                ������(){
 *                }
 *                void display(){
 *                }
 *             }
 *             ====================
 *             ���Ͽ� �б�(�ڵ� �α���)
 *             �����ͺ��̽�(id,pwd)
 *             ����
 *             ===================== ���� => �޼ҵ�{}
 *             => 1. ������ 
 *             => 2. {}
 *    �����͸� Ȱ�� 
 *    ����ڿ��� �����ش� 
 *    
 *    ����Ǵ� ���� 
 *    ==========
 *    1. �����  int a=10;
 *    2. �ʱ�ȭ �� {a=100;} => myBatis(�����ͺ��̽� ����) : XML,Annotation
 *              ����Ŭ ���� => �Խ��� (300��) => 20��
 *    3. ������ ������(){a=200}
 *    
 *     10 => 100 => 200
 *     ================
 *     
 *     Ŭ������ ����Ǵ� ���� 
 *     �ν��Ͻ����� int a;
 *     
 *     class A
 *     {
 *        int a; // 0
 *        
 *        {
 *           a=100; �ν��Ͻ� �ʱ�ȭ �� 
 *        }
 *     }
 *     
 *     class A
 *     {
 *        static int b; // 0
 *        
 *        static
 *        {
 *           b=200; static ��
 *        }
 *        
 *     }
 *     
 *     static,instance => ������
 *     
 *     Ŭ��������   static int a;
 *     
 *     JSP , MVC , Spring , MyBatis => Java��� ���̺귯�� 
 *     ================================================ ǥ��ȭ
 */
public class �ʱ�ȭ�� {
    int a=100;
    static int b=1000;
    int[] arr=new int[6];
    
    /////////////// �ڵ����� ȣ�� 
    {
    	a=200;
    	/*arr[0]=(int)(Math.random()*45)+1;
    	arr[1]=(int)(Math.random()*45)+1;
    	arr[2]=(int)(Math.random()*45)+1;
    	arr[3]=(int)(Math.random()*45)+1;
    	arr[4]=(int)(Math.random()*45)+1;
    	arr[5]=(int)(Math.random()*45)+1;*/
    	for(int i=0;i<6;i++)
    	{
    		arr[i]=(int)(Math.random()*45)+1;
    	}
    }
    
    static
    {
    	b=2000;
    }
    /////////////////
	/*
	 * �ʱ�ȭ��() { a=300; }
	 */
    // �ʱ�ȭ��() {  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        �ʱ�ȭ�� aa=new �ʱ�ȭ��();
        System.out.println("aa.a="+aa.a);
        System.out.println("aa.b="+aa.b);
        for(int i:aa.arr)
        {
        	System.out.println(i+" ");
        }
        
        /* Scope => ������� ���� ���� 
         * {
        	{
        		{
        			
        		}
        	}
        }*/
	}

}










