package day56_Lombok_LambdaExpressions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Apple {

    private double weight;
    private Color color;

}
