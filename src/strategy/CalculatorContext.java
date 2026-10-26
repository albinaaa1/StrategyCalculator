package strategy;

/**
 * Context: Holds a reference to a Strategy and delegates execution to it;
 * must support switching strategies at runtime without any if/switch inside.
 */
public class CalculatorContext {
    private OperationStrategy strategy;

    public CalculatorContext(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double a, double b) {
        return strategy.calculate(a, b);
    }
}