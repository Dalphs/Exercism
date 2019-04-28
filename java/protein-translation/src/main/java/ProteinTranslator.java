import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {
        List<String> protein = new ArrayList<>();
        System.out.println(rnaSequence);
        for (int i = 0; i < rnaSequence.length() ; i += 3) {
            String proteinString = rnaSequence.charAt(i) + "" + rnaSequence.charAt(i + 1) + "" + rnaSequence.charAt(i + 2);
            String result = translateCodon(proteinString);
            System.out.println(proteinString + " " + result);
            if(result.equals(""))
                break;
            protein.add(translateCodon(proteinString));
        }
        return protein;
    }

    public String translateCodon(String proteinString){
        if(proteinString.equals("AUG"))
            return "Methionine";
        if(proteinString.equals("UUU") || proteinString.equals("UUC"))
            return "Phenylalanine";
        if(proteinString.equals("UUA") || proteinString.equals("UUG"))
            return "Leucine";
        if(proteinString.equals("UCU") || proteinString.equals("UCC") || proteinString.equals("UCA") || proteinString.equals("UCG"))
            return "Serine";
        if(proteinString.equals("UAU") || proteinString.equals("UAC"))
            return "Tyrosine";
        if(proteinString.equals("UGU") || proteinString.equals("UGC"))
            return "Cysteine";
        if(proteinString.equals("UGG"))
            return "Tryptophan";

        return "";
    }
}