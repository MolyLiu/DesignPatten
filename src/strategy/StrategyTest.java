package strategy;

public class StrategyTest {

    public static void main(String[] args) {
        CashContext context=new CashContext("打八折");
        System.out.print(context.getResult(100));


    }
}
