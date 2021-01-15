import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *   1. ����ڷκ��� ID,Password�� �޾Ƽ� �α��� ó�� => ������� true/false
 *      �޼ҵ�� => login
 *      ������ �޼ҵ��(�Ű�����...)
 *      boolean login(String id,String pwd) => login("","")
 *      
 *      boolean bCheck=login("","");
 *      
 *   2. �˻� => �뷡������ ����ڷ� ���� �޾Ƽ� �������� ������� ��� 
 *      find()
 *      ==> String find(String title)
 *      String singer=find("")
 *   3. 5������ ����ڷκ��� �޾Ƽ� ������ ������� �ٽ� ���� 
 *      int[] sort(int[] arr) 
 *      int[] aaa={3,6,5,7,1}
 *      int[] arr=sort(aaa);
 *      *** ���̺귯������ �����ϴ� �޼ҵ���� Ű���尡 �ƴϴ� ...
 *      ������ : 
 *      �Ű����� :
 *      ========================== �⺻�������� , ������������(�迭,Ŭ����)
 *   4. �޼ҵ� ����� ���� : �и� => �ҽ��� ������ ó�� (���õ� ������ ��Ƽ� �����) : ������ , ����
 *      ===== �������� 
 *      
 *      ����� �����ִ� �� (�Ű�����)
 *      ������� �ִ� ��� (������) 
 *   5. �޼ҵ尡 ���ᰡ �ɶ� return�� ��� 
 *      void => return�� ������ �� �ִ� => JVM�� �ڵ����� ÷��  
 *      
 *      ==> int[] arr={};
 *          int[] arr=new int[]{}
 *          
 *      https://www.genie.co.kr/chart/top200
 *      
 *      <td class="info">
                                    
               <a href="#" class="title
 */
public class �޼ҵ常���4{
    static void genie()
    {
    	try
    	{
    		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
    		Elements title=doc.select("td.info a.title");
    		for(int i=0;i<title.size();i++)
    		{
    			System.out.println(title.get(i).text());
    		}
    	}catch(Exception ex) {}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       genie();
	}

}























