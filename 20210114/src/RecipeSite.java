import java.io.*;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RecipeSite {
    public Recipe[] recipeAllData(int page){  //instance method
    	Recipe[] recipe=new Recipe[10];
    	StringBuffer data=new StringBuffer();
    	try {
    		FileReader fr=new FileReader("c:\\javaDev\\recipe_data.json");
    		int i=0;
    		while((i=fr.read())!=-1) {  //-1 = ������ ��(EOF,BOF)

    			data.append(String.valueOf((char)i));
    		}
    		fr.close();
    		
    		String json=data.toString();
    		JSONParser parser=new JSONParser();
    		// class JSONObject extends Object
    		//JSONObject re=(JSONObject)parser.parse(json);
    		//System.out.println("re="+re);
    		// JSONArray  extends Object
    		JSONArray arr=(JSONArray)parser.parse(json);
    		System.out.println(arr.size());
    		int j=0;
    		int pagecnt=(page*10)-10;
    		for(i=0;i<arr.size();i++) {
    			if(j>10)break;
    			if(j<10 && i>=pagecnt)
    			{
	    			JSONObject obj=(JSONObject)arr.get(i);
	    			recipe[j]=new Recipe();
	    			String a=String.valueOf(obj.get("no"));
	    			recipe[j].setNo(Integer.parseInt(a));
	    			recipe[j].setTitle((String)obj.get("title"));
	    			// 1.Ŭ���� ����ȯ , ����ó�� , ���̺귯��(����ȭ)
	    			recipe[j].setChef((String)obj.get("chef"));
	    			//recipe[i].setPoster((String)obj.get("poster"));
	    			recipe[j].setLink((String)obj.get("link"));// setxxx() ����:�޸𸮿� ���� 
	    			recipe[j].setHit((String)obj.get("hit"));
	    			j++;
    			}
    		}
    		
    	}catch(Exception ex){}
    	
    	return recipe;
    }
	public static void main(String[] args) {
		try {
			Scanner scan=new Scanner(System.in);
			System.out.print("������ �Է�:");
			int page=scan.nextInt();
			RecipeSite rs=new RecipeSite(); // recipeAllData()�� ����ȴ� 
			Recipe[] recipe=rs.recipeAllData(page);
			System.out.println("====================== ������ ��� =======================");
			for(Recipe r:recipe) {
				System.out.println("��ȣ:"+r.getNo());// �޸� ���� �о� �ö� getXxx() => �޼ҵ带 �̿��ؼ� ��� 
				System.out.println("����:"+r.getTitle());
				System.out.println("����:"+r.getChef());
				System.out.println(r.getHit());
				System.out.println(r.getLink());
				System.out.println("========================================================");
			}
			System.out.print("���� ��ǰ ���� ��ȣ:");
			int num=scan.nextInt();
			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "+"https://www.10000recipe.com/"+recipe[num-1].getLink());
		}catch(Exception e) {}
	}

}











