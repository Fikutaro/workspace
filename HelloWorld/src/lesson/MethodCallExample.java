package lesson;

class Point {
	int x;
	int y;

	void multipy(int n) {
		this.x *= n;
		this.y *= n;
	}
	
	boolean isSamePosition(Point p) {
		if(this.x == p.x && this.y == p.y) {
			return true;
		}else {
			return false;
		}
	}
}

public class MethodCallExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Point p1 = new Point();
		p1.x = 2;
		p1.y = 3;

		Point p2 = new Point();
		p2.x = 4;
		p2.y = 6;

		if(p1.isSamePosition(p2) == true){
			System.out.println("p1とp2は同じ座標です");
		}else {
			System.out.println("p1とp2は異なる座標です");
		}
		
		p1.multipy(2);
		
		if(p1.isSamePosition(p2) == true){
			System.out.println("p1とp2は同じ座標です");
		}else {
			System.out.println("p1とp2は異なる座標です");
		}
	}
}
