/*
 *   ���ù� : ���Ѱ��� ������ �� ��쿡 ó�� (�������ǹ�) => ���� ���� , ������ ���� 
 *   1-10
 *   11-20
 *   21-30
 *   31-40
 *   41-50   ==> case 1:
 *   ����)  switch(����,����,���ڿ�)
 *               ���� => 3
 *         switch(����)
 *         {
 *            case 1:
 *               ���๮�� 1;
 *               ���� �����Ŀ� ���� : break;
 *            case 2:
 *               ���๮�� 2;
 *               ���� �����Ŀ� ���� : break;
 *            case 3:
 *               ���๮�� 3;
 *               ���� �����Ŀ� ���� : break;
 *            default: ============> �������� 
 *               ���๮�� 4;
 *         }
 *         
 *         : ;
 *        switch(����)
 *        {   ���� = 'A'
 *            case 'A':
 *               ���๮�� 1;
 *               ���� �����Ŀ� ���� : break;
 *            case 'B':
 *               ���๮�� 2;
 *               ���� �����Ŀ� ���� : break;
 *            case 'C':
 *               ���๮�� 3;
 *               ���� �����Ŀ� ���� : break;
 *            default: ============> �������� 
 *               ���๮�� 4;
 *        }
 *        
 *        switch(���ڿ�)
 *        {
 *           case "�α���":
 *           case "ȸ������":
 *           case "��ȭ���":
 *           case "�󼼺���":
 *        }
 *        
 *        final int LOGIN=1
 *        
 *        case LOGIN:
 */
public class ���ù� {
    // 0.0 and less than 1.0. ==> 0.99
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int no=(int) (Math.random()*5) +1; // 1~5
        //     ===== ================= ==
        //       2         1           3
        //           (0.0~4.99999)
        //      0~4  ===> +1    1~5
        // 3
        switch(no)
        {
        case 3:
        	System.out.println("3�� ���õǾ����ϴ�");
        	break;
        case 1: // if(i==2)
        	System.out.println("2�� ���õǾ����ϴ�");
        	break;
        case 4:
        	System.out.println("4�� ���õǾ����ϴ�");
        	break;
        case 5:
        	System.out.println("5�� ���õǾ����ϴ�");
        	break;
        case 2: // if(i==2)
        	System.out.println("2�� ���õǾ����ϴ�");
        	break;
        }
        /*
         *    avg => 100~0
         *    avg/10 
         *    10,9 => A ,8 => B , 7=>C 6=> D default=>F
         *    switch(score)
         *    {
         *       case 10:   => if(score==10 || score==9)
         *       case 9:
         *         A 
         *         break;
         *       case 8:
         *         B
         *         break;
         *       case 7:
         *         C
         *         break;
         *       case 6:
         *         D
         *         break;
         *       default:
         *         F
         *    }
         */
	}

}











