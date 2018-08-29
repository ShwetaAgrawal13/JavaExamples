package CTSAssessment.OopsConcept;

import java.text.DecimalFormat;

public class Oops2ShipmentDecimalFormat {;
    private int id;
    private String shipperName;
    private String modeOfTransportation;

    private Float totalWeight;
    private String arrivalPort;
    private String departurePort;
    private static int nextShipmentId=1000;

    public Oops2ShipmentDecimalFormat(int id, String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort, String departurePort) {
        this.id=id;
        this.shipperName = shipperName;
        this.modeOfTransportation = modeOfTransportation;
        this.totalWeight = totalWeight;
        this.arrivalPort = arrivalPort;
        this.departurePort = departurePort;
    }

    public Oops2ShipmentDecimalFormat() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getModeOfTransportation() {
        return modeOfTransportation;
    }

    public void setModeOfTransportation(String modeOfTransportation) {
        this.modeOfTransportation = modeOfTransportation;
    }

    public Float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getArrivalPort() {
        return arrivalPort;
    }

    public void setArrivalPort(String arrivalPort) {
        this.arrivalPort = arrivalPort;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public void setDeparturePort(String departurePort) {
        this.departurePort = departurePort;
    }

    public static Oops2ShipmentDecimalFormat createNewShipment(String shipperName, String modeOfTransportation, Float totalWeight, String arrivalPort, String departurePort)
    {
        nextShipmentId=nextShipmentId+1;
          Oops2ShipmentDecimalFormat shipment=new Oops2ShipmentDecimalFormat(nextShipmentId,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort);
        return shipment;

    }

    @Override
    public String toString() {

//        String weight;
//        int length=this.getTotalWeight().toString().length();
//        if(totalWeight.toString().endsWith(".00") ) {
//            weight =this.getTotalWeight().toString().substring(0, length-3);}
//        else if(totalWeight.toString().endsWith(".0")){
//            weight =this.getTotalWeight().toString().substring(0, length-2);}
//        else
//            weight=this.getTotalWeight().toString();


        DecimalFormat df = new DecimalFormat("#.##");
        String weight =df.format(this.getTotalWeight());
        return String.format("%-15d%-15s%-25s%-15s%-20s%s",this.id,this.shipperName,this.modeOfTransportation,weight+"Kg",this.arrivalPort,this.departurePort);

    }
}
