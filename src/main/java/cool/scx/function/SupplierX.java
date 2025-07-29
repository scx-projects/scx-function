package cool.scx.function;

/// SupplierX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.Supplier
@FunctionalInterface
public interface SupplierX<T, X extends Throwable> {

    T get() throws X;

}
