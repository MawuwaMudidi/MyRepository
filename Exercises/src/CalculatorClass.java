//implement this interface from 'CalculatorClass' and implement necessary functions.
class CalculatorClass implements Calculator {


    // Sum method
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    // Subtract method
    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiply method
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
    // Divide method
    @Override
    public double divide(double a, double b) {
        return a / b;
    }
    }
