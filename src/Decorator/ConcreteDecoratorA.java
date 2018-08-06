package Decorator;

public class ConcreteDecoratorA extends Decorator{
    //本类的独有功能，区别于ConcreteDecoratorA
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        //首先运行原Component的Operation(),在执行本类的功能，相当于对原Component进行装饰。
        addedState="New State";

        System.out.print("具体装饰对象A的操作  ConcreteDecoratorA"+addedState);
    }
}
