package strategy;

/**
 * 这是一个商场的收银软件
 * 运用策略设计模式
 * Content上下文，用具体策略类来配置，维护对策略类的引用
 */
public class CashContext {

    Strategy strategy=null;
    //根据客户端传需求，进行特定的 的实例化
    CashContext(String s){

        switch (s){
            case "正常计算":
                strategy=new StrategyNormal();
                break;
            case "打八折":
                CashRebate cashRebate=new CashRebate("0.8");
                strategy=cashRebate;
                break;
        }

    }
    public double getResult(double money){
        return strategy.AlogrithmInterface(money);
    }
}
