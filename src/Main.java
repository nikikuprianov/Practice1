import fona.phone;
public class Main {
    public static void main(String[] args) {
        phone Phone1 = new phone();
        phone Phone2 = new phone(88005535, "Galaxy s7");
        phone Phone3 = new phone(228691337, "Galaxy s10", "Вован", 0.220);


        Phone1.reciveCall(Phone2.getOwnerName());
        Phone2.reciveCall(Phone3.getOwnerName());
        Phone3.reciveCall(Phone1.getOwnerName());


        Phone1.receiveCall(Phone1.getOwnerName(), Phone1.getNumber());


        System.out.println(Phone1.getNumber());;


        Phone1.receiveMessage("lol kek");
    }
}
