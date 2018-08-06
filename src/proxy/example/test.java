package proxy.example;

public class test {
    public static void main(String[] args) {
        SchoolGirl jiaojiao=new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Proxy proxy=new Proxy(jiaojiao);

        proxy.GiveDolls();
        proxy.GiveFlowers();
        proxy.GiveChocolate();

    }
}
