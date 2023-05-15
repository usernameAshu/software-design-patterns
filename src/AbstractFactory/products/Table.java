package AbstractFactory.products;

public class Table {

	private String type;
	
	public Table() {}
	
	public Table(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
