package FactoryPattern.factory;

import FactoryPattern.products.RoadLogistics;
import FactoryPattern.products.Transport;

public class RoadTransportFactory  {
	
	public static Transport createTransport() {
		return new RoadLogistics();
	}
     
}
