import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

class SumOfMultiples {
    int number;
    int[] set;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
    }

    int getSum() {
        Set<Integer> multiples = new LinkedHashSet<>();
        int sum = 0;

        for (int i = 0; i < set.length; i++) {
            int checker = set[i];
            if(checker > 0) {
                for (int j = checker; j < number; j += checker) {
                    multiples.add(j);
                }
            }
        }

        System.out.println("Arraylist" + multiples);
        for (Integer i: multiples) {
            sum += i;
        }

        return sum;
    }

}
