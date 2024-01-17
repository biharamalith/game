import java.util.Scanner;

public class puk {
    double electriBill;
    double customerType;
    double taxamount;
    double finalbillamount;

    double tax;
    public  void calbill() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter electriciyAmount ");
        electriBill =scanner.nextDouble();

        System.out.print ("Enter couster type ");
        customerType =scanner.nextDouble();

        if (customerType==1){
            tax=0.02;
        }else{
            tax=0.04;
        }
        taxamount=tax*electriBill;
        finalbillamount =electriBill+taxamount;
        System.out.println("Your final bill is: "+finalbillamount);

    }
}
