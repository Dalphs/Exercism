class PrimeCalculator {

    int nth(int nth) {
        if(nth < 1)
            throw new IllegalArgumentException();
        int counter = 0;
        int checker = 2;
        int prime = 0;
        while(counter != nth){
            boolean isPrime = true;
            for (int i = 2; i < checker / 2 + 1; i++) {
                if(checker % i == 0)
                    isPrime = false;
            }
            if(isPrime) {
                prime = checker;
                counter++;
            }
            checker++;
        }
        return prime;
    }

}
