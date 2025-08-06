package cool.scx.function;

@FunctionalInterface
public interface Function9Void<A, B, C, D, E, F, G, H, I, X extends Throwable> {

    void apply(A a, B b, C c, D d, E e, F f, G g, H h, I i) throws X;

}
