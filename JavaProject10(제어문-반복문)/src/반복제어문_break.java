/*
 *   break : �ݺ���(while,do~while,for) , switch : �ݺ����� ���� 
 *           break => ���ѷ��� (while)
 */
public class �ݺ����_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i���� ��� => 1�������� 100���� 
        for(int i=1;i<=100;i++) //�ݺ� Ƚ���� 100
        {
        	
        	if(i==10)
        		break;// �ݺ� �ߴ��Ѵ� ==> for�� �ߴܵȴ�
        	System.out.println("i="+i);
        }
	}

}
