package cool.scx.function;

/// ObjIntConsumerX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ObjIntConsumer
@FunctionalInterface
public interface ObjIntConsumerX<T, X extends Throwable> {

    void accept(T t, int value) throws X;

}
