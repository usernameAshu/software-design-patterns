package AbstractFactory.utils;

public enum Furniture {
	
	VICTORIAN("victorian"),
	MODERN("modern");
	
	String value;

	private Furniture(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
}
