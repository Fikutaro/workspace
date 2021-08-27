package lesson;

public class ShoeShopCustomerCard extends CustomerCard {
	
	double shoeSize;

	
	ShoeShopCustomerCard(String name, String address, double shoeSize){
		super(name, address);
		this.shoeSize = shoeSize;
	}
	
	ShoeShopCustomerCard(String name){
		super(name);
	}
	
	void printInfo() {
		System.out.println("靴屋の顧客情報");
		super.printInfo();
		System.out.println("靴のサイズ" + shoeSize);
	}

}


