package cool.scx.function;

/// ToLongFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ToLongFunction
@FunctionalInterface
public interface ToLongFunctionX<T, X extends Throwable> {

    long applyAsLong(T value) throws X;

}
