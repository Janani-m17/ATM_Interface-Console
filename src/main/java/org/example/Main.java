package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operations n = new operationImplements();
        int atmno = 9721;
        int atmpin = 1785;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ATM Number : ");
        int atmNo = s.nextInt();
        System.out.println("Enter PIN Number : ");
        int atmPin = s.nextInt();
        if((atmno == atmNo) && (atmpin == atmPin)) {
            while (true) {
                System.out.println("1. View Balance \n2. Withdraw Amount \n3. Deposit Amount \n4. Show Transaction History \n5. Exit");
                System.out.println("Enter Choice : ");
                int ch = s.nextInt();
                if(ch==1){
                    n.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter amount to withdrawn : ");
                    double withdrawAmount = s.nextDouble();
                    n.withdrawAmount(withdrawAmount);
                }
                else if(ch==3){
                    System.out.println("Enter amount to deposit : ");
                    double depositAmount = s.nextDouble();
                    n.depositAmount(depositAmount);
                }
                else if(ch==4){
                    n.viewStatement();
                }
                else if(ch==5){
                    System.out.println("Thank You");
                    System.exit(0);
                }
                else
                    System.out.println("Please enter valid choice");
            }
        }
        else {
            System.out.println("Invalid Credentials");
            System.exit(0);
        }
    }
}