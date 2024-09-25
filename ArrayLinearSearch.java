public class ArrayLinearSearch {

    public static int idx(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(key == numbers[i]){
                return i;
            }
        }
        return -1;
    }

    // Function Overloading

    public static int idx(String fruits[], String fruit){
        for(int i=0; i<fruits.length; i++){
            if(fruit == fruits[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        // Linear Search for index of a number
        int numbers[] = {2, 3, 1, 5, 10, 23, 34, 45};
        int key = 10;
        int index = idx(numbers, key);
        if(index == -1){
            System.out.println("The number "+key+" is not found in the given Array");
        }
        else{
            System.out.println("The index of "+key+" in the given Array is "+index);
        }

        // Linear Search for index of a String

        String fruits[] = {"apple", "mango", "orange", "papaya", "banana", "graphes", "gauva", "pineapple"};
        String fruit = "papaya";
        int indx = idx(fruits, fruit);
        if (indx == -1) {
            System.out.println("The fruit "+fruit+" is not found in the given Array");
        }
        else{
            System.out.println("The index of "+fruit+" in the given Array is "+indx);
        }
        
    }
}
