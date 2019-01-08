
public class TestMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//array of machine objects
		Machine [] machineArray = new Machine[10];
		
		//intiallizing objects to a type(print/scan/phone) and declararions (name, weight, description)
		machineArray[0] = new Printer("Printer A", 30.0, "This is a laser printer.");
		machineArray[1] = new Printer("Printer B", 1.5, "This is an inkjet printer.");
		machineArray[2] = new Printer("Printer C", 6.0, "This is a slow, inkjet printer.");
		machineArray[3] = new Printer("Printer D", 70.0, "This is a fast, inkjet printer.");
		machineArray[4] = new Scanner("Scanner A", 4.0, "This is a black/white scanner.");
		machineArray[5] = new Scanner("Scanner B", 20.0, "This is a color scanner.");
		machineArray[6] = new Scanner("Scanner C", 20.0, "This is a black/white and color scanner.");
		machineArray[7] = new Smartphone("Smartphone A", .4, "This smartphone has a Marshmellow OS.");
		machineArray[8] = new Smartphone("Smartphone B", 0.3, "This smartphone has a KitKat OS.");
		machineArray[9] = new Smartphone("Smartphone C", 1, "This smartphone has a Jelly Bean OS.");
		
		//print information of objects
		for (int i = 0; i < 10; i++) {
			System.out.println("Machine: " + (i + 1));
			System.out.println("Name: " + machineArray[i].getName());
			System.out.println("Description: " + machineArray[i].getDescription());
			System.out.println("Price: $" + machineArray[i].getPrice());
			System.out.println("Weight: " + machineArray[i].getWeight());
			System.out.println("\n");
		}
	}	//end of program

}
