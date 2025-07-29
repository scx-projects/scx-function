package cool.scx.function;

/// IntSupplierX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.IntSupplier
@FunctionalInterface
public interface IntSupplierX<X extends Throwable> {

    int getAsInt() throws X;

}
