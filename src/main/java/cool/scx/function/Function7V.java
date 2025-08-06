package cool.scx.function;

@FunctionalInterface
public interface Function7V<A, B, C, D, E, F, G, X extends Throwable> {

    void apply(A a, B b, C c, D d, E e, F f, G g) throws X;

}
