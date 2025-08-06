package cool.scx.function;

@FunctionalInterface
public interface Function4<A, B, C, D, R, X extends Throwable> {

    R apply(A a, B b, C c, D d) throws X;

}
