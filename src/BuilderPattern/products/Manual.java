package BuilderPattern.products;

import BuilderPattern.products.detailProduct.Engine;

public class Manual {

	private int seats;
	private int tripMeter;
	private Engine engine;
	private int latitude;
	private int longitude;

	public Manual() {
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getTripMeter() {
		return tripMeter;
	}

	public void setTripMeter(int tripMeter) {
		this.tripMeter = tripMeter;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void setGps(int lat, int lon) {
		this.latitude = lat;
		this.longitude = lon;
	}

	public int getLatitude() {
		return latitude;
	}

	public int getLongitude() {
		return longitude;
	}
	
	
}
