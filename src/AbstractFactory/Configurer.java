package AbstractFactory;

import AbstractFactory.factory.ModernFurniture;
import AbstractFactory.factory.VictorianFurniture;
import AbstractFactory.utils.Furniture;

public class Configurer {

	public static void main(String[] args) {
		
		FurnitureClient app;
		
		//this will come from a external configuration
		String furnitureType = Furniture.MODERN.getValue();
		
		if(furnitureType.equalsIgnoreCase(Furniture.VICTORIAN.getValue())) {
			app = new FurnitureClient(new VictorianFurniture());
		} else {
			app = new FurnitureClient(new ModernFurniture());
		}
		
		System.out.println("Chair: " + app.makeChair().getType());
		System.out.println("Table: "+ app.makeTable().getType());
		
	}

}
