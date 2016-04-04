package Store;

import java.util.HashMap;
import java.util.Map;

public class ComputerStore {
	
	public static void main(String[] args){
		//ArrayList<Computer> catalogComputersList = new ArrayList<Computer>();
		Map<Integer, ComputerBuilder> СatalogСomputersMap = new HashMap<K, V>();
		//СatalogСomputersMap.put(0,new Computer(300, 1024, "MSI", "MSI"));
		СatalogСomputersMap.put(0, Computer.newBuilder().setMainboard("ASUS").setPowerSuply(400).setRam(512).setVideocard("Gygabite"));
		СatalogСomputersMap.put(1,Computer.newBuilder().setMainboard("MSI").setPowerSuply(300).setRam(1024).setVideocard("MSI"));
		//СatalogСomputersMap.put(2,new Computer(500, 2048, "Gigabyte", "Palit"));
		
		ComputerStore test = new ComputerStore();
		System.out.println("------------------------------------(с использованием цикла for)------------------------------------");
		test.printFor(СatalogСomputersMap);}
		/*System.out.println("------------------------------------(с использованием цикла for - вариант)------------------------------------");
		test.printFor2(СatalogСomputersMap);
		System.out.println("------------------------------------(с использованием цикла forEach)------------------------------------");
		test.printForEach(СatalogСomputersMap);
	}*/
	
	public void printFor(Map<Integer,ComputerBuilder> comp){
		for(int i=0; i<comp.size(); i++){
			System.out.println(comp.get(i));
		}
	}/*
	public void printFor2(Map<Integer, Computer> comp){
		for(Entry<Integer, Computer> entry: comp.entrySet()) {
			System.out.println(entry.getKey()+" " + entry.getValue());
		 }
	}
	
	public void printForEach(Map<Integer, Computer> comp){
		comp.forEach((Integer, Computer)->System.out.println("Ключ : " + Integer + " Значение : " + Computer));
	}
	*/
}
