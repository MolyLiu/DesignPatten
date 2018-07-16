package simpleFactory;

/**
 * 简单工厂模式
 * 工厂类：进行统一实例化的类。
 */
public class OperationFactory {
    //静态方法 。不需要实例化就可以使用
    public static Operation createOperation(String operation){
        Operation opera=null;
        switch (operation){
            case "+":
                opera=new OperationAdd();
                break;
            case "-":
                opera=new OperationSub();
                break;
            case "*":
                opera=new OperationDiv();
                break;
            case "/":
                opera=new OperationMul();
                break;
        }
        return opera;
    }
}
