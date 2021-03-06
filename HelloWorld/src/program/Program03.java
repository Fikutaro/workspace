package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Program03 {
	public static void main(String[] args) throws IOException {
		System.out.print("最初に１枚カードが出ますから掛け金を決めてください。\n");
		System.out.print("次に出るカードが前のカードと同じか大きければ、あなたの勝ちです。\n");
		System.out.print("掛け金が戻りますから、続けるかどうかを決めてください。\n");
		System.out.print("続けて勝てば掛け金は２倍になります。\n");
		System.out.print("以降、４倍、８倍と戻るお金が増えます。ただし、負けるとそれまでの勝ちは なくなります。\n");
		System.out.print("所持金が無くなって破産するか、1000$を超えるとゲーム終了です。\n");
		System.out.print("----------------------------------------------\n");
		System.out.print("ゲームを開始します。所持金は100$です。\n");
		Random RandObj = new Random(); // 乱数オブジェクト
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int money = 100;
		int bet = 0;
		int reply;
		int dealer;
		int player;
		int rate = 1;

		do {
			System.out.println();
			System.out.println("最初のカードです。");
			dealer = RandObj.nextInt(10) + 1;
			System.out.println("|"+ dealer +"|");
			while (true) {
				System.out.println("いくら賭けますか？(1~"+ money +"$)");
				bet = Integer.parseInt(br.readLine());
				if (bet <= money) {
					break;
				}else {
					System.out.println("所持金以上は賭けられません。");
				}
			}
			money -= bet;
			rate = 1;

			do { 
				player = RandObj.nextInt(10) + 1;
				System.out.println("|"+ player +"|");
				if(player >= dealer) {
					System.out.println("あなたの勝ち。");
					System.out.println( bet + "$の勝ちです。");
					rate *= 2; 
					System.out.println("倍率は"	+ rate + "倍。続けますか？（1=Yes; 0=No!）");
					reply = Integer.parseInt(br.readLine());
					if (reply == 0) {
						money += bet;
					}
					bet *= 2;
				}else {
					System.out.println("あなたの負け。");
					reply = 0;
				}
			} while (reply != 0);
			System.out.println("所持金は" + money + "$です。");
		} while (money < 1000 && money > 0);
		if (money <= 0) {
			System.out.print("所持金が0になりました\n");
		} else {
			System.out.print("すごい 1000$を超えました\n");
		}
	}
}
