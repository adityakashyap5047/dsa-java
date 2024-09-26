import java.util.ArrayList;

public class PairSum1 {

    public static boolean pairsum1(ArrayList<Integer> mylist, int target){
        for(int i = 0; i < mylist.size(); i++){
            for(int j = i + 1; j < mylist.size(); j++){
                if(mylist.get(i) + mylist.get(j) == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean pairsum1TwoPointerApproach(ArrayList<Integer> mylist, int target){
        int lp = 0, rp = mylist.size()-1;
        while (lp < rp) {
            if(mylist.get(lp) + mylist.get(rp) == target){
                return true;
            } else if(mylist.get(lp) + mylist.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        mylist.add(6);

        int target = 5;

        System.out.println(pairsum1(mylist, target));
        System.out.println(pairsum1TwoPointerApproach(mylist, target));
    }
}
