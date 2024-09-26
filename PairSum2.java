import java.util.ArrayList;

public class PairSum2 {

    public static boolean pairSumTwo(ArrayList<Integer> mylist, int target){
        int i = 0;
        while (mylist.get(i) < mylist.get(i+1)) {
            i++;
        }
        int lp = i + 1;
        int rp = i;
        while (lp != rp) {
            if(mylist.get(lp) + mylist.get(rp) == target){
                return true;
            }
            else if(mylist.get(lp) + mylist.get(rp) > target){
                rp = (mylist.size() + rp - 1) % mylist.size();
            } else {
                lp = (lp + 1) % mylist.size();
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(11);
        mylist.add(15);
        mylist.add(6);
        mylist.add(8);
        mylist.add(9);
        mylist.add(10);

        int target = 140;

        System.out.println(pairSumTwo(mylist, target));
    }
}
