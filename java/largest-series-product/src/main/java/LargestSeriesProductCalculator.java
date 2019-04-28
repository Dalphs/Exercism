class LargestSeriesProductCalculator {
    String inputNumber;

    LargestSeriesProductCalculator(String inputNumber) {
        this.inputNumber = inputNumber;

        for (int i = 0; i < inputNumber.length(); i++) {
            int value = (int) inputNumber.charAt(i) - 48;
            if (!(value >= 0 && value < 10))
                throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        if(inputNumber.length() < numberOfDigits)
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");

        long product = inputNumber.equals("") ? 1 : 0;
        long comparator;
        System.out.println(inputNumber);

        for (int i = 0; i < inputNumber.length() - numberOfDigits + 1; i++) {
            comparator = 1;
            for (int j = i; j < i + numberOfDigits; j++) {
                int value = (int) inputNumber.charAt(j) - 48;
                comparator *= value;
            }
            System.out.println(comparator);
            if (comparator > product)
                product = comparator;
        }

        return product;
    }
}
