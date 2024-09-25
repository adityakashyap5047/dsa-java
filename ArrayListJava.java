import java.util.ArrayList;

public class ArrayListJava {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        ArrayList<String> myString = new ArrayList<>();
        ArrayList<Boolean> myBoolean = new ArrayList<>();

        //Adding the element -> O(1)
        myList.add(1);
        myList.add(3);
        myList.add(4);
        myList.add(34);
        myList.add(32);
        myList.add(23);
        System.out.println(myList);

        //Get an element -> O(1)
        int element = myList.get(3);
        System.out.println(element);

        //delete element -> O(n)
        myList.remove(1);
        System.out.println(myList);

        //set element at index -> O(n)
        myList.set(3, 111);
        System.out.println(myList);

        //contain element -> O(n)
        System.out.println(myList.contains(1));

        //adding at any index               - O(n)
        myList.add(1, 300);
        System.out.println(myList);

        //size of ArrayList
        System.out.println(myList.size());

        //print the arrayList
        for(int i = 0; i < myList.size(); i ++){
            System.out.print(myList.get(i)+ " ");
        }
    }
}
