import fona.phone;
public class Main {
    public static void main(String[] args) {
        phone Phone1 = new phone(880055535, "Galaxy s4", "alex", 0.150);
        phone Phone3 = new phone(228691337, "Galaxy s10");


        Phone1.reciveCall(Phone1.ownerName);
        Phone1.reciveCall(Phone1.ownerName);
        Phone1.reciveCall(Phone1.ownerName);


        Phone1.receiveCall(Phone1.ownerName, Phone1.number);


        System.out.println(Phone1.getNumber());;


        Phone1.receiveMessage("lol kek");
    }
}
