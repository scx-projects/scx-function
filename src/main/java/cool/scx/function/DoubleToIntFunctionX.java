package cool.scx.function;

/// DoubleToIntFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.DoubleToIntFunction
@FunctionalInterface
public interface DoubleToIntFunctionX<X extends Throwable> {

    int applyAsInt(double value) throws X;

}
