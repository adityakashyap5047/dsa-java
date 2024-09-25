package mathPackage;

public class JavaPackage {

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float sum(float a, float b, float c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("java package is calling...");
        System.out.println("Yeah!!! , finally I am executed!");
    }
}
