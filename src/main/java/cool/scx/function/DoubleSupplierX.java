package cool.scx.function;

/// DoubleSupplierX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.DoubleSupplier
@FunctionalInterface
public interface DoubleSupplierX<X extends Throwable> {

    double getAsDouble() throws X;

}
