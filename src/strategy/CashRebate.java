package strategy;

/**
 * 具体策略类。
 * 打折优惠。经过打折计算，返回最后价格
 */
public class CashRebate  extends  Strategy{
    //定义折扣变量，初始值为1 不打折
    private double moneyRebate=1;
    //实例化时，传入折扣参数。
    public CashRebate(String moneyRebate){
        this.moneyRebate=Double.parseDouble(moneyRebate);
    }
    @Override
    public double AlogrithmInterface(double money) {
        return money*moneyRebate;
    }
}
