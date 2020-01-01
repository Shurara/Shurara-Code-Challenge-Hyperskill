class Calculator {
    private CalculatorEngine engine;

    public Calculator(CalculatorEngine engine) {
        this.engine = engine;
    }

    public String divide(int a, int b) {
        String result = "";
        try {
            result = String.format("Division of %d by %d = %d", a, b, engine.divide(a, b));
        } catch (ArithmeticException e) {
            result = "Division by zero is prohibited";
        }
        return result;
    }
}