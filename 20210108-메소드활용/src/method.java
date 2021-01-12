
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
		
//		System.out.println("정렬전");
//		for (int i:arr) System.out.print(i+" ");
//		
//		System.out.println("\n정렬후(ASC)");
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
//		System.out.println("\n정렬후(DESC)");
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
		
		System.out.println("정렬전");
		print(arr);
		System.out.println("\n정렬후(ASC)");
		asc(arr);
		print(arr);
		System.out.println("\n정렬후(DESC)");
		desc(arr);
		print(arr);
	}

}
