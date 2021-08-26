package lesson;

public class CustomerManager {

	public static void main(String[] args) {

		CustomerCard[] cards = new CustomerCard[100];

		cards[0] = new CustomerCard(1001, "山田太郎", "東京都", 26.5);

		cards[1] = new CustomerCard(1002, "佐藤花子", "神奈川県", 24.5);

		cards[2] = new CustomerCard(1003, "鈴木健二", "茨城県", 26.0);

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
