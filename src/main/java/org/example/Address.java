package org.example;

public class Address {

    String plotNo;
    String pincode;
    String locality;

    public String getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(String plotNo) {
        this.plotNo = plotNo;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Address(String plotNo, String pincode, String locality) {
        this.plotNo = plotNo;
        this.pincode = pincode;
        this.locality = locality;
    }
}
