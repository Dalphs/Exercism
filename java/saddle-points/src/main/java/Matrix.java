import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {
    List<List<Integer>> values;

    Matrix(List<List<Integer>> values) {
        this.values = values;

    }

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> saddlePoints = new HashSet<>();

        for (int i = 0; i < values.get(0).size(); i++) {
            for (int j = 0; j < values.size(); j++) {
                int checker = values.get(j).get(i);
                boolean biggestInRow = true;
                boolean smallestInColumn = true;

                for (int k = i + 1; k % values.get(0).size() != i ; k++) {
                    System.out.println("forloop ran" + j + " " + k % values.get(0).size());
                    if(values.get(j).get(k % values.get(0).size()) > checker)
                        biggestInRow = false;
                }

                for (int k = j + 1; k % values.size() != j; k++) {
                    if(values.get(k % values.size()).get(i) < checker)
                        smallestInColumn = false;
                }
                if (biggestInRow && smallestInColumn) {
                    saddlePoints.add(new MatrixCoordinate(j, i));
                }
            }
        }
        return saddlePoints;
    }
}
