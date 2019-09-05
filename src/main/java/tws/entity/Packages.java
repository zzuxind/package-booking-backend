package tws.entity;

public class Packages {
    private String ordernumber;
    private String receiver;
    private String telephone;
    private int weight;

    public Packages(String ordernumber, String receiver, String telephone, int weight) {
        this.ordernumber = ordernumber;
        this.receiver = receiver;
        this.telephone = telephone;
        this.weight = weight;
    }

    public Packages() {
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

