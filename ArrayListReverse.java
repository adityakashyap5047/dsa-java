import java.util.ArrayList;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //Reverse the print
        for(int i = list.size() - 1; i >= 0; i --){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        //Reverse the ArrayList
        for(int i = 0; i < list.size()/2; i ++){
            int temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size()-1-i, temp);
        }

        for(int i = 0; i < list.size(); i ++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
