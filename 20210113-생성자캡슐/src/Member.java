import java.io.*;// inputStream / outputStream => ����� 
// ���ϸ��� �߸��Է��� ��� => ������ ���� (����ó��)
public class Member {
    String name; // ���� (���� �б�,���(X))
    String sex;
    String addr;
    String tel;
    Member(){
    	// ������ �о ����
    	try {
    	  FileReader fr=new FileReader(new File("c:\\javaDev\\member.txt"));
    	  String data="";
    	  int c=0;
    	  // fr.read() : ���Ͽ� �ִ� �����͸� 1���ھ� �о�´� , ������ �д´�
    	  // -1 : EOF(������ ��)
    	  while((c=fr.read())!=-1)
    	  {
    		  data+=String.valueOf((char)c);
    	  }
    	  fr.close();
    	  System.out.println(data);
    	  String[] s=data.split(",");// ���й��ں��� �и��ϴ� �޼ҵ� 
    	  name=s[0];
    	  sex=s[1];
    	  addr=s[2];
    	  tel=s[3];
    	  
    	}catch(Exception ex) {}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m=new Member();
        System.out.println("�̸�:"+m.name);
        System.out.println("����:"+m.sex);
        System.out.println("�ּ�:"+m.addr);
        System.out.println("��ȭ:"+m.tel);
	}

}
