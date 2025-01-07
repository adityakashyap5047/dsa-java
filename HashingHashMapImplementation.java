import java.util.ArrayList;
import java.util.LinkedList;

public class HashingHashMapImplementation {
    
    static class HashMap<K, V> {    //<K, V> -> generic -> It is Parametric types -> That means the value of K and V may be String, Boolean, Integer i.e. in this the type of variable is not fixed
                                    // generic means it is general for all types of value

        private class Node {    // Node of LL for each bucket
        
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        
        private int n; //n
        private int N;
        private LinkedList<Node> buckets[]; //N -> buckets stores the LinkedList

        @SuppressWarnings("unchecked")  //it is used for  suppress the warnings which arises here because we did not specify the type of LL here
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];

            int di = 0;
            for(int i = 0; i < ll.size(); i++){
                Node node = ll.get(i);
                if (node.key == key) {
                    return di;
                }
                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuk[] = buckets;
            buckets = new LinkedList[N*2];
            N = 2*N;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            //nodes -> add in buckets
            for(int i = 0; i < oldBuk.length; i++){
                LinkedList<Node> ll = oldBuk[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){    // T.C - O(lambda) -> O(1)
            int bi = hashFunction(key);     // 0 to size-1
            int di = searchInLL(key, bi);       //valid if key exist
            
            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double)n/N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);     // 0 to size-1
            int di = searchInLL(key, bi);       //valid if key exist
            
            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);     // 0 to size-1
            int di = searchInLL(key, bi);       //valid if key exist
            
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);     // 0 to size-1
            int di = searchInLL(key, bi);       //valid if key exist
            
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }
        
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i < buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);
        
        ArrayList<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
