package exception;

public class ExeptionExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	    int[] scores = new int[5];
		int a = 4;
		int b = (int)(Math.random() * 10);
		System.out.println("b=" + b);
		try {
			int c = a/b;
			System.out.println("Cの値は" + c);
			scores[b] = 10;
			System.out.println("処理は正常に行われました。");
		}
		catch (ArithmeticException e){
			System.out.println("ArithmeticException型の例外をキャッチしました");
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException型の例外をキャッチしました。");
			System.out.println(e);
		}
		finally {
			System.out.println("finallyブロックの処理です。");
		}
		System.out.println("プログラムを終了します");
	}

}
