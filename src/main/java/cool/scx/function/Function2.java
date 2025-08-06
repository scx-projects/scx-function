package cool.scx.function;

@FunctionalInterface
public interface Function2<A, B, R, X extends Throwable> {

    R apply(A a, B b) throws X;

}
