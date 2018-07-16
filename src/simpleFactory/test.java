package simpleFactory;

public class test {
    public static void main(String[] args) {
        Operation operation;
        operation=OperationFactory.createOperation("+");
        operation.numberA=1;
        operation.numberB=2;
        System.out.print(operation.getResult());
    }



}
