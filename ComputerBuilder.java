package Store;

public  abstract class ComputerBuilder {

   protected int powerSupply;
   protected int ram;
   protected String mainboard;
   protected String videocard;

   public abstract ComputerBuilder powerSupply(int power);

   public abstract ComputerBuilder ram(int myRam);

   public abstract ComputerBuilder mainboard(String myMainboard);

   public abstract ComputerBuilder videocard(String myVideocard);

   public abstract Computer build();

   public  abstract int getPowerSupply();

   public  abstract void setPowerSupply(int powerSupply);

   public  abstract int getRam();

   public  abstract void setRam(int ram);

   public  abstract String getMainboard();

   public  abstract void setMainboard(String mainboard);

   public  abstract String getVideocard();

   public  abstract void setVideocard(String videocard);

}
