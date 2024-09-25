import java.util.ArrayList;;

public class ArrayListMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(343);
        list.add(4);
        list.add(5);

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i ++){
            if(list.get(i) > max){
                max = list.get(i);
            }
            max2 = Math.max(max2, list.get(i));
        }

        

        System.out.println(max);
        System.out.println(max2);
    }
}
