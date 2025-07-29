package cool.scx.function;

/// RunnableX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.lang.Runnable
@FunctionalInterface
public interface RunnableX<X extends Throwable> {

    void run() throws X;

}
