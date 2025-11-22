package Interface_Segregation_Principle.Example1.ProblematicCode;

public interface User {

    boolean canBuyProducts();

    boolean canModifyProducts();

    boolean canAddProducts();

    boolean canApproveProducts();

    void approveProduct();
}