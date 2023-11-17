package etc.stream.quiz;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2021)
                .sorted(comparing(transaction -> transaction.getValue()))
                .collect(Collectors.toList())
                .forEach(transaction -> System.out.println("2021년 발생한 거래액 = " + transaction.getValue()));


        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        List<String> cities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("거래자가 근무하는 도시 = " + cities);



        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(trader -> trader.getName()))
                .collect(Collectors.toList())
                .forEach(trader -> System.out.println("Cambridge에 근무하는 거래자= " + trader.getName()));


        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로 오름차 정렬하여 반환
        List<String> names = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted() // 문자나 숫자는 Comparator를 사용하지 않아도 됩니다. (객체 안에 있는 거 정렬할 때 사용)
                .collect(Collectors.toList());
        System.out.println("모든 거래자의 이름 = " + names);


        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity()
                        .equalsIgnoreCase("milan"));

        System.out.println("Milan에 거주하는 거래자 존재여부 = " + flag);


        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.

        int totalValue = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity()
                        .equalsIgnoreCase("Cambridge"))
                .mapToInt(transaction -> transaction.getValue())
                .sum();
        System.out.println("totalValue = " + totalValue);


        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
//        Transaction maxValue = transactions.stream()
//                .max(comparing(transaction -> transaction.getValue()))
//                .get();
//        System.out.println("maxValue = " + maxValue.getValue());
        int maxValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt();

        System.out.println("maxValue = " + maxValue);


        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
        transactions.stream()
                .min(comparing(transaction -> transaction.getValue()))
                .ifPresent(System.out::println); // .get()으로 해도됌.



    }
}
