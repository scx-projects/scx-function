package cool.scx.function;

/// IntToLongFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.IntToLongFunction
@FunctionalInterface
public interface IntToLongFunctionX<X extends Throwable> {

    long applyAsLong(int value) throws X;

}
