/*
 *    ���׿����� 
 *    ����) 
 *          ���� ? ��1 : ��2
 *          ===
 *          true ==> ��1
 *          false ==> ��2
 *          
 *          ������� �˼� ���� 
 *          
 *          boolean bCheck=(����)?true:false
 *          char c=(����)?'A':'B'
 *          int i=(����)?0:1
 *          String s=(����)?"����":"����"
 *          double d=(����)?0.0:10.0
 *          
 *          /// ������� ���� => ���������� , �񱳿�����,��������  ==> boolean 
 *          ��� => int+int , int+double
 *          
 */
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='K';
        boolean bCheck=c>'A'?true:false;
        System.out.println(bCheck);
        
        int a=33;
        String s=a%2==0?"¦��":"Ȧ��";
        System.out.println("a="+s);
        
        int num=1;
        char sex=num==1 || num==3?'��':'��';
        // char,int long,float,double
        System.out.println("����:"+sex);
        
        sex='��';
        int no=sex=='��'?1:2;
        // int,long,float , double
        System.out.println("�ֹι�ȣ ���ڸ� ù��°��:"+no);
        
        
	}

}










