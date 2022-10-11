public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("BY67ACBB7939747300933",145.45);
        CreditCard card2 = new CreditCard("BY84PJCB7465865900933",5467.98);
        CreditCard card3 = new CreditCard("BY14ALFA7465865900933",249.04);

        card1.increaseBalance(80.45);
        card2.increaseBalance(1847.56);
        card3.decreaseBalance(76.13);

        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}