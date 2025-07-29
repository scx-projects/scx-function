package cool.scx.function;

/// IntPredicateX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.IntPredicate
@FunctionalInterface
public interface IntPredicateX<X extends Throwable> {

    boolean test(int value) throws X;

}
