package BuilderPattern;

import BuilderPattern.builders.CarBuilder;
import BuilderPattern.builders.CarManualBuilder;
import BuilderPattern.products.Car;
import BuilderPattern.products.Manual;

public class Client {
	
	public static void main(String[] args) {
		Director director = new Director();
		CarBuilder carBuilder = new CarBuilder();
		
		//make a SportsCar
		director.makeSportsCar(carBuilder);
		Car sportsCar = carBuilder.getResult();
		
		System.out.println( sportsCar.getEngine());
		
		//make a Electric Car
		carBuilder.reset();
		director.makeElectricCar(carBuilder);
		Car electricCar =  carBuilder.getResult();
		
		System.out.println( electricCar.getEngine());
		
		//make a Electric Car manual 
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.makeElectricCarManual(manualBuilder);
		Manual manual = manualBuilder.getResult();
		
		System.out.println(manual.getEngine());
	}

}
