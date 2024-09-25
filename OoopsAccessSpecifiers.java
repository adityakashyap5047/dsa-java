public class OoopsAccessSpecifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "AdityaKumar";

        // myAcc.password = "abcdeeft@5756";   // We can not access password directly

        myAcc.setPassword("afhhg78@3yfAshf");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pswd){  // Now we can set password globally
        password = pswd;
    }
}
