package FactoryPattern.products;

public class RoadLogistics implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver via road");

	}

}
