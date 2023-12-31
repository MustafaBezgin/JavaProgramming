package day58_MethodReferences_Comparator_Streams.double_colon_operators;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        // Zero Argument Constructor
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car :: new;
        System.out.println(c2.get().getModel());


        // One Argument Constructor
        Function<Integer, Car> f1 = model -> new Car(model);
        Function<Integer, Car> f2 = Car::new;

        Car mercedes = f2.apply(2005);
        Car bmw = f1.apply(2012);
        System.out.println(bmw + "\n" + mercedes.toString());

        // Two Arguments Constructor
        BiFunction<String, Integer, Car> f3 = (make, model) -> new Car();
        BiFunction<String, Integer, Car> f4 = Car::new;

        Car honda = f4.apply("Honda", 2015);
        System.out.println(honda.getMake() + " " + honda.getModel());


    }

}
