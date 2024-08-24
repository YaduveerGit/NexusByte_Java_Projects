//import java.util.*;
import java.lang.System;
//import java.lang.ATM;
import java.util.Scanner;

class ATM {
    float Balance =100000000;
    int PIN =5648;
    Scanner sc;
    public ATM() {
        sc = new Scanner(System.in); // Initialize Scanner in constructor
    }

        public void checkPin(){
        System.out.println("Enter the pin :");
    //    Scanner sc = new Scanner(System.in);
        int enteredpin =sc.nextInt();
        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Invalid Pin");
        }
    }

        public void menu(){
            System.out.println("1. Check Balance ");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
        //    Scanner sc=new Scanner(System.in);

            int choice =sc.nextInt();

            switch (choice) {
                case 1:
                checkBalance();
                    break;
                case 2:
                withdraw();
                break;
                case 3:
                depositMoney();
                break;
                case 4:
                System.out.println("Exiting");
                System.out.println(" Thank You for Visiting");
                break;
                default:
                System.out.println("Invalid choice");

            }
        }
        public void checkBalance(){
            System.out.println("Your balance is: " + Balance);
            menu();
        }
        
        public void withdraw(){

            System.out.println("Enter the amount to withdraw: ");
        //    Scanner sc=new Scanner(System.in);
            int withdraw=sc.nextInt();
            if(withdraw>Balance){
                System.out.println(" Insufficient Balance ");
            }

            else{
                Balance=Balance-withdraw;
                System.out.println("Money withdrawal successfully ..");
                checkBalance();
            }
            menu();
        }
        public void depositMoney(){
            System.out.println("Enter the amount :");
        //    Scanner sc = new Scanner(System.in);
            int deposit=sc.nextInt();
            Balance = Balance + deposit ;
            System.out.println("Money Deposited Successfully..");
            menu();
        }

                public static void main(String[] args) {
                    ATM obj = new ATM();
                    obj.checkPin();
                    }
                
                }
            
        
        