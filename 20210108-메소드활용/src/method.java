
public class method {
	static int[] asc(int[] arr) {
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	static int[] desc(int[] arr) {
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	static void print(int[] arr) {
		for (int i:arr) System.out.print(i+" ");
	}
	static int[] sort(int[] arr, String type) {
		
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(type.equals("asc")) {
					if(arr[i]>arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
				else {
					if(arr[i]<arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {30,20,50,10,40};
		
//		System.out.println("������");
//		for (int i:arr) System.out.print(i+" ");
//		
//		System.out.println("\n������(ASC)");
//		for (int i=0;i<arr.length-1;i++) {
//			for (int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for (int i:arr) System.out.print(i+" ");
//		
//		System.out.println("\n������(DESC)");
//		for (int i=0;i<arr.length-1;i++) {
//			for (int j=i+1;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		for(int i:arr) System.out.print(i+" ");
		
		System.out.println("������");
		print(arr);
		System.out.println("\n������(ASC)");
		asc(arr);
		print(arr);
		System.out.println("\n������(DESC)");
		desc(arr);
		print(arr);
	}

}
