package cool.scx.function;

/// LongPredicateX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.LongPredicate
@FunctionalInterface
public interface LongPredicateX<X extends Throwable> {

    boolean test(long value) throws X;

}
