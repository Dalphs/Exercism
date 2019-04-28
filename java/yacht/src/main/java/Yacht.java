class Yacht {
    int[] dice;
    YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.yachtCategory = yachtCategory;
        this.dice = dice;
    }

    int score() {
        switch (yachtCategory){
            case YACHT:
                if(countSingles(dice[0]) == 5)
                return 50;
                break;
            case ONES:
                return countSingles(1) * 1;
            case TWOS:
                return countSingles(2) * 2;
            case THREES:
                return countSingles(3) * 3;
            case FOURS:
                return countSingles(4) * 4;
            case FIVES:
                return countSingles(5) * 5;
            case SIXES:
                return countSingles(6) * 6;
            case FULL_HOUSE:
                int value1 = dice[0];
                int value2 = 0;
                int counterValue1;
                int counterValue2;
                for (int i = 1; i < dice.length; i++) {
                    if(dice[i] != value1)
                        value2 = dice[i];
                }
                counterValue1 = countSingles(value1);
                counterValue2 = countSingles(value2);
                if ((counterValue1 == 2 || counterValue1 == 3) && (counterValue2 == 2 || counterValue2 == 3))
                    return value1 * counterValue1 + value2 * counterValue2;
                break;
            case FOUR_OF_A_KIND:
                for (int i = 0; i < dice.length; i++) {
                    if (countSingles(dice[i]) == 4 || countSingles(dice[i]) == 5)
                        return dice[i] * 4;
                }
                break;
            case LITTLE_STRAIGHT:
                for (int i = 0; i < dice.length - 1; i++) {
                    for (int j = i + 1; j < dice.length; j++) {
                        if(dice[i] == dice[j])
                            return 0;
                    }
                }
                for (int i = 0; i < dice.length; i++) {
                    if(dice[i] > 5)
                        return 0;
                }
                return 30;
            case BIG_STRAIGHT:
                for (int i = 0; i < dice.length - 1; i++) {
                    for (int j = i + 1; j < dice.length; j++) {
                        if(dice[i] == dice[j])
                            return 0;
                    }
                }
                for (int i = 0; i < dice.length; i++) {
                    if(dice[i] < 2)
                        return 0;
                }
                return 30;
            case CHOICE:
                int sum = 0;
                for (int i = 0; i < dice.length; i++) {
                    sum += dice[i];
                }
                return sum;

        }
        return 0;
    }

    int countSingles(int checker){
        int counter = 0;
        for (int i = 0; i < dice.length; i++) {
            if(dice[i] == checker)
                counter++;
        }
        return counter;
    }

}
