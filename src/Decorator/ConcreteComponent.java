package Decorator;

public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.print("具体对象的操作 ConcreteComponent");
    }
}
