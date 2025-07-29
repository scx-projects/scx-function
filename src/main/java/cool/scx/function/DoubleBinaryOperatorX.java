package cool.scx.function;

/// DoubleBinaryOperatorX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.DoubleBinaryOperator
@FunctionalInterface
public interface DoubleBinaryOperatorX<X extends Throwable> {

    double applyAsDouble(double left, double right) throws X;

}
