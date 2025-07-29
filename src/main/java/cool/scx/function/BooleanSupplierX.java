package cool.scx.function;

/// BooleanSupplierX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.BooleanSupplier
@FunctionalInterface
public interface BooleanSupplierX<X extends Throwable> {

    boolean getAsBoolean() throws X;

}
