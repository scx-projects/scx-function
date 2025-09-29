package cool.scx.function;

@FunctionalInterface
public interface Function8<A, B, C, D, E, F, G, H, R, X extends Throwable> {

    R apply(A a, B b, C c, D d, E e, F f, G g, H h) throws X;

}
