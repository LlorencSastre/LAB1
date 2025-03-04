package expressions;

public class Main {
    public static void main(String[] args) {
        MyNumber num1 = new MyNumber(10);
        MyNumber num2 = new MyNumber(5);
        
        Operator addition = new Operator('+');
        System.out.println("10 + 5 = " + addition.compute(num1, num2)); // Output: 10 + 5 = 15.0
        
        Operator division = new Operator('/');
        System.out.println("10 / 5 = " + division.compute(num1, num2)); // Output: 10 / 5 = 2.0
    }
}