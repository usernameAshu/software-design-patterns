package AbstractFactory.factory;

import AbstractFactory.products.Chair;
import AbstractFactory.products.Table;

public class ModernFurniture implements FurnitureFactory {

	@Override
	public Chair makeChar() {
		return new Chair("modern");
	}

	@Override
	public Table makeTable() {
		return new Table("modern");
	}

}
