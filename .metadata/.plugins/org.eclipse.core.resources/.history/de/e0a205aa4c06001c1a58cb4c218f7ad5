package lesson;

class Point {
	int x;
	int y;

	void set(int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	void set(Point p) {
		this.x = p.x;
		this.y = p.y;

	}
}

public class MethodCallExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Point p1 = new Point ();
		System.out.println("(" + p1.x + "," + p1.y + ")");
		
		p1.set(10,0);
		System.out.println("(" + p1.x + "," + p1.y + ")");
		
		Point p2 = new Point();
		
		p2.set(p1);
		System.out.println("(" + p2.x + "," + p2.y + ")");
	}
}