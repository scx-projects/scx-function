package cool.scx.function;

/// FunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.Function
@FunctionalInterface
public interface FunctionX<T, R, X extends Throwable> {

    R apply(T t) throws X;

}
