public class AccountExampleTest {
    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        String account = "123abc_";
        String account1 = ".@";
        boolean isValid = accountExample.validate(account);
        boolean isValid1 = accountExample.validate(account1);
        System.out.println("Account is " + account +" is valid: "+ isValid);
        System.out.println("Account is " + account +" is valid: "+ isValid1);

    }
}
