class A
{
	int age=10;
}
class B
{
	void display(A b)
	{
		b.age=100;
	}
	void display2(int[] arr)
	{
		System.out.println("display2:arr="+arr);
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
	}
}
public class MainClass2 {

	public static void main(String[] args) {
        A a=new A();
        /*
         *   a ==> age(50)
         */
        System.out.println("a.age="+a.age);
        // ���� 
        a.age=50;
        System.out.println("a.age="+a.age);
        
        B b=new B();
        b.display(a);
        
        System.out.println("a.age="+a.age);
        // A b=a => Call By reference
        
        int[] arr=new int[3];// 0 0 0
        System.out.println("arr="+arr);
        b.display2(arr);// 10 20 30
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        /*
         *    �Ű����� ���۹� 
         *    Call By Value => �Ű������� �⺻���� ��� (int,long...) => ���纻 
         *    Call By Reference => �Ű������� �迭 , Ŭ�����϶� ��ü�� ���� => ����
         */
        
	}

}







