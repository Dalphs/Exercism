class Triangle {
    double side1;
    double side2;
    double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {

        if (side1 + side2 <= side3 || side1 + side3 <= side2 ||side3 + side2 <= side1 ||
        side1 == 0 || side2 == 0 || side3 == 0)
            throw new TriangleException();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return (side1 == side2 && side1 == side3);
    }

    boolean isIsosceles() {
        System.out.println((side1 == side2 || side2 == side3 || side1 == side3));
        return (side1 == side2 || side2 == side3 || side1 == side3);
    }

    boolean isScalene() {
        return (side1 != side2 && side1 != side3 && side2 != side3);
    }

}
