package lesson;

class Point {
	int x;
	int y;
}

public class PointInstanceExample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Point[] points = new Point [5];
		for (int i = 0; i < 5; i++) {
			points[i] = new Point();
			points[i].x = i;
			points[i].y = i * i;
		}
		for (int i = 0; i < 5; i++ ) {
			System.out.println("point["+ i + "]の座標は、("+points[i].x + "," + points[i].y + ")");
		}
	}

}
