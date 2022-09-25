package fieldsAndSrp;

public class Product {
	
	// define fields or attributes
	
	private int id;
	private String name;
	private String description;
	private String categoryName;
	private String color;
	private double price;
	private int stockAmount;
	private String code;
	
	// constructor
	public Product(int id, String name,  String description,String categoryName, String color,double price,int stockAmount) {
		this.id= id;
		this.name= name;
		this.description= description;
		this.categoryName = categoryName;
		this.color = color;
		this.price = price;
		this.stockAmount = stockAmount;
	}
	public Product() {
		
	}
	//id
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	//name
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//description
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	//category name
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	//color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//price
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	//stock amount
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	// code 
	public String getCode() {
		return getName().substring(0,2) + getId() ;
		
	}
	
}
