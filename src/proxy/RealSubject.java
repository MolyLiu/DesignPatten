package proxy;

/**
 * 定义Proxy所代表的的真实实体。
 */
public class RealSubject extends Subject{
    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}
