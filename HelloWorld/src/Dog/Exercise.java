package Dog;

public class Exercise {
	public static void main(String[] args) {
		Dog MyDog = new Dog("柴犬");

		MyDog.SetName("ぽち");
		MyDog.SetAge(6);
		MyDog.ShowProfile();
		
		Dog HisDog = new Dog("秋田犬");
		
		HisDog.SetName("タマ");
		HisDog.SetAge(5);
		HisDog.ShowProfile();
	}
}
