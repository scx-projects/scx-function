package cool.scx.function;

/// LongBinaryOperatorX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.LongBinaryOperator
@FunctionalInterface
public interface LongBinaryOperatorX<X extends Throwable> {

    long applyAsLong(long left, long right) throws X;

}
