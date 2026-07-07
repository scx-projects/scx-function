package dev.scx.function;

/// Function0
///
/// @author scx567888
/// @see Function1
@FunctionalInterface
public interface Function0<R, X extends Throwable> {

    R apply() throws X;

}
