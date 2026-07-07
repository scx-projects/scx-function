package dev.scx.function;

/// Function3
///
/// @author scx567888
/// @see Function1
@FunctionalInterface
public interface Function3<A, B, C, R, X extends Throwable> {

    R apply(A a, B b, C c) throws X;

}
