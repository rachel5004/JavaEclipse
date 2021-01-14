
public class Recipe {
	private int no;
	private String title, poster, chef, link, hit;
	
	// 게터 세터로 변수는 숨기고 메서드로 접근(source-getter/setter)
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

	public void setHint(String hit) {
		this.hit = hit;
	}

}
