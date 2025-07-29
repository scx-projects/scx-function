package cool.scx.function;

/// ObjDoubleConsumerX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.ObjDoubleConsumer
@FunctionalInterface
public interface ObjDoubleConsumerX<T, X extends Throwable> {

    void accept(T t, double value) throws X;

}
