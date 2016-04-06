package Store;

public  abstract class ComputerBuilder {

   protected Computer computer;

   public void createNewComputer()
   {
     computer = new Computer();
   }

   public Computer getMyComputer(){
        return computer;
   }

   public abstract void setPowerSuply();
   public abstract void setRam();
   public abstract void setMainboard();
   public abstract void setVideocard();


}
