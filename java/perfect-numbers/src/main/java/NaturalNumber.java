class NaturalNumber {
    int number;

    public NaturalNumber(int number) {
        this.number = number;
    }

    public Classification getClassification(){
        int aliquotSum = 0;
        for (int i = 1; i < number / 2 + 1; i++) {
            if(number % i == 0)
                aliquotSum += i;
        }
        if(number == aliquotSum)
            return Classification.PERFECT;
        if(number < aliquotSum)
            return Classification.ABUNDANT;
        if (number > aliquotSum)
            return Classification.DEFICIENT;

        return null;

    }
}
