package cool.scx.function;

@FunctionalInterface
public interface Function3Void<A, B, C, X extends Throwable> {

    void apply(A a, B b, C c) throws X;

}
