package cool.scx.function;

@FunctionalInterface
public interface Function1<A, R, X extends Throwable> {

    R apply(A a) throws X;

}
