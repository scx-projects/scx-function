package cool.scx.function;

/// ConsumerX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.Consumer
@FunctionalInterface
public interface ConsumerX<T, X extends Throwable> {

    void accept(T t) throws X;

}
