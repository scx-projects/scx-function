package cool.scx.function;

@FunctionalInterface
public interface Function6V<A, B, C, D, E, F, X extends Throwable> {

    void apply(A a, B b, C c, D d, E e, F f) throws X;

}
