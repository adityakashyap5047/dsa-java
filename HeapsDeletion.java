import java.util.ArrayList;

public class HeapsDeletion {
    
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

        public int peek(){
            return arr.get(0);
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }

        private void heapify(int idx){
            int leftIdx = 2 * idx + 1;
            int rightIdx = 2 * idx + 2;

            int minIdx = idx;

            if (leftIdx < arr.size() && arr.get(minIdx) > arr.get(leftIdx)) {
                minIdx = leftIdx;
            }

            if (rightIdx < arr.size() && arr.get(minIdx) > arr.get(rightIdx)) {
                minIdx = rightIdx;
            }

            
            if (minIdx != idx) {
                //swap
                int temp = arr.get(idx);
                arr.set(idx, arr.get(minIdx));
                arr.set(minIdx, temp);

                heapify(minIdx); // to fix the heap for the min idx
            }

        }

        public int remove(){
            int data = arr.get(0);

            //step 1 -> swap 1st and last
            int temp = data;
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step 2 -> delete last element
            arr.remove(arr.size()-1);

            //step 3 -> Heapify
            heapify(0);

            return data;

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
        System.out.println();
        while (!hp.isEmpty()) {
            System.out.println(hp.peek());
            hp.remove();
        }
    }

}
