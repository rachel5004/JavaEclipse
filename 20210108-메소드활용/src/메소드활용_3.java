
public class �޼ҵ�Ȱ��_3 {
	// void => ������� �������� �ʴ´� (�޼ҵ忡�� ���)
    static void aMethod()
    {
    	System.out.println("aMethod ȣ�� ����...");
    	System.out.println("aMethod ��� ó��...");
    	System.out.println("aMethod ����...");
    }
    static void bMethod()
    {
    	System.out.println("bMethod ȣ�� ����...");
    	System.out.println("bMethod ��� ó��...");
    	System.out.println("bMethod ����...");
    }
    static void cMethod()
    {
    	System.out.println("cMethod ȣ�� ����...");
    	System.out.println("cMethod ��� ó��...");
    	System.out.println("cMethod ����...");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("main ����..."); //1
        aMethod();// 
        aMethod();//
        bMethod();
        cMethod();
        System.out.println("main ����...");
	}

}








