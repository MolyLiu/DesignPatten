package simpleFactory;

/**
 * 运算符 +
 */
public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return numberA+numberB;
    }
}
