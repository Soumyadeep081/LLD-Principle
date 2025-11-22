package Interface_Segregation_Principle.Example1.ProblematicCode;

public class Buyer implements User{
    @Override
    public boolean canBuyProducts() {
        return true;
    }

    @Override
    public boolean canModifyProducts() {
        return false;
    }

    @Override
    public boolean canAddProducts() {
        return false;
    }

    @Override
    public boolean canApproveProducts() {
        return false;
    }

    @Override
    public void approveProduct() {

    }
}