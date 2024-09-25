import mathPackage.JavaPackage;

public class UsingPackage {
    public static void main(String[] args) {
        JavaPackage jp = new JavaPackage();
        System.out.println(jp.sum(9, 6));
        System.out.println(jp.sum(5, 6, 7));
        jp.main(args);   //It exeute the main() method of JavaPackage.java
    }
}