class IsogramChecker {

    boolean isIsogram(String phrase) {
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = false;
        }

        String upperCasePhrase = phrase.toUpperCase();
        char[] word = upperCasePhrase.toCharArray();

        for (int i = 0; i < word.length; i++) {
            int value = ((int) word[i]) - 65;
            System.out.println(value);
            if(value >= 0 && value <= 25)
                if (!alphabet[value])
                    alphabet[value] = true;
                else
                    return false;
        }
        return true;
    }

}
