package cool.scx.function;

/// IntToDoubleFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.IntToDoubleFunction
@FunctionalInterface
public interface IntToDoubleFunctionX<X extends Throwable> {

    double applyAsDouble(int value) throws X;

}
