package cool.scx.function;

@FunctionalInterface
public interface Function6<A, B, C, D, E, F, R, X extends Throwable> {

    R apply(A a, B b, C c, D d, E e, F f) throws X;
    
}
