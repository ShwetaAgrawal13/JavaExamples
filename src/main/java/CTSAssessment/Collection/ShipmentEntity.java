package CTSAssessment.Collection;

public class ShipmentEntity implements Comparable<ShipmentEntity>{
    Integer id;
    String name;
    String accountNumber;
    String identificationNumber;

    ShipmentEntity()
    {

    }

    ShipmentEntity(Integer id, String name, String acountNumber, String identificationNumber)
    {
     this.id=id;
     this.name=name;
     this.accountNumber=acountNumber;
     this.identificationNumber=identificationNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public int compareTo(ShipmentEntity shipmentEntity)
    {
      int compare= this.accountNumber.compareTo(shipmentEntity.accountNumber.substring(0,2));
    //  int compare1=thi
      return compare;

    }
}
