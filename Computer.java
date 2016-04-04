package Store;

public class Computer {
	private final int powerSuply;
	private final int ram;

	private final String mainboard;
	private final String videocard;
	
	private Computer(){

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
        return "Computer powered "+this.powerSuply+" Watt power supply, "+" it has "+this.ram+" Mb RAM "+ ", and also it buld on "+this.mainboard+" mainboard and videocard by "+this.videocard;
    }

	public static GamingComputer newBuilder(){
		return new Computer().new GamingComputer();
	}
}