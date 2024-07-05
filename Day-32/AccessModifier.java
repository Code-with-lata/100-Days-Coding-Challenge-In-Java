public class AccessModifier {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.username = "Lata";
        System.out.println(myAccount.username);
        myAccount.setPassword("sfgyyybferevb") ;
       //  System.out.println(myAccount.setPassword());
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}
