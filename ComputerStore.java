package Store;

public class ComputerStore {

        public static void main(String[] args){
                //run app
                //create new Comp using builder
                Computer gameComp = new GamingComputer().mainboard("GamingMainboard").powerSupply(800).ram(8064).videocard("GamingVideocard").build();
                System.out.println(gameComp.toString());

                Computer personConfig = new PersonalConfiguration().build();
                System.out.println(personConfig.toString());


        }
}
