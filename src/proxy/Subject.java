package proxy;

/**
 * Subject类，定义了RealSubject和Proxy的共用接口。
 * 这样就在任何使用RealSubject的地方，都可以使用Proxy.
 */
abstract class Subject {
    public abstract void Request();
}
