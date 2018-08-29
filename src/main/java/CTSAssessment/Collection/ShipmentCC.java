package CTSAssessment.Collection;

public class ShipmentCC {
   private String shipmentName;
   private String agentName;
   private String customerName;

    public ShipmentCC() {

    }

    public String getShipmentName() {
        return shipmentName;
    }

    public void setShipmentName(String shipmentName) {
        this.shipmentName = shipmentName;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ShipmentCC(String shipmentName, String agentName, String customerName) {
        this.shipmentName = shipmentName;
        this.agentName = agentName;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return System.out.format("%-15s %-15s %s\n",this.shipmentName,this.customerName,this.agentName).toString();
    }
}
