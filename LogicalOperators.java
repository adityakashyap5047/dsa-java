public class LogicalOperators {
    public static void main(String[] args) {
        System.out.println((3>2) && (5>3));
        System.out.println((3>2) && (5<3));
        System.out.println((3<2) && (5>3));
        System.out.println((3<2) && (5<3));

        System.out.println((3>2) || (5>3));
        System.out.println((3>2) || (5<3));
        System.out.println((3<2) || (5>3));
        System.out.println((3<2) || (5<3));

        System.out.println(!(3>2));
        System.out.println(!(5<3));
    }
}
