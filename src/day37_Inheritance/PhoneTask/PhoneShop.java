package day37_Inheritance.PhoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        IPhone iphone = new IPhone("Iphone 12", "6.7 inches", 1000, "Black");

        Samsung samsung = new Samsung("Galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("\n-----------------------------------------------------------\n");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("\n-----------------------------------------------------------\n");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();

        System.out.println("\n-----------------------------------------------------------\n");

        System.out.println(Phone.hasBattery);
        System.out.println(IPhone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }

}