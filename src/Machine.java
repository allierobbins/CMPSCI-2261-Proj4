
public abstract class Machine { 	//abstract class Machine 

	//variables 
	private String name;
	protected String price;
	protected double weight;
	private String description;
	
	public Machine() {
		//constructor
	}
	
	public String getName() {	//method to return name
		return name;
	}

	public void setName(String name) {		//method to set name
		this.name = name;
	}

	public String getPrice() {		//method to get price
		return price;
	}

	public abstract void setPrice(double price, double price2);		//abstract method to set price

	public double getWeight() {		//method to get weight 
		return weight;
	}

	public abstract void setWeight(double weight);		//abstract method to set weight 

	public String getDescription() {		//method to get description
		return description;
	}

	public void setDescription(String description) {		//method to set description
		this.description = description;
	}

}			//end of file
