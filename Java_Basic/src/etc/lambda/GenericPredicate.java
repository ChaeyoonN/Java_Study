package etc.lambda;

@FunctionalInterface
public interface GenericPredicate<T> {
    //객체 생성 시 타입이 결정됨.

    boolean test(T t);

}
