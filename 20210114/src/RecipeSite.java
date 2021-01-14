import java.io.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class RecipeSite {
	public Recipe[] recipeAllData() {
		Recipe[] recipe = new Recipe[146854];
		StringBuffer data = new StringBuffer();
		try {
			FileReader fr = new FileReader("C:\\javaDev\\recipe.json");
			int i = 0;
			while((i=fr.read())!=-1) {   //-1 = 파일의 끝(EOF,BOF)
				data.append(String.valueOf((char)i));
			}
			fr.close();
			
			String json = data.toString();
			JSONParser parser = new JSONParser();
			JSONObject re =  (JSONObject)parser.parse(json);
			JSONArray arr= (JSONArray)re.get("recipe");
//			System.out.println("arr="+arr);
//			System.out.println(arr.size());
			
			for(i=0;i<arr.size();i++) {
				JSONObject obj = (JSONObject)arr.get(i);
				recipe[i]=new Recipe();
				
				String a=(String)obj.get("no");
				recipe[i].setNo(Integer.parseInt(a));
//				recipe[i].setNo((Integer)obj.get("no"));
				recipe[i].setTitle((String)obj.get("title"));
				recipe[i].setChef((String)obj.get("chef"));
				recipe[i].setPoster((String)obj.get("poster"));
				recipe[i].setLink((String)obj.get("link"));
				
			}
		}catch(Exception ex){}
		return recipe;
	}
	public static void main(String[] args) {
		RecipeSite rs =  new RecipeSite();
//		String data = rs.recipeAllData();
//		System.out.println(data);
		Recipe[] recipe = rs.recipeAllData();
		for (Recipe r:recipe) {
			System.out.println("=================레시피 목록================");
			System.out.println("번호: "+r.getNo());
			System.out.println("제목: "+r.getTitle());
			System.out.println("작성자: "+r.getChef());
			System.out.println(r.getHit());
			System.out.println("===================================");
		}
		
	}

}
