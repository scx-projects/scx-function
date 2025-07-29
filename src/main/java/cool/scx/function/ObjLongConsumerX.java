package cool.scx.function;

/// ObjLongConsumerX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ObjLongConsumer
@FunctionalInterface
public interface ObjLongConsumerX<T, X extends Throwable> {

    void accept(T t, long value) throws X;

}
