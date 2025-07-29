package cool.scx.function;

/// LongFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.LongFunction
@FunctionalInterface
public interface LongFunctionX<R, X extends Throwable> {

    R apply(long value) throws X;

}
