package proxy.example;

/**
 * 追求者类
 */
public class Pursuit implements GIveGift{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm){
        this.mm=mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println("追求者给"+mm.getName()+"洋娃娃");
    }

    @Override
    public void GiveFlowers() {
        System.out.println("追求者给"+mm.getName()+"鲜花");
    }

    @Override
    public void GiveChocolate() {
        System.out.println("追求者给"+mm.getName()+"巧克力");
    }
}
