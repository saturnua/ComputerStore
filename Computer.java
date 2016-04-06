package Store;

public class Computer {
	private int powerSuply;
	private int ram;

	private String mainboard;
	private String videocard;
	
	public Computer(){

	}

	public Computer (int powerSuply,int ram, String mainboard,String videocard){
		this.powerSuply = powerSuply;
		this.ram = ram;
		this.mainboard = mainboard;
		this.videocard = videocard;	
	}

	public int getPowerSuply() {
		return powerSuply;
	}

	public int getRam() {
		return ram;
	}

	public String getMainboard() {
		return mainboard;
	}

	public String getVideocard() {
		return videocard;
	}

	public void setPowerSuply(int powerSuply){
		this.powerSuply = powerSuply;
	}
	public void setRam(int ram){
		this.ram = ram;
	}
	public void setMainboard(String mainboard){
		this.mainboard = mainboard;
	}
	public void setVideocard(String videocard){
		this.videocard = videocard;
	}

	static void powerSwitch(int state){  //state - Состояние компьютера
			if(state == 1){
				System.out.println("Switch turn on");
			}
			else{
				System.out.println("Switch turn off");
			}
		}
		
	@Override
    public String toString()
    {
        return "Computer powered "+this.getPowerSuply()+" Watt power supply, "+" it has "+this.getRam()+" Mb RAM "+ ", and also it buld on "+this.mainboard+" mainboard and videocard by "+this.videocard;
    }

}