package Store;

public final class GamingComputer extends ComputerBuilder{

    @Override
    public ComputerBuilder powerSupply(int power){
        setPowerSupply(power);
        return this;
    }
    @Override
    public ComputerBuilder ram(int myRam){
        setRam(myRam);
        return this;
    }
    @Override
    public ComputerBuilder mainboard(String myMainboard){
        setMainboard(myMainboard);
        return this;
    }
    @Override
    public ComputerBuilder videocard(String myVideocard){
        setVideocard(myVideocard);
        return this;
    }
    @Override
    public Computer build(){
        //check exceptions or set standard fields
        if (getPowerSupply() == 0){
            setPowerSupply(400);
        }
        if(getRam()== 0){
            setRam(1024);
        }
        if(getMainboard()== null){
            setMainboard(" DefaultMainboard");
        }
        if (getVideocard()==null){
            setVideocard(" DefaultVideocard");
        }
        return new Computer(this);

    }
    @Override
    public int getPowerSupply() {
        return powerSupply;
    }
    @Override
    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }
    @Override
    public int getRam() {
        return ram;
    }
    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }
    @Override
    public String getMainboard() {
        return mainboard;
    }
    @Override
    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }
    @Override
    public String getVideocard() {
        return videocard;
    }
    @Override
    public void setVideocard(String videocard) {
        this.videocard = videocard;
    }


}
