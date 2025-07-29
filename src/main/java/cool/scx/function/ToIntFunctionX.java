package cool.scx.function;

/// ToIntFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ToIntFunction
@FunctionalInterface
public interface ToIntFunctionX<T, X extends Throwable> {

    int applyAsInt(T value) throws X;

}
