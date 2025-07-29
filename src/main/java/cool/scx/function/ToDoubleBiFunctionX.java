package cool.scx.function;

/// ToDoubleBiFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ToDoubleBiFunction
@FunctionalInterface
public interface ToDoubleBiFunctionX<T, U, X extends Throwable> {

    double applyAsDouble(T t, U u) throws X;

}
