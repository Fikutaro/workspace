package exception;

class InvalidAgeException extends Exception {
	InvalidAgeException (String message){
	  super(message);
	}
}

public class MyExceptionExamle extends Exception {

	public static void main(String[] args) {
		int age = 10;
		try {
			if (age < 0) {
				throw new InvalidAgeException("年齢にマイナスの値が入力されました。"); 
			}
			System.out.println("年齢は" + age + "歳です。");
		}
		catch(InvalidAgeException e) {
			System.out.println("例外をキャッチしました。");
			System.out.println(e);
		}
	}
}
