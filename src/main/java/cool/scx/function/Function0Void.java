package cool.scx.function;

@FunctionalInterface
public interface Function0Void<X extends Throwable> {

    void apply() throws X;

}
