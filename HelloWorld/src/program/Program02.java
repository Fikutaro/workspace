package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Program02 {
	public static void main(String[] args) throws IOException {
		System.out.print("▲すごろく▼\n");
		System.out.print("30マス先にゴールがあります。\n");
		System.out.print("1,2,3の３つの目を持つ特別なサイコロ10個を、\n");
		System.out.print("好きな数だけ振って駒を進めます。\n");
		System.out.print("ぴったり上がりに止まれば終わりです。目の数が\n");
		System.out.print("多ければ、余った目の数だけ戻ります。\n");
		System.out.print("----------------------------------------------\n");

		Random RandObj = new Random(); // 乱数オブジェクト
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int dice;
		int p;
		int diceAmount;

		do {
			int masu = 0;
			for (int turn = 1;; turn++) {
				for (int i = 0; i < masu; i++) {
					System.out.print("_");
				}
				System.out.print("▲");
				for (int n = 0; n < 30 - masu; n++) {
					System.out.print("_");
				}
				System.out.println("|上がり！");
				int nokori = (30 - masu);
				while (true) {
					System.out.println("残り" + nokori + "マスです。サイコロの数は？");
					 diceAmount = Integer.parseInt(br.readLine());
					if (diceAmount <= 10) {
						break;
					}else {
						System.out.println("サイコロの数は10個まで。");
					}
				}
				int diceTotal = 0;
				for (int m = 0; m < diceAmount; m++) {
					dice = RandObj.nextInt(3) + 1;
					diceTotal += dice;
				}
				System.out.println("出た目の合計" + diceTotal);
				masu += diceTotal;
				if (masu > 30) {
					masu = 30 - (masu - 30);
				}
				if (masu == 30) {
					System.out.println("おめでとう！！" + turn + "回目で上がりです");
					break;
				}
			}
			System.out.println("もう一度？ 1=yes 0=NO");
			p = Integer.parseInt(br.readLine());
		} while (p != 0);
	}
}
