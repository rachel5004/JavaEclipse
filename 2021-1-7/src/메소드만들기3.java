import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 메소드만들기3 {
//	static boolean login(String id, String pwd) {
//		String userID = "";
//		String userPWD = "";
//		if(userID.equals(id)&&userPWD.equals(pwd))
//			return true;
//		else return false;		
//	}
//	static String find(String title) {
//		String[] song = {};
//		String[] singer = {};
//		String res = null;
//		for(int i=0;i<song.length;i++) {
//			if(song[i].equals(title)) {
//				res =  singer[i];
//			}
//		}
//		return res;
//		
//	}
//	static int[] sort(int[] arr) {
//		Arrays.sort(arr);
//		return arr;
//	}
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
		
		genie();
	}

}
