package cool.scx.function;

@FunctionalInterface
public interface Function2V<A, B, X extends Throwable> {

    void apply(A a, B b) throws X;

}
