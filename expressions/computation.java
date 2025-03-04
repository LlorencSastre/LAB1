package expressions;
public class Computation {
    protected MyNumber firstOperand;
    protected Operator operator;
    protected MyNumber secondOperand;

    public Computation(MyNumber firstOperand, Operator operator, MyNumber secondOperand) {
        this.firstOperand = firstOperand;
        this.operator = operator;
        this.secondOperand = secondOperand;
    }

    public double evaluate() {
        return operator.compute(firstOperand, secondOperand);
    }
}