import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        char space = ' ';
        int endLetter = (int) a;
        List<String> lines = new ArrayList<>();
        int length = (endLetter - 64) * 2 - 1;
        System.out.println(length);
        for (int i = 0; i < length / 2 + 1; i++) {
            char[] line = new char[length];

            for (int j = 0; j < line.length; j++) {
                line[j] = ' ';
            }
            if (i == 0 || i == line.length - 1)
                line[line.length / 2] = 'A';
            else{
                line[length / 2 + i] = (char) (65 + i);
                line[length / 2 - i] = (char) (65 + i);
            }
            lines.add(new String(line));
        }
        for (int i = length / 2 + 1; i < length; i++) {
            lines.add(lines.get(length - i - 1));
        }
        return lines;
    }

}
