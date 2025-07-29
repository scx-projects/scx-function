package cool.scx.function;

/// LongConsumerX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.LongConsumer
@FunctionalInterface
public interface LongConsumerX<X extends Throwable> {

    void accept(long value) throws X;

}
