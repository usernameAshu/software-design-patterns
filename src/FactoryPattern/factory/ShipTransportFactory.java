package FactoryPattern.factory;

import FactoryPattern.products.ShipLogistics;
import FactoryPattern.products.Transport;

public class ShipTransportFactory {
	
	public static Transport createTransport() {
		return new ShipLogistics();
	}

}
