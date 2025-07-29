package cool.scx.function;

/// IntUnaryOperatorX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.IntUnaryOperator
@FunctionalInterface
public interface IntUnaryOperatorX<X extends Throwable> {

    int applyAsInt(int operand) throws X;

}
