package cool.scx.function;

/// DoubleFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.DoubleFunction
@FunctionalInterface
public interface DoubleFunctionX<R, X extends Throwable> {

    R apply(double value) throws X;

}
