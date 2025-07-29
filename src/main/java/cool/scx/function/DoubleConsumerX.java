package cool.scx.function;

/// DoubleConsumerX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.DoubleConsumer
@FunctionalInterface
public interface DoubleConsumerX<X extends Throwable> {

    void accept(double value) throws X;

}
