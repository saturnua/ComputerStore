package Store;

public class ComputerInStore {
	
	public static Computer pc1;
	public static Computer pc2;
	public static Computer pc3;

	public void computerInStore(){
		pc1 = new Computer(400, 1024, "Asus", "Asus");
		pc2 = new Computer(500, 2048, "MSI", "MSI");
		pc3 = new Computer(300, 512, "Gigabyte", "Palit");
	}
}
