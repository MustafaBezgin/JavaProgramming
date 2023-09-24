package day18_NestedLoop;

public class CN_Task3_Triangle {

    public static void main(String[] args) {
        
        String str = "* ";

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                System.out.print(str);

                if (i == j) {
                    break;
                }
            }

            System.out.println();
        }
        
    }
    
}
