package lesson;

public class CustomerCard {

	static int nextId = 1001;
	int id;
	String name;
	String address;
	
	CustomerCard(String name, String address){
		this.id = CustomerCard.nextId;
		CustomerCard.nextId++;
		this.name = name;
		this.address = address;
	}
	
	
	public CustomerCard(String name){
		this(name, "");
	}
	
	
	
	void printInfo() {
		System.out.println("ID:" + this.id);
		System.out.println("氏名:" + this.name);
		System.out.println("住所:" + this.address);
	}

}
