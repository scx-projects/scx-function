package cool.scx.function;

/// IntFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.IntFunction
@FunctionalInterface
public interface IntFunctionX<R, X extends Throwable> {

    R apply(int value) throws X;

}
