package cool.scx.function;

/// LongSupplierX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.LongSupplier
@FunctionalInterface
public interface LongSupplierX<X extends Throwable> {

    long getAsLong() throws X;

}
