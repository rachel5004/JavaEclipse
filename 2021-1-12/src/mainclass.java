class music{
	String title, singer;
	void print() {
		System.out.println("노래명: "+ title);
		System.out.println("가수명: "+ singer);
	}
}
class data{
	int x = 10;
	int y = 20;
}
class datasend{

	void swap(int x, int y) {
		int tmp = x;
		x=y;
		y=tmp;
		System.out.println(x+" "+y);
	}
	void swap(int[]arr) {
		int tmp = arr[0];
		arr[0]=arr[1];
		arr[1]=tmp;
		System.out.println(arr[0]+" "+arr[1]);
	}
	void swap(data d) {
		int tmp = d.x;
		d.x=d.y;
		d.y=tmp;
		System.out.println(d.x+" "+d.y);
	}
}
public class mainclass {
	public static void main(String[] args) {
		music m1 = new music();
		m1.title="aaa";
		m1.singer="bbb";
		
		music m2 = new music();
		m2.print();
		
		music m3 = m1;
		m3.print();
		
		int x=10, y=20;
		System.out.println(x+" "+y);
		datasend ds = new datasend();
		ds.swap(x, y);
		
		int[] arr = {1,2};
		ds.swap(arr);
		
		data d = new data();
		ds.swap(d);
		
	}

}
