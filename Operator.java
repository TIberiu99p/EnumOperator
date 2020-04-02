import java.util.*;
import java.util.function.DoubleBinaryOperator;

enum Operator implements DoubleBinaryOperator{
    //enum fields
    PLUS("+",(a, b) -> a + b),
    MINUS("-",(a,b) -> a - b), 
    TIMES("*",(a,b) -> a * b);

    private final String symbol;
    private final DoubleBinaryOperator binaryOperator;

    private Operator(final String symbol, final DoubleBinaryOperator binaryOperator) {
        this.symbol = symbol;
        this.binaryOperator = binaryOperator;
    }

    public String toString(){
        return symbol;
    }

    @Override
    public double applyAsDouble(final double left, final double right) {
        
        return binaryOperator.applyAsDouble(left, right);
    }

}