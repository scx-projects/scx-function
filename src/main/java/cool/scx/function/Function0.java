package cool.scx.function;

@FunctionalInterface
public interface Function0<R, X extends Throwable> {

    R apply() throws X;

}
