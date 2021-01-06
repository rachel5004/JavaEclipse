
public class lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45+1);
		}
		for(int i:lotto) {
			System.out.print(i+" ");
			try {
				Thread.sleep(500);
			}catch(Exception ex) {}
		}

	}

}
