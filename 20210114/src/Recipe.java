/*	  "no": 1,
	  "title": "������縮������ ����¹� ~",
	  "poster": "https://recipe1.ezmember.co.kr/cache/recipe/2020/12/14/340a26d592d68c43757cd03e79596e231_m.jpg",
	  "chef": "�ູ�ѹ̴Ϲ̴ϸ�",
	  "link": "/recipe/6948372",
	  "hit": "��ȸ�� 119"
	  
	  ĸ��ȭ 
	  =====
	    ���������� 
	    ***private : �ڽ��� Ŭ���������� ������ ���� 
	    ***default : private+���� �������� ������ ���� 
	    protected :  private+default+�ٸ� ���� => ���
	    ***public :  ��� Ŭ�������� ������ ���� 
	    *
	    ===========================================
	    Ŭ���� , �޼ҵ� => ��� Ŭ������ ���� : public
	    ���� (�������) : private 
	    
	    
	    ���� => ������ �� �ִ� �޸� ���� 
	    ===
	     �⺻�������� => �Ѱ��� ����  
	     �迭       => ���� Ÿ���� ������ ����
	     Ŭ����     => �ٸ� Ÿ���� ����� ���� 
 */
// ĸ��ȭ �ڵ� 
public class Recipe {
	private int no;
	private String title, poster, chef, link, hit;
	
	// ���� ���ͷ� ������ ����� �޼���� ����(source-getter/setter)
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getChef() {
		return chef;
	}

	public void setChef(String chef) {
		this.chef = chef;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

}
