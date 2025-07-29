package cool.scx.function;

/// ToDoubleFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ToDoubleFunction
@FunctionalInterface
public interface ToDoubleFunctionX<T, X extends Throwable> {

    double applyAsDouble(T value) throws X;

}
