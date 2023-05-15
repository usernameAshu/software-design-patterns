package AbstractFactory.factory;

import AbstractFactory.products.Chair;
import AbstractFactory.products.Table;

public interface FurnitureFactory {
	
	Chair makeChar();
	
	Table makeTable();

}
