package cool.scx.function;

/// LongUnaryOperatorX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.LongUnaryOperator
@FunctionalInterface
public interface LongUnaryOperatorX<X extends Throwable> {

    long applyAsLong(long operand) throws X;

}
