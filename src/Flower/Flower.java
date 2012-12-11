package Flower;

public class Flower {
	//Instance variables
	private String name;
	private int pedal;
	private float price;
	
	//Build Constructor
	Flower() {
		name = "Rose";
		pedal = 3;
		price = 1.99f;
	}
	
	Flower(String nm, int pd, float pr) {
		name = nm;
		pedal = pd;
		price = pr;
	}
	
	//Accessor Methods
	public String getName() { return name; }
	public int getPedal() { return pedal; }
	public float getPrice() { return price; }
	
	//Modifier Methods
	public void setName(String nm) { name = nm; }
	public void setPedal(int pd) { pedal = pd; }
	public void setPrice(float pr) { price = pr; }
	
}
