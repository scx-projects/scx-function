package cool.scx.function;

@FunctionalInterface
public interface Function9<A, B, C, D, E, F, G, H, I, R, X extends Throwable> {

    R apply(A a, B b, C c, D d, E e, F f, G g, H h, I i) throws X;

}
