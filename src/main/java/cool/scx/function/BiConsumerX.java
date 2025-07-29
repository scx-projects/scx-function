package cool.scx.function;

/// BiConsumerX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.BiConsumer
@FunctionalInterface
public interface BiConsumerX<T, U, X extends Throwable> {

    void accept(T t, U u) throws X;

}
