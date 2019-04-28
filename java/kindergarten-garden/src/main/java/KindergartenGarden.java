import java.util.*;

class KindergartenGarden {
    String garden;
    Map students = new HashMap();

    KindergartenGarden(String garden) {
        this.garden = garden;

        students.put("Alice", 1);
        students.put("Bob", 2);
        students.put("Charlie", 3);
        students.put("David", 4);
        students.put("Eve", 5);
        students.put("Fred", 6);
        students.put("Ginny", 7);
        students.put("Harriet", 8);
        students.put("Ileana", 9);
        students.put("Joseph", 10);
        students.put("Kincaid", 11);
        students.put("Larry", 12);


    }

    List<Plant> getPlantsOfStudent(String student) {
        List<Plant> plants = new ArrayList<>();
        Scanner scanner = new Scanner(garden);
        while(scanner.hasNext()) {
            String next = scanner.next();
            for (int i = 2; i > 0; i--) {
                char c = next.charAt(Integer.parseInt(students.get(student).toString()) * 2 - i);
                Plant plant;
                switch (c) {
                    case 'V':
                        plant = Plant.VIOLETS;
                        break;
                    case 'R':
                        plant = Plant.RADISHES;
                        break;
                    case 'G':
                        plant = Plant.GRASS;
                        break;
                    case 'C':
                        plant = Plant.CLOVER;
                        break;
                    default:
                        plant = null;
                }
                plants.add(plant);
            }
        }
        return plants;
    }

}
