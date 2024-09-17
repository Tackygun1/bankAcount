public class BankAcount
{
    //instance vars
    private String name;
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;
    //constructor 
    public BankAcount(String name, int accnum, double balance, String password){
        this.name = name;
        this.accountNum = accnum;
        this.balance = balance;
        this.password = password;
        this.loggedIn = false;

    }
    //mutator method - change the value of a private instance variable 
    // change the value of logged in
    public boolean logIn(String username, String password) 
    {
        if (username.equals(this.name) && password.equals(this.password)) {
            loggedIn = true; 
            return true;
        }else{
            return false;
        }
    }
    //accessor balance 
    //
    public double getBalance(){
        if (loggedIn == true){
            return balance;
        }else{
            throw new IllegalStateException("Not logged in");
        }

    }
    public boolean logOut(){
        loggedIn = false;
        return true;
    }
    public double deposit(double amount){
        if (loggedIn == true){
            balance += amount;
            return balance;
        }else{
            throw new IllegalAccessError("Not logged in");
        }
    }
    public double withdrawl(double amount){
        if (loggedIn == true){
            balance -= amount;
            return balance;
        }else{
            throw new IllegalAccessError("Not logged in");
        }
    }
    public String toString(){
        if (loggedIn == false){
            return "Account number: "+ this.accountNum;
        }else{
            return "Account number: "+this.accountNum+", Balance: "+this.balance;
        }
    }

}
