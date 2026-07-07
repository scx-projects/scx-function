package dev.scx.function;

/// Function7Void
///
/// @author scx567888
/// @see Function1
@FunctionalInterface
public interface Function7Void<A, B, C, D, E, F, G, X extends Throwable> {

    void apply(A a, B b, C c, D d, E e, F f, G g) throws X;

}
