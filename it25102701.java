class main {

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int exp1 = calc.square(
                        calc.add(
                            calc.multiply(3, 4),
                            calc.multiply(5, 7)
                        )
                    );

        int exp2 = calc.add(
                        calc.square(calc.add(4, 7)),
                        calc.square(calc.add(8, 3))
                    );

        System.out.println("(3*4 + 5*7)^2 = " + exp1);
        System.out.println("(4+7)^2 + (8+3)^2 = " + exp2);
    }
}