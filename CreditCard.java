package Homework17;

public class CreditCard {
    //Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.

    int balance;
    double interest;
  double CalculateInterest(){
        balance=500;
        interest=17.65;


        return (interest*balance)/100;
    }


}
class Visa extends CreditCard{


}
class AX extends CreditCard{

    double CalculateInterest(){
        interest=18.00;
        balance=1500;

        return (interest*balance)/100;
    }


}
class  CreditCardTester {
    public static void main(String[] args) {

        CreditCard cc = new CreditCard();
        System.out.println(cc.CalculateInterest());
        Visa v=new Visa();
        System.out.println(v.CalculateInterest());
        AX ax=new AX();
        System.out.println(ax.CalculateInterest());


    }
}

