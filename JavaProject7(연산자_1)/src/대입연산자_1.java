/*
 *    대입 연산자 ( = )
 *    복합 대입연산자 ( += , -= , *= , /= , %= , <<= , >>=,
 *                  &= , |= , ^= )
 *                 => 논리연산자 , 비교연산자는 제외
 *                 
 *    문자열 비교 => equals
 *    
 *    int a=10;
 *    a++
 *    
 *    int a=10,b=20;
 *    a+b
 *    
 *    (조건)?값1:값2
 *    
 *    int + long + double
 *    ==========
 *       1
 *             ===========
 *                 2
 *                 
 *     1. int + long 
 *        ===
 *        long =============> long+long=>long
 *        
 *     2. long + double
 *        =====
 *         double  ===> double+double=double
 *         
 *     =============================================
 *     대입 연산자 : 값을 대입 
 *                 1. 초기화 
 *                    int a=10; 10을 a라는 메모리 공간에 대입해라 
 *                    ====>
 *                    <==== 대입연산자는 뒤에서부터
 *                 2. 연산결과를 대입 
 *                    int a=10+20
 *                          ====== 연산처리 (결과가 어떤 데이터형인지?)
 *                          double d = int + double
 *    복합 대입연산자 : 연산자가 두개가 합쳐서 한개의 연산자를 만들었다 
 *                   += , -= , *= , /= ... op=
 *                   
 *                   예) 
 *                      int a=10;
 *                      a+=1; =================> a=a+1 
 *                         한개를 증가하는 방법 
 *                         ++a
 *                         a++
 *                         a+=1
 *                         a=a+1
 *                         ======
 *                      ============> a=11
 *                      int a=10;
 *                      a+=5;  ===> a=a+5 ==> a=15
 *                      
 *                      
 *                      int a=10;
 *                      a-=5; a=a-5 => a=5
 *                      
 *                      int a=10;
 *                      a*=5; a=a*5 => a=50
 *                      
 *                      int a=10;
 *                      a/=2; a=a/2 => a=5
 *                      
 *                      ==================
 *                      int a=11;
 *                      a%=2; a=a%2; a=1;
 *                      
 *                      10%3 ==> 1    ==> 0,1,2
 *                      12%3 ==> 0
 *                      13%3 ==> 1
 *                      14%3 ==> 2
 *                      ==================
 *                      
 *                      int a=10;
 *                      a<<=3; =======> a=a<<3   10*2^3 ==> 10*8=80
 *                      1010(000)  ==> 1010000
 *                                     64+16 ==> 80
 *                                     
 *                      int a=10;
 *                      a>>=3; =======> a=a>>3   10/2^3 ==> 1
 *                      10 = 1010 => 뒤에서부터 3개를 버린다 ==> 1
 *                      
 *                      &= , |= , ^=
 *                      +=, -=
 *                      
 */
public class 대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        System.out.println("a="+a);//a=10 
        a+=5;
        // 증가후에 출력 => a=a+5
        System.out.println("a="+a);// a=15
        
        a=10;
        System.out.println("a="+a);// 10
        a-=5;// 감소 => a=a-5 ==> a=10-5 => a=5
        System.out.println("a="+a);
        
        a=10;
        System.out.println("a="+a);
        a*=3; // a=a*3 ==> a=10*3 ==> A=30
        System.out.println("a="+a);
        
        a=10;
        System.out.println("a="+a);
        a/=2; // a=a/2 ==> a=10/2 ==> a=5
        System.out.println("a="+a);
        
        a=10;
        System.out.println("a="+a);
        a%=3; // a=a%3  ==> a=10%3  ==> a=1
        System.out.println("a="+a);
        
	}

}







