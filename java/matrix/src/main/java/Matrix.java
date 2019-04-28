import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

class Matrix {
    ArrayList<ArrayList> rows = new ArrayList<>();

    Matrix(String matrixAsString) {
        Scanner scanner = new Scanner(matrixAsString);
        while (scanner.hasNext()) {
            ArrayList<Integer> row = new ArrayList<>();
            String rowAsSrtring = scanner.nextLine();
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < rowAsSrtring.length(); i++) {
                int value = (int) rowAsSrtring.charAt(i) - 48;

                if (value >= 0 && value < 10 && i != rowAsSrtring.length() - 1)
                    stack.add(value);
                else {
                    if(value >= 0 && value < 10)
                        stack.add(value);
                    int sum = 0;
                    int multiplier = (int) Math.pow(10, stack.size() - 1);
                    for (Integer j : stack) {
                        sum += j * multiplier;
                        multiplier /= 10;
                    }
                    row.add(sum);
                    stack.clear();
                }
            }
            rows.add(row);
            System.out.println(row);
        }
    }

    int[] getRow(int rowNumber) {
        ArrayList<Integer> rowFromMatrix = rows.get(rowNumber);
        int[] row = new int[rows.get(rowNumber).size()];

        for (int i = 0; i < row.length; i++) {
            row[i] = rowFromMatrix.get(i);
        }
        return row;
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[rows.size()];

        for (int i = 0; i < column.length; i++) {
            ArrayList<Integer> row = rows.get(i);
            column[i] = row.get(columnNumber);
        }
        return column;
    }
}
