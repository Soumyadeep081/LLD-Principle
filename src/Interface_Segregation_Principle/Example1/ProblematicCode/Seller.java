package Interface_Segregation_Principle.Example1.ProblematicCode;


public class Seller implements User{
    @Override
    public boolean canBuyProducts() {
        return false;
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
        return false;
    }

    @Override
    public void approveProduct() {

    }
}