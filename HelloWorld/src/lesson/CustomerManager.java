package lesson;

public class CustomerManager {

	public static void main(String[] args) {

		CustomerCard[] cards = new CustomerCard[100];

		cards[0] = new ShoeShopCustomerCard( "山田太郎", "東京都", 26.5);

		cards[1] = new ShoeShopCustomerCard("佐藤花子", "神奈川県", 24.5);

		cards[2] = new ShoeShopCustomerCard("鈴木健二", "茨城県", 26.0);
		
		cards[3] = new HatShopCustomerCard("渡辺進", "東京都", 57.0);

		for (int i = 0; i < 100; i++) {
			if (cards[i] == null) {
				break;
			}

			System.out.println(i + "番目の顧客カードの記載の情報");
			cards[i].printInfo();
			System.out.println("====================");
		}

	}
}
