// ������ ���ڿ��� �����Ŀ� A,a�� ����� ���θ� Ȯ�� 
public class ����22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="AbceasdwfrttAAdfsfa";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
        	char c=s.charAt(i);
        	if(c=='A' || c=='a')
        		count++;
        	
        }
        System.out.println("A�� a�� ����:"+count);
	}

}
