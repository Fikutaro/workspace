package collection;

import java.util.ArrayList;

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}


public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(0,1));
		pointList.add(new Point(1,2));
		pointList.add(new Point(2,3));
		pointList.add(new Point(3,4));
		
		for (int i = 0 ; i < pointList.size(); i++) {
			Point p = pointList.get(i);
			System.out.println("(" + p.x + "," + p.y +")");
		}
	}

}
