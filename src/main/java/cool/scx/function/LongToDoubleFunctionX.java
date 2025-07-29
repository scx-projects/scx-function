package cool.scx.function;

/// LongToDoubleFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.LongToDoubleFunction
@FunctionalInterface
public interface LongToDoubleFunctionX<X extends Throwable> {

    double applyAsDouble(long value) throws X;

}
