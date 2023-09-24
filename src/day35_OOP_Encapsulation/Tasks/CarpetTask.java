package day35_OOP_Encapsulation.Tasks;

public class CarpetTask {

    public static void main(String[] args) {

        Carpet carpet = new Carpet(4,5,3.5, false);

        System.out.println(carpet);

        carpet.setPersian(true);
        carpet.setUnitPrice(8);
        carpet.setWidth(7);
        carpet.setLength(6);

        System.out.println(carpet);

    }


}
