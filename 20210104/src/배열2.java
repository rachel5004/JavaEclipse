
public class 배열2 {

	public static void main(String[] args) {
		String[] title={"원더우먼 1984","라라랜드","화양연화 리마스터링","뱅가드","비긴 어게인",
		        "(월간클래식) 레전더리 콘서트 레너드 번스타인","굿바이"}; // new String[]는 생략이 가능 
		String[] genre={"액션, 어드벤처","드라마, 뮤지컬, 로맨스, 멜로",
		        "드라마, 로맨스, 멜로","액션","로맨스, 멜로","정보없음","드라마"};
		String[] grade={"12세 이상","12세 이상","15세 이상","12세 이상","15세 이상","정보없음","12세 이상"};
		String[] director={"패티 젠킨스","다미엔 차젤레","왕가위","당계례","존 카니","정보없음","타키타 요지로"};
		String[] actor={"갤 가돗 ,  크리스 파인 ,  크리스틴 위그 ,  페드로 파스칼",
		       "라이언 고슬링 ,  엠마 스톤",
		       "장만옥 ,  양조위",
		       "성룡 ,  양양",
		       "키이라 나이틀리 ,  마크 러팔로 ,  애덤 리바인 ,  헤일리 스테인펠드",
		       "정보없음",
		       "모토키 마사히로 ,  히로스에 료코 ,  야마자키 츠토무 ,  요 키미코"};
		System.out.println("=========영화정보=========");
		for (int i = 0; i< title.length;i++) {
			System.out.println("영화명:"+title[i]);
			System.out.println("감독:"+director[i]);
			System.out.println("출연:"+actor[i]);
			System.out.println("장르:"+genre[i]);
			System.out.println("등급:"+grade[i]);
			System.out.println("=======================");
		}
			
	}
}
