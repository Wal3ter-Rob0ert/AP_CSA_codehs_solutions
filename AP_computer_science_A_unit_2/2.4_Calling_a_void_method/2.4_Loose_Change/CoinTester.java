public class CoinTester
{
    public static void main(String[] args) {

       // Create your program here
       Coins bank = new Coins(3, 2, 1, 4);

        bank.bankValue();

        bank.addQuarter();
        bank.addQuarter();
        bank.addDime();
        bank.addPenny();
        bank.addPenny();
        bank.addPenny();

        bank.bankCount();  
        bank.bankValue();  
    }
}