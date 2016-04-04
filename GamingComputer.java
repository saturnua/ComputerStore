package Store;

public class GamingComputer extends ComputerBuilder{
    private int powerSuply;
    private int ram;

    private String mainboard;
    private String videocard;

    @Override
    public ComputerBuilder setPowerSuply(int powerSuply) {
        this.powerSuply = powerSuply;
        return this;
    }

    @Override
    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder setMainboard(String mainboard) {
        this.mainboard = mainboard;
        return this;
    }

    @Override
    public ComputerBuilder setVideocard(String videocard) {
        this.videocard = videocard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(powerSuply, ram, mainboard, videocard);
    }


}
