package processjob.atm_simulator;

import java.util.HashMap;

public class BankAccounts {
    public double bankaccounts(int accountNr) {
        HashMap<Integer, Double> bankAccountList = new HashMap<Integer, Double>();
        //creates new hashmap for the sotring the bank balances

        bankAccountList.put(1, 1000.00);
        bankAccountList.put(2, 1000.00);
        bankAccountList.put(3, 1000.00);
        bankAccountList.put(4, 1000.00);
        bankAccountList.put(5, 1000.00);
        bankAccountList.put(6, 1000.00);


        if (bankAccountList.containsKey(accountNr)){
            System.out.println("Bank account number verified");
            return(bankAccountList.get(accountNr));
        }
        else{
            System.out.println("Such account does not exist");
            return(0);

        }


    }


}
