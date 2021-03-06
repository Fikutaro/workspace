package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class program05 {
	public static void main(String[] args) throws IOException {
		Random RandObj = new Random(); // 乱数オブジェクト
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int reply;
		
		System.out.print("4桁の数を当ててください。\n");
		System.out.print("同じ数字は１度しか使用されません。最上位に0が使用される場合もあります。\n");
		System.out.print("ヒントとして、合っている数字の数と、桁（位置）も合っている数字の数を示します。\n");
		System.out.print("答えが'4135'で入力が'0123'の場合、'数:2,桁:1'とヒントが出ます。\n");
		System.out.print("----------------------------------------------\n");
		
		do {
			System.out.print("4桁の数を考えました！！\n");
			int numbers[] = new int[4];
			do {
				numbers[0] = RandObj.nextInt(10);
				numbers[1] = RandObj.nextInt(10);
				numbers[2] = RandObj.nextInt(10);
				numbers[3] = RandObj.nextInt(10);			
			}while(!(numbers[0] != numbers[1] &&
				    numbers[0] != numbers[2] &&
				    numbers[0] != numbers[3] &&
				    numbers[1] != numbers[2] &&
				    numbers[1] != numbers[3] &&
				    numbers[2] != numbers[3] ));
			for (int turn = 1; ;turn++){
				System.out.print("数を当ててください。\n");
				int num = Integer.parseInt(br.readLine());
				int test[] = new int[4];
				test[3] =num % 10;
				test[2] = (num/10) % 10;
				test[1] = (num/100) % 10;
				test[0] = (num/1000) % 10;
				
				int kazu = 0;
				int keta = 0;
				
				for (int i = 0;i < 4 ;i++) {
					for (int j = 0;j < 4 ;j++) {
						if(numbers[i] == test[j]) {
							kazu += 1;
							if(i == j) {
								keta += 1;
							}
						}
					}
				}
				
				if(keta == 4) {
					System.out.print("おめでとう！！ "+ turn +"回目で正解です。\n");
					break;
				}else {
					System.out.print("数:" + kazu + ",桁:"+ keta +"\n");
				}
			}
					

			System.out.print("もう一度やりますか？（Yes:1 No:0）");
			reply = Integer.parseInt(br.readLine());
		}while(reply != 0);
	}
}
