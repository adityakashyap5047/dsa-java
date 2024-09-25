public class JavaCallByValue {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("The vlaue of 'a' inside swap function is: "+a);
        System.out.println("The vlaue of 'b' inside swap function is: "+b);
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Initially value of 'a' is: "+a);
        System.out.println("Initially value of 'b' is: "+b);
        swap(a, b);
        System.out.println("The vlaue of 'a' inside main function is: "+a);
        System.out.println("The vlaue of 'b' inside main function is: "+b);
    }
}
