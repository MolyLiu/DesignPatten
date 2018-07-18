package strategy;

/**
 * 具体策略实现类。
 * 不参与任何优惠，返回原价
 */
public class StrategyNormal extends Strategy {

    //实现具体的策略方法

    /**
     *
     * @param money 原价
     * @return
     */
    @Override
    public double AlogrithmInterface(double money) {

        return money;
    }
}
