package cool.scx.function;

@FunctionalInterface
public interface Function8V<A, B, C, D, E, F, G, H, X extends Throwable> {

    void apply(A a, B b, C c, D d, E e, F f, G g, H h) throws X;

}
