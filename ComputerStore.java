package Store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class ComputerStore {
	
	public static void main(String[] args){ 
				
		//ArrayList<Computer> catalogComputersList = new ArrayList<Computer>();
		Map<Integer, Computer> СatalogСomputersMap = new HashMap<Integer, Computer>();
		СatalogСomputersMap.put(0,new Computer(400, 512, "Asus", "Asus"));
		СatalogСomputersMap.put(1,new Computer(300, 1024, "MSI", "MSI"));
		СatalogСomputersMap.put(2,new Computer(500, 2048, "Gigabyte", "Palit"));
		
		ComputerStore test = new ComputerStore();
		System.out.println("------------------------------------(с использованием цикла for)------------------------------------");
		test.printFor(СatalogСomputersMap);
		System.out.println("------------------------------------(с использованием цикла for - вариант)------------------------------------");
		test.printFor2(СatalogСomputersMap);
		System.out.println("------------------------------------(с использованием цикла forEach)------------------------------------");
		test.printForEach(СatalogСomputersMap);
	}
	
	public void printFor(Map<Integer, Computer> comp){
		for(int i=0; i<comp.size(); i++){
			System.out.println(comp.get(i));
		}
	}
	public void printFor2(Map<Integer, Computer> comp){
		for(Entry<Integer, Computer> entry: comp.entrySet()) {
			System.out.println(entry.getKey()+" " + entry.getValue());
		 }
	}
	
	public void printForEach(Map<Integer, Computer> comp){
		comp.forEach((Integer, Computer)->System.out.println("Ключ : " + Integer + " Значение : " + Computer));
	}
	
}
