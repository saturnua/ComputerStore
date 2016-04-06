package Store;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class ComputerStore {
	
	public static void main(String[] args){

		ComputerBuilder compForGame = new GamingComputer();
        ComputerBuilder personalConfiguration = new PersonalConfiguration();
        //in this Section i build GameComp, maybe can push in individual class
        compForGame.setMainboard();
        compForGame.setPowerSuply();
        compForGame.setRam();
        compForGame.setVideocard();

        //in this Section i build PersonalconfigurationComp, maybe can push in individual class
        personalConfiguration.setVideocard();
        personalConfiguration.setMainboard();
        personalConfiguration.setPowerSuply();
        personalConfiguration.setRam();
        //In this i get my configuration and write it on screen
        Computer firstComp = compForGame.getMyComputer();
        Computer secondComp = personalConfiguration.getMyComputer();
        System.out.println(firstComp.toString());
        System.out.println(secondComp.toString());

    }
}
