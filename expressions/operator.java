package expressions;
public class Operator {
    private char operation; // Stores the operation (+, -, *, /)

    // Constructor
    public Operator(char operation) {
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            throw new RuntimeException("Invalid operation: " + operation);
        }
        this.operation = operation;
    }

    // Compute the result of applying the operation to two MyNumber operands
    public double compute(MyNumber first, MyNumber second) {
        switch (operation) {
            case '+':
                return first.getValue() + second.getValue();
            case '-':
                return first.getValue() - second.getValue();
            case '*':
                return first.getValue() * second.getValue();
            case '/':
                if (second.getValue() == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return first.getValue() / second.getValue();
            default:
                throw new RuntimeException("Unsupported operation: " + operation);
        }
    }

    // Getter for operation
    public char getOperation() {
        return operation;
    }

    // Setter for operation
    public void setOperation(char operation) {
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            throw new RuntimeException("Invalid operation: " + operation);
        }
        this.operation = operation;
    }
}