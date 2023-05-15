package AbstractFactory.products;

public class Chair {
	
	private String type;
	
	public Chair() {}

	public Chair(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
