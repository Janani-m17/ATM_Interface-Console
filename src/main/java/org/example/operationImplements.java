package org.example;

import java.util.HashMap;
import java.util.Map;

public class operationImplements implements Operations{
    ATM a = new ATM();
    Map<Double, String> stmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance : "+ a.getBalance());
    }

    @Override
    public void withdrawAmount(double withdraw) {
        if(withdraw <= a.getBalance()) {
            stmt.put(withdraw, " Amount Withdrawn");
            System.out.println("Collect the Amount " + withdraw);
            a.setBalance(a.getBalance() - withdraw);
            viewBalance();
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void depositAmount(double deposit) {
        stmt.put(deposit, " Amount Deposited");
        System.out.println(deposit+" Deposited Successfully");
        a.setBalance(a.getBalance()+deposit);
        viewBalance();
    }

    @Override
    public void viewStatement() {
        for(Map.Entry<Double,String> m:stmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
