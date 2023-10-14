import java.util.Scanner;

class Account{
    public int acc_no=123456789;
    public String name="Soabee";
    public int pin=567;
    static float acc_bal=0;
    /*public Account(int acc_no, String name, int acc_bal) {
        this.acc_no = acc_no;
        this.name = name;
        this.acc_bal = acc_bal;
    }*/
    Scanner s=new Scanner(System.in);
   
    public void menu(){
        System.out.println("Enter 1 for depositing an amount ");
        System.out.println("Enter 2 for withdrawing an amou1nt ");
        System.out.println("Enter 3 for checking balance ");
        System.out.println("Enter 4 to Exit ");
        System.out.println("Enter Your Choice:");
        int choice=s.nextInt();
        switch(choice){
            case 1->deposit();
            case 2->withdraw();
            case 3->checkBalance();
            case 4->System.out.println("Thanks you");
            default ->System.out.println("Enter a valid choice");
        }
    }
     public void checkCred(){
        System.out.println("Enter your account no:");
        int enteredaccno=s.nextInt();
        System.out.println("Enter the pin:");
        int enteredPin=s.nextInt();
        if(enteredaccno==acc_no&&enteredPin==pin){
            System.out.println("your name is "+name);
            menu();
        }
        else
            System.out.println("Please Enter a valid account number and pin!");
    }
    public void deposit(){
        System.out.println("Enter amount which you want to deposit: ");
        int amount=s.nextInt();
        acc_bal+=amount;
        System.out.println("Your updated balance is: "+acc_bal);
        menu();
    }
    public void withdraw(){
        System.out.println("Enter amount which you want to withdraw: ");
        int amount=s.nextInt();
        if(amount>acc_bal){
            System.out.println("Available balance is less than the entered amount");
        }
        else{
        acc_bal-=amount;
        System.out.println("Amount debited Successfully, Current balance is: "+acc_bal);
        }
        menu();
    }
    public void checkBalance(){
        System.out.println("Your Current Balance is: "+acc_bal);
        menu();
    }
}