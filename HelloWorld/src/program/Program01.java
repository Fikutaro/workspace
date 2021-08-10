package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Program01 {
	 public static void main(String[] args) throws IOException
	    {
	        System.out.print( "☆レーダー☆\n" );
	        System.out.print( "ターゲットとして 0～100 のうち１つの数が設定されます。探索する位置と範囲を入力してターゲットを見つけてください。\n" );
	        System.out.print( "ターゲットと探索位置の差が探索範囲以下であればヒットです。探索範囲より大きければ、はずれです。\n" );
	        System.out.print( "探索位置とターゲットが一致すれば正解です。\n" );
	        System.out.print( "----------------------------------------------\n" );
	        System.out.print( "ゲームを開始します。\n" );

	        Random  RandObj = new Random();     // 乱数オブジェクト
	        BufferedReader br = new BufferedReader(
	                                new InputStreamReader(System.in));
	        int reply;

	        do
	        {
	            int target = RandObj.nextInt(101);

	            System.out.print("ターゲットが設定されました。\n");

	            for (int turn = 1; ; turn++){
	                System.out.print("位置は？");
	                int position = Integer.parseInt(br.readLine());

	                System.out.print("範囲は？");
	                int range = Integer.parseInt(br.readLine());

	                int distance;

	                if (target > position)
	                    distance = target - position;
	                else
	                    distance = position - target;

	                if (distance == 0){
	                    System.out.print("おめでとう！ "
	                            + turn + "回目で正解です！\n");
	                    break;
	                }
	                else if(distance <= range){
	                    System.out.print("ヒットしました。\n\n");
	                }
	                else{
	                    System.out.print("はずれました。\n\n");
	                }
	            }

	            System.out.print("もう一度やりますか？（1=Yes; 0=No!）");
	            reply = Integer.parseInt(br.readLine());

	        } while (reply != 0);
	    }
}
