package Dog;

public class Exercise {
	public static void main(String[] args) {
		Dog MyDog = new Dog();

		MyDog.SetName("ぽち");
		MyDog.SetAge(6);
		MyDog.ShowProfile();
		
		Dog HisDog = new Dog();
		
		HisDog.SetName("タマ");
		HisDog.SetAge(5);
		HisDog.ShowProfile();
	}
}
