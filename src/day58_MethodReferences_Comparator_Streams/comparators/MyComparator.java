package day58_MethodReferences_Comparator_Streams.comparators;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {



    public int compare(Integer o1, Integer o2) {
        return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;

    }
}
