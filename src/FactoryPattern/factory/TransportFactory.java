package FactoryPattern.factory;

import FactoryPattern.products.Transport;
import FactoryPattern.util.FactoryPatternConstants;

public class TransportFactory {

	public static Transport createTransport(String name) {
		return pickTransportMode(name);
	}

	private static Transport pickTransportMode(String name) {

		if (name.equalsIgnoreCase(FactoryPatternConstants.ROAD_LOGISTICS)) {
			return RoadTransportFactory.createTransport();
		} else if (name.equalsIgnoreCase(FactoryPatternConstants.SHIP_LOGISTICS)) {
			return ShipTransportFactory.createTransport();
		} else
			return null;
	}

}
