package Interface_Segregation_Principle.Example2.BetterCode;

import Interface_Segregation_Principle.Example2.ProblematicCode.Account;

public interface ILoan extends IAccount {
    public void payEMI();

}