package Store;

import java.util.ArrayList;
import java.util.ListIterator;

public class ComputerStore {
	
	public static void main(String[] args){ 
		ComputerInStore store = new ComputerInStore();//Пускай в этом магазине будет пока  три разных компьютера
		store.computerInStore();
		
		ArrayList<Computer> catalogСomputersList = new ArrayList<Computer>();//Создал три компьютера с разной конфигурацией и поместил их в коллекцию СatalogСomputersList
		catalogСomputersList.add(ComputerInStore.pc1);
		catalogСomputersList.add(ComputerInStore.pc2);
		catalogСomputersList.add(ComputerInStore.pc3);
		
		ComputerStore test = new ComputerStore();
		System.out.println("------------------------------------используя чтение по индексу (с использованием цикла for)------------------------------------");
		test.printFor(catalogСomputersList); 
		System.out.println("------------------------------------используя итератор (ListIterator) (с использованием цыкла while)------------------------------------");
		test.printLiterator(catalogСomputersList);
		System.out.println("------------------------------------используя цикл for each------------------------------------");
		test.printForEach(catalogСomputersList);
	}
	
	public void printFor(ArrayList<Computer> comp){
		for(int i=0; i<comp.size(); i++){
			System.out.println(comp.get(i));
		}
	}
	
	public void printLiterator(ArrayList<Computer> comp){
		ListIterator<Computer> litr = comp.listIterator();
		while (litr.hasNext()){
	       System.out.println(litr.next());
	    }
	}
	
	public void printForEach(ArrayList<Computer> comp){
		for(Computer i: comp){
			System.out.println(i);
			}
		}
	
}
