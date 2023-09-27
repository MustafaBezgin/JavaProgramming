package day58_MethodReferences_Comparator_Streams.double_colon_operators;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {

    private String make;
    private int model;

    public Car(int model) {
        this.model = model;
    }
}
