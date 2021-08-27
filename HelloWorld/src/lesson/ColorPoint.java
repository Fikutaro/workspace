package lesson;

public class ColorPoint  extends Point{

	String color;
	
	void printInfo() {
		System.out.println("座標値は(" + x + "," + y + ")、色は"+ color +"です");
	}
}
