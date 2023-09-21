package class19;

public class bankCard {
    double balance;
    double interest;

    public bankCard (double balance){
      this.balance = balance;
      this.interest = 0.05;
    }

    public double calcInt (){
       return balance*interest;
    }
}
class VisaCard extends bankCard {
    public VisaCard (double balance){
        super(balance);
        this.interest = 0.05;
    }

}
class AmeEX extends bankCard {
    public AmeEX (double balance) {
        super(balance);
        this.interest = 0.07;
    }
    public double calcInt () {
        return balance * interest;
    }
}