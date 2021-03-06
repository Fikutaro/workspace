package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program04 {

	public static void main(String[] args)throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("列車は時速100km/hで走っています。駅までの距離は500mです。\n");
		System.out.print("ブレーキを強くしたり、弱くしたりしながら駅に停車してください。\n");
		System.out.print("ブレーキは毎回、１段階だけ強くしたり弱くしたりできます。\n");
		System.out.print("----------------------------------------------\n");

		int speed;
		int distance;
		int brake;
		int plus;
		int reply;
		int count = 0;
		
		
		do {
			count ++;
			speed = 100;
			distance = 500;
			brake = 0;
			do {
			for(int i = 0; i<= distance; i += 10 ) {
				System.out.print("―");	
			}
			System.out.println("□□□");
			System.out.println("残り距離 "+ distance +"m 速度 "+ speed +"km/h ブレーキの強さ "+ brake);
			System.out.println("ブレーキの強さは？(2=強く、1=弱く、0=そのまま)");
			plus = Integer.parseInt(br.readLine());
			switch(plus) {
			case 0:
				break;
			case 1:
				brake --;
				break;
			case 2:
				brake ++;
				break;
			}
			
			speed = speed - brake;
			distance -= ((speed * 10)+ 35)/36;

			
			}while(distance > 0);
			System.out.print(count +"秒 駅までの距離 "+ distance +"mで停止しました");
			System.out.print("もう一度やりますか？（Yes:1 No:0）");
			reply = Integer.parseInt(br.readLine());
		}while(reply != 0);
	}

}
