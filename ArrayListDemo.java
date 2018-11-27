import java.util.ArrayList;
public class ArrayListDemo{
	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=1; i<11; i++){
			list1.add(i);
			list2.add(i);
		}
		combineList(list1, list2);
	}
	public static ArrayList<Integer> combineList(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> newList= new ArrayList<>();
		for(int i=0; i<list1.size(); i++){
			newList.add(list1.get(i));
		}
		for(int i=0; i<list2.size(); i++){
			newList.add(list2.get(i));
		}
		printList(newList);
		return newList;
	}
	public static ArrayList<Integer> printList(ArrayList<Integer> list){
		for(int i = 0; i<list.size(); i++){
			System.out.print(list.get(i) + ", ");
		}
		return list;
	}
}