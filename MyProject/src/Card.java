import java.util.*;
public class Card {
	public Card(String shape2, int num2) {
	}
	public Card() {
	}
	// member variable
	static String shape;
	static int num;
	static ArrayList<Card> deck;
	
	//생성자
	public abstract class CardDeck{
		public CardDeck() {
			deck = new ArrayList<Card>();
		}
		//세터(private로 설정된 멤버변수의 값을 설정)/게터(private로 설정된 멤버변수의 값을 리턴) 메소드
			public CardDeck(ArrayList<Card> setDeck) {
				deck = new ArrayList<Card>();
				deck = setDeck;
			}
			public CardDeck(String[] aShape, int[] aNum) {
				deck = new ArrayList<Card>();
				Card addCard = new Card();
				for (String shape:aShape) {
					for(int num:aNum) {
						addCard = new Card(shape, num);
						deck.add(addCard);
					}
				}
			}
			
			public void shuffle() {
				Collections.shuffle(deck);
			}
			public Card getOne() {
				Card rtnCard = null;
				if(deck.size()!=0) {
					rtnCard = deck.remove(0);
				}
				return rtnCard;
			}
			public int size() {
				return deck.size();
			}
			public boolean add(Card one) {
				return deck.add(one);
			}
		}
		public class Sutda extends CardDeck{
			private final String[] shape = {"광","피"};
			private final int[] num = {1,2,3,4,5,6,7,8,9,10};
			public Sutda() {
				super(shape,num);
			}
//필요한 메소드
// test case
	public class SutdaTest{
		public void main(String[] args) {
			Sutda sd = new Sutda();
			System.out.println(sd);
			sd.shuffle();
			System.out.println(sd);
			int cardSize = sd.size();
			System.out.println("card size"+cardSize);
			Card one = sd.getOne();
			System.out.println(one);
			cardSize = sd.size();
			System.out.println("card size"+cardSize);
		}
	}

}
