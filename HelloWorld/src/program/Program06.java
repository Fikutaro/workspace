package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program06 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int reply;
		double high;
		double speed;
		int fuel;
		int use;
		int max;

		System.out.print("月着陸船を、無事、月面に軟着陸させてください。\n");
		System.out.print("月の重力は地球の約1/6です。１秒毎にエンジンを燃焼させて落下速度を調整してください。\n");
		System.out.print("燃料を1ユニット燃焼すると0.1m/s落下速度が減少します。１回で最大50ユニットまで燃焼できます。\n");
		System.out.print("----------------------------------------------\n");

		do {
			high = 100;
			speed = 0;
			fuel = 250;
			max = 50;
			do {
				System.out.print("高度:" + high + "m 速度:" + speed + "m/s 残燃料:" + fuel + "\n");
				while (true) {
					if (fuel > max) {
						System.out.print("何ユニット燃焼しますか？(0～" + max + ")\n");
						use = Integer.parseInt(br.readLine());

						if (use <= max) {
							break;
						} else {
							System.out.println("50以上は使えません。");
						}
					}else {
						System.out.print("何ユニット燃焼しますか？(0～" + fuel + ")\n");
						use = Integer.parseInt(br.readLine());

						if (use <= fuel) {
							break;
						} else {
							System.out.println("燃料以上は使えません。");
						}
					}
				}
				fuel -= use;
				speed -= (0.1 * use);
				high -= speed;
				for (int i = 0; i <= high; i += 5) {
					System.out.print("　");
				}
				System.out.print(">□\n");
				speed += 1.62;
			} while (high > 0);
			if (speed < 1) {
				System.out.print("おめでとう！ 無事、月面に軟着陸できました。\n");
			} else {
				System.out.print("残念！ 着陸船は速度" + speed + "m/sで月面に激突しました。\n");

			}
			System.out.print("もう一度やりますか？（Yes:1 No:0）");
			reply = Integer.parseInt(br.readLine());
		} while (reply != 0);
	}

}