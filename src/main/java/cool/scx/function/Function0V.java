package cool.scx.function;

@FunctionalInterface
public interface Function0V<X extends Throwable> {

    void apply() throws X;

}
