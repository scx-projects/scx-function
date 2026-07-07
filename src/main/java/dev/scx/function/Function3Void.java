package dev.scx.function;

/// Function3Void
///
/// @author scx567888
/// @see Function1
@FunctionalInterface
public interface Function3Void<A, B, C, X extends Throwable> {

    void apply(A a, B b, C c) throws X;

}
