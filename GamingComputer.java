package Store;

public class GamingComputer extends ComputerBuilder{

    private Computer computer;

    public GamingComputer(){
    this.computer = new Computer();
    }

    @Override
    public void setRam() {
        this.computer.setRam(1024);
    }
    @Override
    public void setPowerSuply(){
        this.computer.setPowerSuply(400);
    }
    @Override
    public void setMainboard(){
        this.computer.setMainboard("MSI_Gaming");
    }
    @Override
    public void setVideocard(){
        this.computer.setVideocard("MSI_Gaming_video");
    }
    @Override
    public Computer getMyComputer(){
        return this.computer;
    }

}
