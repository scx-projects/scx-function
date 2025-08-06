package cool.scx.function;

@FunctionalInterface
public interface Function1V<A, X extends Throwable> {

    void apply(A a) throws X;

}
