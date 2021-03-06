package program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arraypractice {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 入力パラメータを読み込む
		String input = br.readLine();
		String[] param = input.split(" ");//入力値を空白で分解する

		String type = null;
		int sum = 0;
		
		for (int idx = 0; idx < param.length; idx++) {
			if (param[idx].equals("+") || param[idx].equals("-") ) {
				type = param[idx];
			}else {
				int num = Integer.parseInt(param[idx]);
				if(type != null){
					if(type.equals("+")) {
						sum += num; 
					}else{
						sum -= num; 
					}
				}else {
					sum = num;
				}
			}
		}
		System.out.println(sum);
	}
}

