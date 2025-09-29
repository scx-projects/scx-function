package cool.scx.function;

@FunctionalInterface
public interface Function2Void<A, B, X extends Throwable> {

    void apply(A a, B b) throws X;

}
