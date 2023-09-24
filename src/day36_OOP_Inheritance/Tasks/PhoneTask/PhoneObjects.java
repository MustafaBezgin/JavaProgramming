package day36_OOP_Inheritance.Tasks.PhoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        Samsung samsung1 = new Samsung();
        Nokia nokia1 = new Nokia();


        iphone1.setInfo("Apple", "iPhone 14 Pro Max", "Large", 1200, "Dark Purple");
        samsung1.setInfo("Samsung", "S23", "Large", 800, "Black");
        nokia1.setInfo("Nokia", "Something", "Medium", 50, "White");

        iphone1.faceTime("av.mustafabezgin@gmail.com");

        samsung1.freeze();

        nokia1.selfDefense();

        iphone1.call(123456789);

        nokia1.text(123456789);

        System.out.println(iphone1);
        System.out.println(samsung1);
        System.out.println(nokia1);




    }

}
