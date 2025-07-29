package cool.scx.function;

/// CallableX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.concurrent.Callable
@FunctionalInterface
public interface CallableX<V, X extends Throwable> {

    V call() throws X;

}
