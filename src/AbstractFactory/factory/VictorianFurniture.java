package AbstractFactory.factory;

import AbstractFactory.products.Chair;
import AbstractFactory.products.Table;

public class VictorianFurniture implements FurnitureFactory {

	@Override
	public Chair makeChar() {
		return new Chair("Victorian");
	}

	@Override
	public Table makeTable() {
		return new Table("Victorian");
	}

}
