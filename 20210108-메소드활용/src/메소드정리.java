
public class �޼ҵ����� {

	public static void main(String[] args) {
		int[] arr = {30,20,50,10,40};
		System.out.println("������");
		for (int i:arr) System.out.print(i+" ");
		
		System.out.println("\n������(ASC)");
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for (int i:arr) System.out.print(i+" ");
		
		System.out.println("\n������(DESC)");
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int i:arr) System.out.print(i+" ");
	}

}
