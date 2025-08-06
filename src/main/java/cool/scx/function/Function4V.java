package cool.scx.function;

@FunctionalInterface
public interface Function4V<A, B, C, D, X extends Throwable> {

    void apply(A a, B b, C c, D d) throws X;

}
