class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(10, 2);
        int b = calc.minus.apply(0, 0);
        int c = calc.devide.apply(a, b);

        calc.println.accept(c);
    }
}