import java.text.DecimalFormat;
import java.util.Random;

public class Scanner extends Machine {

	public Scanner() { //default constructor
		System.out.println("This is the 'SCANNER' constructor.");
	}
	
	
	public Scanner(String name, double weight, String description) {	//constuctor with parameters
		this.setName(name);
		this.setWeight(weight);
		this.setDescription(description);
	}
	
	public void setPrice(double min, double max) {		//method to set price 
		Random rand = new Random();		//random variable 
		DecimalFormat df = new DecimalFormat("#.##");	//formatting 
		price = df.format(min + (max - min) * rand.nextDouble());	//setting price 
	}
	
	public void setWeight(double num) {		//method to set weight
		if (num >= 2 && num <= 25) {	//testing limits
			weight = num;
			this.setPrice(60, 300);		//send paramters to set price between min, max
		} else {	//default options
			weight = 10;		
			this.setPrice(80, 80);
		}
	}	
}		//end of file
