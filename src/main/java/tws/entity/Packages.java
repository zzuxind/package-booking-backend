package tws.entity;

public class Packages {
    private String key;
    private String ordernumber;
    private String receiver;
    private String telephone;
    private int weight;
    private String status;
    private String ordertime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(String ordertime) {
        this.ordertime = ordertime;
    }



    public Packages(String key,String ordernumber, String receiver, String telephone, int weight,String status,String ordertime) {
        this.key=key;
        this.ordernumber = ordernumber;
        this.receiver = receiver;
        this.telephone = telephone;
        this.weight = weight;
        this.status=status;
        this.ordernumber=ordernumber;
    }

    public Packages() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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

