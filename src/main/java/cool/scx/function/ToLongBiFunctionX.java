package cool.scx.function;

/// ToLongBiFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ToLongBiFunction
@FunctionalInterface
public interface ToLongBiFunctionX<T, U, X extends Throwable> {

    long applyAsLong(T t, U u) throws X;

}
