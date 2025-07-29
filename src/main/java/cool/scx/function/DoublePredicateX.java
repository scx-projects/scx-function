package cool.scx.function;

/// DoublePredicateX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.DoublePredicate
@FunctionalInterface
public interface DoublePredicateX<X extends Throwable> {

    boolean test(double value) throws X;

}
