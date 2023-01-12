package hashMap;

public class Bike {
	private String  bikeNo;
	private String brand;
	private String color;
	private int price;
	public String getBikeNo() {
		return bikeNo;
	}
	public void setBikeNo(String bikeNo) {
		this.bikeNo = bikeNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Bike(String bikeNo, String brand, String color, int price) {
		this.bikeNo = bikeNo;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [bikeNo=" + bikeNo + ", brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
}
