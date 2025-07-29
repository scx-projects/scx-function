package cool.scx.function;

/// IntConsumerX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.IntConsumer
@FunctionalInterface
public interface IntConsumerX<X extends Throwable> {

    void accept(int value) throws X;

}
