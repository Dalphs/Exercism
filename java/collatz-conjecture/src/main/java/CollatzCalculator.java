class CollatzCalculator {

    int computeStepCount(int start) {
        if(start < 1)
            throw new IllegalArgumentException("Only natural numbers are allowed");
        int counter = 0;
        while (start > 1)
            if(start % 2 == 0){
                start /= 2;
                counter++;
            } else{
                start = start * 3 + 1;
                counter++;
            }
            return counter;
    }

}
