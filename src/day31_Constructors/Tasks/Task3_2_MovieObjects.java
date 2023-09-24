package day31_Constructors.Tasks;

public class Task3_2_MovieObjects {

    public static void main(String[] args) {

        Task3_1_Movie movie1 = new Task3_1_Movie("USA", "Journey to SDET: Cydeo Batch 25", "Adventure, Comedy, Thriller",
                "10/25/2021", "Kuzzat Altay");

        movie1.addCast("Asiya");

        String[] casts = {"Adam", "Muhtar", "Mustafa", "Fatih", "Baha", "Orhan", "Selim"};

        movie1.addCasts(casts);

        System.out.println(movie1);


    }


}
