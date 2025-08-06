package cool.scx.function;

@FunctionalInterface
public interface Function7<A, B, C, D, E, F, G, R, X extends Throwable> {

    R apply(A a, B b, C c, D d, E e, F f, G g) throws X;

}
