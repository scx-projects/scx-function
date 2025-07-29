package cool.scx.function;

/// DoubleUnaryOperatorX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.DoubleUnaryOperator
@FunctionalInterface
public interface DoubleUnaryOperatorX<X extends Throwable> {

    double applyAsDouble(double operand) throws X;

}
