package cool.scx.function;

/// PredicateX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.Predicate
@FunctionalInterface
public interface PredicateX<T, X extends Throwable> {

    boolean test(T t) throws X;

}
