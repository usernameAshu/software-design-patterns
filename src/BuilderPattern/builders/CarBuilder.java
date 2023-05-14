package BuilderPattern.builders;

import BuilderPattern.products.Car;
import BuilderPattern.products.detailProduct.Engine;

public class CarBuilder implements Builder {
	
	private Car car;
	
	public CarBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		car = new Car();
	}

	@Override
	public void setSeats(int num) {
		car.setSeats(num);
	}

	@Override
	public void setEngine(Engine engine) {
		car.setEngine(engine);
	}

	@Override
	public void setTripComupter(int dist) {
		car.setTripMeter(dist);
	}

	@Override
	public void setGps(int lat, int lon) {
		car.setGps(lat, lon);
	}

	@Override
	public Car getResult() {
		return car;
	}

}
