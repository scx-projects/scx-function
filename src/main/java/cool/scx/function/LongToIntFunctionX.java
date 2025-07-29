package cool.scx.function;

/// LongToIntFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.LongToIntFunction
@FunctionalInterface
public interface LongToIntFunctionX<X extends Throwable> {

    int applyAsInt(long value) throws X;

}
