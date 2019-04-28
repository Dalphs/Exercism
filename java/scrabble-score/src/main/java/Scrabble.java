class Scrabble {
    String word;

    Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    int getScore() {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'L' || c == 'N' || c == 'R' || c == 'S' || c == 'T')
                score += 1;
            else if (c == 'D' || c == 'G')
                score += 2;
            else if (c == 'B' || c == 'C' || c == 'M' || c == 'P')
                score += 3;
            else if (c == 'F' || c == 'H' || c == 'V' || c == 'W' || c == 'Y')
                score += 4;
            else if (c == 'K')
                score += 5;
            else if (c == 'J' || c == 'X')
                score += 8;
            else if (c == 'Q' || c == 'Z')
                score += 10;
        }
        return score;
    }

}
