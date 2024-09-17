public class Test
{
    public static void main(String[] args){
        BankAcount bigSpendTime  = new BankAcount("Sigma", 512174, 100000000000.00, "pass");
        bigSpendTime.logIn("Sigma", "pass");
        System.out.println(bigSpendTime.getBalance());
        bigSpendTime.deposit(10.00);
        System.out.println(bigSpendTime.getBalance());
        bigSpendTime.withdrawl(1000);
        System.out.println(bigSpendTime.getBalance());
        System.out.println(bigSpendTime);
    }
}