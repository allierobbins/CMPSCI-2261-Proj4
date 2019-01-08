import java.text.DecimalFormat;
import java.util.Random;

//see class Scanner in Scanner.java for comments - same code in both

public class Printer extends Machine {

	public Printer() { 	
		System.out.println("This is the 'PRINTER' constructor.");
	}
	
	public Printer (String name, double weight, String description) {
		this.setName(name);
		this.setWeight(weight);
		this.setDescription(description);
	}

	public void setPrice(double min, double max) {
		Random rand = new Random();
		DecimalFormat df = new DecimalFormat("#.##");
		price = df.format(min + (max - min) * rand.nextDouble());
	}

	public void setWeight(double num) {
		if (num <= 50) {
			weight = num;
			this.setPrice(40, 200);
		} else { 
			weight = 25;
			this.setPrice(90, 90);
		}
	}

}
