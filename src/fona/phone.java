package fona;
public class phone {
    private int number;
    private String model;
    private String ownerName;
    private double weight;


    ///////////////////////////////////////////////////////////
    public void setNumber(int number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
/////////////////////////////////////////////////////////////
    public phone() {
        this.number = 4941414;
        this.model = "Galaxy s4";
        this.ownerName = "Зак";
        this.weight = 0.160;
    }

    public phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.ownerName = "Евгений";
        this.weight = 0.228;
    }
    public phone(int number, String model, String ownerName, double weight) {
        this(number, model);
        this.ownerName = ownerName;
        this.weight = weight;
    }
//////////////////////////////////////////////////////////////////
    public void reciveCall(String ownerName) {
        System.out.println("Calling: " + ownerName);
    }
    public int getNumber() {
        return number;
    }
    public void receiveCall(String ownerName, int number) {
    }
/////////////////////////////////////////////////////////////////
    public void sendMessage(phone a, String message){
        a.receiveMessage(message);
    }
    public void receiveMessage(String message){
        System.out.println(message);
    }
}

