package proxy.example;

/**
 * 代理类，代替追求者类给女生送礼物
 */
public class Proxy implements GIveGift {
    Pursuit pursuit;
    public Proxy(SchoolGirl schoolGirl){
        pursuit=new Pursuit(schoolGirl);
    }

    @Override
    public void GiveDolls() {
        pursuit.GiveDolls();
    }

    @Override
    public void GiveFlowers() {
        pursuit.GiveFlowers();
    }

    @Override
    public void GiveChocolate() {
        pursuit.GiveChocolate();
    }
}
