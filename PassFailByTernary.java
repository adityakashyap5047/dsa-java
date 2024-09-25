import java.util.*;

public class PassFailByTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage of Student:");
        float percent = sc.nextFloat();

        String PassFail = (percent >= 33.33f) ? "The Student is Pass" : "The Student is Fail";

        System.out.println(PassFail);
    }
}
