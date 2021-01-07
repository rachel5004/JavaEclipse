/*
 *   1. ���� Ÿ���� ���������� �ϳ��� ��� �����ϴ� ���
 *      =======  ======= �������� ������ �Ѱ��� �̸� ���� (����:�ε���)
 *                       arr[0],arr[1]
 *                          ===
 *                          �ε��� ��ȣ (�ε�����ȣ�� 0���� ����)
 *                          *** �迭�� �ε�����ȣ�� �ʰ��ϸ� �����߻� 
 *                              ArrayIndexOutOfBoundsException
 *      ����,�Ǽ�,���ڿ� 
 *   2. �迭 ���� 
 *      ������ 
 *        int[] arr; , int arr[];   
 *        ===== ===
 *        �迭���� �迭�� 
 *         arr
 *        ======
 *        
 *        ======
 *        ��)
 *             int[][] arr : �ڹ� => int[] arr[]
 *             int arr[][] : c���
 *             int arr[,] : c#
 *        
 *   3. �迭�ʱ�ȭ ==> �迭,Ŭ���� ==> ����Ǵ� ��ġ (heap) , �Ϲ� ������(����)
 *      int[] arr=new int[5];  ==> �޼ҵ�(���� ���) => ������ ���� 
 *                ===
 *                �����޸� �Ҵ� (�޸� ����)  ==> int ==> malloc(),free()
 *                                                    ========= =======
 *                    arr[0]  arr[1] arr[2] arr[3] arr[4] new      delete => GC
 *    ===arr===      =================================
 *      1000           100       0      0     0   500
 *    =========     |=======|======|=====|=====|======
 *                 1000
 *                 
 *                 arr[0]  arr[1] arr[2] arr[3] arr[4] => �Ϲݺ����� �����ϰ� ���
 *                 
 *                 ==> �б� , ���� 
 *                 ���� => arr[0]=100
 *                        arr[4]=500
 *                 �б� => System.out.println(arr[0])
 *                 
 *                 ��)
 *                     int[] arr=new int[5]; ���� ������ �˰� �ִ� ���
 *                     int[] arr;
 *                     arr=new int[5];  =========> �޸𸮿� ���������� 20byte�� ����� �޶� 
 *                                === ������ ���� (���尹���� �˼� ���� ���)
 *                     arr[0] 
 *                        === �����Ͱ� ����� ��ġ (�迭�� 0���� ����)
 *                        
 *           int[] score=new int[5];
 *           =====           ======
 *           
 *                          score[0]
 *                               ===
 *                               �迭�� �ε���(�迭÷��)
 *           ===score===   =======================================
 *                            0       0      0       0       0
 *           ===========   =======================================
 *                         =======
 *                         �迭�� ���
 */
public class �迭���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5};
        int[] temp=new int[10];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        
        for(int i=0;i<temp.length;i++)
        {
        	System.out.println(temp[i]);
        }
        
        System.out.println("=================================");
        int[] temp2=new int[10];
        for(int i=0;i<arr.length;i++)
        {
        	temp2[i]=arr[i];
        }
        
        for(int i=0;i<temp2.length;i++)
        {
        	System.out.println(temp2[i]);
        }
	}

}








