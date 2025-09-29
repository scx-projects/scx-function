package cool.scx.function;

@FunctionalInterface
public interface Function5<A, B, C, D, E, R, X extends Throwable> {

    R apply(A a, B b, C c, D d, E e) throws X;

}
