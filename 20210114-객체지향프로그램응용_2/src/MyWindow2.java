import javax.swing.*;
public class MyWindow2 {
    JFrame f=new JFrame();// has-a
    public MyWindow2() {
		f.setSize(640, 480);
		f.setVisible(true);
	}
	public static void main(String[] args) {
        MyWindow2 m=new MyWindow2();
	}

}
