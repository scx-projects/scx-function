package cool.scx.function;

/// IntBinaryOperatorX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.IntBinaryOperator
@FunctionalInterface
public interface IntBinaryOperatorX<X extends Throwable> {

    int applyAsInt(int left, int right) throws X;

}
