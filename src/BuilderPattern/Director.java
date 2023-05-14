package BuilderPattern;

import BuilderPattern.builders.Builder;
import BuilderPattern.products.detailProduct.ElectricEngine;
import BuilderPattern.products.detailProduct.SportsEngine;

public class Director {
	
	void makeElectricCar(Builder builder) {
		builder.setEngine(new ElectricEngine());
		builder.setSeats(4);
		builder.setTripComupter(400);
		builder.setGps(130, 150);
	}
	
	void makeSportsCar(Builder builder) {
		builder.setEngine(new SportsEngine());
		builder.setSeats(2);
		builder.setTripComupter(600);
		builder.setGps(100, 150);
	}
	
	void makeElectricCarManual(Builder builder) {
		builder.setEngine(new ElectricEngine());
		builder.setSeats(4);
		builder.setTripComupter(400);
		builder.setGps(130, 150);
	}
}
