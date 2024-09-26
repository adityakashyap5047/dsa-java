import java.util.ArrayList;;

public class ArrayListMultiDemensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        /*
         * list1.add(1);
         * list1.add(2);
         * list1.add(3);
         */

        for (int i = 1; i < 6; i++) {
            list1.add(i);
            list2.add(2*i);
            list3.add(3*i);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> list = mainList.get(i);
            for (int j = 0; j < list.size(); j++) {
                System.err.print(list.get(j)+" ");
            }
            System.err.println();
        }

    }
}
