package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";


        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 2;
        dog2.gender = 'M';
        dog2.size = "Medium";
        dog2.color = "White & Black";


        Dog dog3 = new Dog();
        dog3.setInfo("Jack", 7, 'F', "German Shepard", "Small", "Brown");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", 3, 'M', "Labrador", "Extra Large", "Yellow");

        Dog dog5 = new Dog();
        dog5.setInfo("Sully", 6, 'M', "Pit-Bull", "Large", "Black");

        System.out.println("\n-----------------------------------------------------------\n");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();


        // BY USING REMOVE IF
        femaleDogs.addAll(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'M');

        System.out.println(femaleDogs);


        // BY USING FOREACH LOOP
        for (Dog each : dogs) {
            if(each.gender == 'M'){
            maleDogs.add(each);
            }
        }

        System.out.println(maleDogs);

    }

}
