package strategy;

/**
 * 这是一个商场的收银软件
 * 运用策略设计模式
 * Content上下文，用具体策略类来配置，维护对策略类的引用
 */
public class CashContext {

    Strategy strategy=null;
    //根据客户端传需求，进行特定的 的实例化
    public CashContext(String s){

        switch (s){
            case "...":
                strategy=new StrategyA();
                break;
        }

    }
    public double getResult(){
        return strategy.AlogrithmInterface();
    }
}
