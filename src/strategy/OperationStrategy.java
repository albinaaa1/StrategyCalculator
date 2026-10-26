package strategy;

/**
 * Strategy Interface: Declares the algorithm's execution method, common to all strategies.
 */
public interface OperationStrategy {
    double calculate(double a, double b);
}