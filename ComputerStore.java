package Store;

import java.util.ArrayList;
import java.util.ListIterator;

public class ComputerStore {
	
	public static void main(String[] args){ 
		ComputerInStore store = new ComputerInStore();//������ � ���� �������� ����� ����  ��� ������ ����������
		store.computerInStore();
		
		ArrayList<Computer> catalog�omputersList = new ArrayList<Computer>();//������ ��� ���������� � ������ ������������� � �������� �� � ��������� �atalog�omputersList
		catalog�omputersList.add(ComputerInStore.pc1);
		catalog�omputersList.add(ComputerInStore.pc2);
		catalog�omputersList.add(ComputerInStore.pc3);
		
		ComputerStore test = new ComputerStore();
		System.out.println("------------------------------------��������� ������ �� ������� (� �������������� ����� for)------------------------------------");
		test.printFor(catalog�omputersList); 
		System.out.println("------------------------------------��������� �������� (ListIterator) (� �������������� ����� while)------------------------------------");
		test.printLiterator(catalog�omputersList);
		System.out.println("------------------------------------��������� ���� for each------------------------------------");
		test.printForEach(catalog�omputersList);
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
