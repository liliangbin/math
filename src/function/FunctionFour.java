package function;

public class FunctionFour extends Function {

    double total;

    @Override
    public double fun(double x) {

        total = x - (x * x * x - x - 1) / (3 * x * x - 1);
        return total;
    }
}
