package cool.scx.function;

/// BiFunctionX
///
/// @author scx567888
/// @version 0.0.1
/// @see java.util.function.BiPredicate
@FunctionalInterface
public interface BiPredicateX<T, U, X extends Throwable> {

    boolean test(T t, U u) throws X;

}
