package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Program01 {
	public static void main(String[] args) throws IOException {
		System.out.print("☆レーダー☆\n");
		System.out.print("ターゲットとして 0～100 のうち１つの数が設定されます。探索する位置と範囲を入力してターゲットを見つけてください。\n");
		System.out.print("ターゲットと探索位置の差が探索範囲以下であればヒットです。探索範囲より大きければ、はずれです。\n");
		System.out.print("探索位置とターゲットが一致すれば正解です。\n");
		System.out.print("----------------------------------------------\n");
		System.out.print("ゲームを開始します。\n");

		Random RandObj = new Random(); // 乱数オブジェクト
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int reply;

		do {
			int target = RandObj.nextInt(101);
			System.out.println("ターゲットが設定されました。");

			for (int i = 1;; i++) {
				System.out.println("位置は？");
				int position = Integer.parseInt(br.readLine());
				System.out.println("範囲は？");
				int range = Integer.parseInt(br.readLine());
				int distance;
				if (target < position) {
					distance = position - target;
				} else {
					distance = target - position;
				}
				if (distance == 0) {
					System.out.println("正解です。"+ i + "回目です。");
					break;
				}
				if (distance < range) {
					System.out.println("ヒット");
				} else {
					System.out.println("はずれ");
				}
				
			}
			System.out.println("もう一度？ 1=yes 2=NO");
			reply = Integer.parseInt(br.readLine());
		} while (reply != 0);
	}
}
