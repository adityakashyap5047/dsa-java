import java.util.ArrayList;

public class HeapsJava {
    
    static class Heaps {
    
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);

            //child idx
            int x = arr.size() - 1;
            int par = (x - 1)/2;    //parent idx

            while (x > 0 && arr.get(x) < arr.get(par)) {
                
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par)); 
                arr.set(par, temp);

                // update indices
                x = par;
                par = (x - 1) / 2;
            }
        }

        public void print(){
            for(int i = 0; i < arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
        }
    }

    public static void main(String[] args) {
        Heaps hp = new Heaps();
        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(5);
        hp.add(10);
        hp.add(1);

        hp.print();
    }
}
