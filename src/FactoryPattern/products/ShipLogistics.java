package FactoryPattern.products;

public class ShipLogistics implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver via sea");
	}

}
