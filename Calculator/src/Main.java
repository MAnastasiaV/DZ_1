public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2); // 3
        int b = calc.minus.apply(1, 1); // 0
        int c = calc.devide.apply(a, b); // 3/0 = 0 (ошибка - деление на 0)

        calc.println.accept(c);
    }
}