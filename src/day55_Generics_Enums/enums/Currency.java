package day55_Generics_Enums.enums;

import java.lang.Enum;

public enum Currency{
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}