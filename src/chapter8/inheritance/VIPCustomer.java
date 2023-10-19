package chapter8.inheritance;

public class VIPCustomer extends Customer {
    double saleRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName); // 상위 클래스 생성자 호출
        this.customerGrade = "VIP";
        this.bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
    }

    @Override
    public int calcPrice(int price2) {
        bonusPoint += price2 * bonusRatio;
        return price2 - (int)(price2 * saleRatio);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다.";
    }


    // getter, setter
    public int getAgentID() {
        return agentID;
    }

    public void setAgentID(int agentID) {
        this.agentID = agentID;
    }
}
