package day19_LoopPractices;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) //Süslü parantez olmadan yalnızca ilk ifade tekrar edilir. İkinci ifade için yeniden for loop tanımlamak gerekir.
            System.out.println("Cydeo");

        for (int i = 0; i < 5; i++) {
            System.out.println("Batch 25");
        }


    }


}
