package Store;

public class Computer {
	private int powerSupply;
	private int ram;
	private String mainboard;
	private String videocard;


	public Computer (int powerSupply,int ram, String mainboard,String videocard){
		this.powerSupply = powerSupply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;
	}

	public Computer(ComputerBuilder compBuilder){
		ram = compBuilder.getRam();
		powerSupply = compBuilder.getPowerSupply();

		mainboard = compBuilder.getMainboard();
		videocard = compBuilder.getVideocard();
	}

	public void setPowerSupply(int powerSupply) {
		this.powerSupply = powerSupply;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}

	public void setVideocard(String videocard) {
		this.videocard = videocard;
	}


	@Override
	public String toString() {
		return "Computer: powerSuppy=" + powerSupply + ", ram=" + ram + ", mainboard=" + mainboard + ", videocard="
				+ videocard + "\n";
	}


}