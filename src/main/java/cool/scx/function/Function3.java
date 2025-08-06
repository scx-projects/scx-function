package cool.scx.function;

@FunctionalInterface
public interface Function3<A, B, C, R, X extends Throwable> {

    R apply(A a, B b, C c) throws X;

}
