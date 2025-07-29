package cool.scx.function;

/// BiFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.BiFunction
@FunctionalInterface
public interface BiFunctionX<T, U, R, X extends Throwable> {

    R apply(T t, U u) throws X;

}
