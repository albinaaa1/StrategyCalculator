package strategy;

/**
 * Client: Selects and configures the appropriate strategy.
 */
public class Main {
    public static void main(String[] args) {
        // Инициализация контекста со стратегией сложения
        CalculatorContext context = new CalculatorContext(new AdditionStrategy());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        // Смена стратегии на умножение «на лету» (runtime switching)
        context.setStrategy(new MultiplicationStrategy());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        // Смена стратегии на деление
        context.setStrategy(new DivisionStrategy());
        System.out.println("20 / 4 = " + context.executeStrategy(20, 4));
    }
}