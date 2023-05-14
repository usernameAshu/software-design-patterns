package BuilderPattern.builders;

import BuilderPattern.products.Manual;
import BuilderPattern.products.detailProduct.Engine;

public class CarManualBuilder implements Builder {
	
	private Manual manual;

	public CarManualBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		manual = new Manual();
	}

	@Override
	public void setSeats(int num) {
		manual.setSeats(num);
	}

	@Override
	public void setEngine(Engine engine) {
		manual.setEngine(engine);
	}

	@Override
	public void setTripComupter(int dist) {
		manual.setTripMeter(dist);
	}

	@Override
	public void setGps(int lat, int lon) {
		manual.setGps(lat, lon);
	}

	@Override
	public Manual getResult() {
		return manual;
	}

}
