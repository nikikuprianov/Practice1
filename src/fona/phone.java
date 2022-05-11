package fona;
public class phone {
    public int number;
    String model;
    public String ownerName;
    double weight;
///////////////////////////////////////////////////////////
    public phone() {
    }
    public phone(int number, String model, String ownerName, double weight) {
        this.number = number;
        this.model = model;
        this.ownerName = ownerName;
        this.weight = weight;
    }
    public phone(int number, String model) {
        this.number = number;
        this.model = model;
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

