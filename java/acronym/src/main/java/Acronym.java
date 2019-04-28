class Acronym {
    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String acronym = "";

        int charValue = (int) phrase.charAt(0);
        if ((charValue >= 65 && charValue <= 90) || (charValue >= 97 && charValue <= 122) )
            acronym += phrase.charAt(0);

        for (int i = 1; i < phrase.length(); i++) {
            if(phrase.charAt(i - 1) == ' ' || phrase.charAt(i - 1) == '_' || phrase.charAt(i - 1) == '-'){
                charValue = (int) phrase.charAt(i);
                if ((charValue >= 65 && charValue <= 90) || (charValue >= 97 && charValue <= 122) )
                    acronym += phrase.charAt(i);
            }
        }
        return acronym.toUpperCase();
    }

}
