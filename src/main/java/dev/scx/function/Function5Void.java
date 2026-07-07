package dev.scx.function;

/// Function5Void
///
/// @author scx567888
/// @see Function1
@FunctionalInterface
public interface Function5Void<A, B, C, D, E, X extends Throwable> {

    void apply(A a, B b, C c, D d, E e) throws X;

}
