package function;

public class FunctionOne extends Function {
    double total = 0;

    @Override
    public double fun(double x) {

        total = x * x * x + 4 * x * x - 10;
        return total;

    }
}
