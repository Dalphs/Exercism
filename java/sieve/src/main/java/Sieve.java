import java.util.ArrayList;
import java.util.List;

class Sieve {
    List<Integer> primes = new ArrayList<>();
    int maxPrime;

    Sieve(int maxPrime) {
        int[] numbers = new int[maxPrime - 1];

        for (int i = 2; i <= maxPrime; i++) {
            numbers[i - 2] = i;
        }

        for (int i = 0; i < maxPrime - 1; i++) {
            int checker = numbers[i];
            System.out.println(checker);
            if(checker > 1) {
                for (int j = i + 1; j < maxPrime - 1; j++) {
                    if(numbers[j] % checker == 0)
                        numbers[j] = 0;

                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0)
                primes.add(numbers[i]);
        }
    }

    List<Integer> getPrimes() {
        return primes;
    }
}
