import java.text.DecimalFormat;
import java.util.Random;

//see class Scanner in Scanner.java for comments - same code in both

public class Smartphone extends Machine{
	
	public Smartphone() {
		System.out.println("This is the 'SMARTPHONE' constructor.");
	}
	
	public Smartphone(String name, double weight, String description) {
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
		if (num >= 0.25 && num <= 0.5) {
			weight = num;
			this.setPrice(220, 350);
		}else {
			weight = .3;
			this.setPrice(200, 200);	
		}
	}
}
