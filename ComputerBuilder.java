package Store;

public  abstract class ComputerBuilder {

    public abstract ComputerBuilder setPowerSuply(int powerSuply);

    public abstract ComputerBuilder setRam(int ram);

    public abstract ComputerBuilder setMainboard(String mainboard);

    public abstract ComputerBuilder setVideocard(String videocard);

    public abstract Computer build();
}
