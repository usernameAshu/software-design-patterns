package AbstractFactory;

import AbstractFactory.factory.FurnitureFactory;
import AbstractFactory.products.Chair;
import AbstractFactory.products.Table;

public class FurnitureClient {
	
	private FurnitureFactory abstractFactory;
	
	public FurnitureClient(FurnitureFactory factory) {
		this.abstractFactory = factory;
	}
	
	Chair makeChair() {
		return abstractFactory.makeChar();
	}
	
	Table makeTable() {
		return abstractFactory.makeTable();
	}

}
