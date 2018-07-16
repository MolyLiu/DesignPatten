package simpleFactory;

/**
 * 简单工厂模式
 * 运算符 -
 */
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return numberA-numberB;
    }
}
