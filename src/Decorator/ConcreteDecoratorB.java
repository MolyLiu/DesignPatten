package Decorator;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void Operation() {
        super.Operation();
//首先运行原Component的Operation().再执行本类的功能，相当于对原Component进行了装饰。
        AddedBehavior();
        System.out.print("具体装饰对象B的操作 ConcreteDecoratorB");
    }

    /**
     * 本类特有的方法，用来区别于ConcreteDecoratorA
     */
    public  void AddedBehavior(){
        System.out.print("new State");
    }
}
