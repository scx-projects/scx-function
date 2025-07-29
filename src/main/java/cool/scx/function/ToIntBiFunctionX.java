package cool.scx.function;

/// ToIntBiFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ToIntBiFunction
@FunctionalInterface
public interface ToIntBiFunctionX<T, U, X extends Throwable> {

    int applyAsInt(T t, U u) throws X;

}
