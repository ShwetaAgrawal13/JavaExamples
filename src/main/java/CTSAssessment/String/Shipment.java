package CTSAssessment.String;

import java.util.Date;

public class Shipment {

    String id;
    Date dispatchDate;
    Date arrivalDate;

    public Shipment(String id, Date dispatchDate, Date arrivalDate) {
        this.id = id;
        this.dispatchDate = dispatchDate;
        this.arrivalDate = arrivalDate;
    }

    public Shipment() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int compareTo(Date D1, Date D2) {
        if(D1.equals(D2)) {
            return 0;
        }
        return -1;
    }

   }

