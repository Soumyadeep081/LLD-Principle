package Interface_Segregation_Principle.Example1.ProblematicCode;

public class Admin implements User {
    @Override
    public boolean canBuyProducts() {
        return true;
    }

    @Override
    public boolean canModifyProducts() {
        return true;
    }

    @Override
    public boolean canAddProducts() {
        return true;
    }

    @Override
    public boolean canApproveProducts() {
        return true;
    }

    @Override
    public void approveProduct() {
        System.out.println("Approves Products");
    }
}