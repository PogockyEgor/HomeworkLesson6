public class CreditCard {
    String bankAccount;
    double balance;

    public CreditCard(String bankAccount, double balance) {
        this.bankAccount = bankAccount;
        this.balance = balance;
    }

    void increaseBalance(double sum){
        this.balance = this.balance + sum;
    }
    void decreaseBalance(double sum){
        this.balance = this.balance - sum;
    }
    void cardInfo(){
        System.out.println("Bank account: "+bankAccount+", balance: "+balance);
    }
}
