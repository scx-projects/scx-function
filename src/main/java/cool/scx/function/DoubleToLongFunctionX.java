package cool.scx.function;

/// DoubleToLongFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.DoubleToLongFunction
@FunctionalInterface
public interface DoubleToLongFunctionX<X extends Throwable> {

    long applyAsLong(double value) throws X;

}
