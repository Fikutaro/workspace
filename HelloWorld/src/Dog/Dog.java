package Dog;

public class Dog {
	private String Name;
	private int Age;
	private String Type;

	public  Dog(String ty) {
		Type = ty;
	}

	public void SetName(String nm) {
		Name = nm;
	}

	public void SetAge(int ag) {
		Age = ag;
	}

	public void ShowProfile() {
		System.out.println("名前は、" + Name + "です。");
		System.out.println("年齢は、" + Age + "です。");
		System.out.println("犬種は、" + Type + "です。");
	}
}
