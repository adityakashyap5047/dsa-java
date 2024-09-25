public class ArrayPair {
    public static void printPairs(int numbers[]){
        int totaPair = 0;
        for(int i=0; i<=(numbers.length-1); i++){
            for(int j=(i+1); j<=(numbers.length-1);j++){
                System.out.print("("+numbers[i]+", "+numbers[j]+") ");
                totaPair++;
            }
            System.out.println();
        }
        System.out.println("The total number of pair is: "+totaPair);
    }        
        //The time complexity of above code is O(n*n)

    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printPairs(numbers);
    }
}
