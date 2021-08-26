package lesson;

public class CustomerManager {

	public static void main(String[] args) {
	
		CustomerCard[] cards = new CustomerCard[100];
		
		cards[0] = new CustomerCard();
		cards[0].id = 1001;
		cards[0].name = "山田太郎";
		cards[0].address = "東京都";
		cards[0].shoeSize = 26.5;
		
		cards[1] = new CustomerCard();
		cards[1].id = 1002;
		cards[1].name = "佐藤花子";
		cards[1].address = "神奈川県";
		cards[1].shoeSize = 24.5;
		
		cards[2] = new CustomerCard();
		cards[2].id = 1003;
		cards[2].name = "鈴木健二";
		cards[2].address = "茨城県";
		cards[2].shoeSize = 26.0;
		
		
		for(int i =0; i < 100; i++) {
			if(cards[i] == null) {
				break;
			}
			
			System.out.println(i + "番目の顧客カードの記載の情報");
			System.out.println("ID" + cards[i].id);
			System.out.println("氏名" + cards[i].name);
			System.out.println("住所" + cards[i].address);
			System.out.println("靴のサイズ" + cards[i].shoeSize);
			System.out.println("===================");
		}
	}

}
