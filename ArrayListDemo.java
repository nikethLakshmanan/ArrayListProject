import java.util.ArrayList;
public class ArrayListDemo{
	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
	}
	public ArrayList<Integer> combineList(ArrayList<Integer> list1, ArrayList<Integer> list2){
		ArrayList<Integer> newList= new ArrayList<>();
		newList = list1 + list2;
		return newList;
	}
}