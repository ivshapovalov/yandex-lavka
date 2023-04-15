package ru.yandex.yandexlavka.model;

import org.junit.jupiter.api.Test;
import ru.yandex.yandexlavka.model.entity.CourierDto;
import ru.yandex.yandexlavka.model.entity.OrderDto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourierDtoTest {

    @Test
    public void calculateEarningsAndRatingWhenOrders24AndHour24AndCourierTypeFoot() {
        LocalDate startDate = LocalDate.parse("2023-03-20");
        LocalDate endDate = LocalDate.parse("2023-03-21");
        List<OrderDto> completedOrders = IntStream.rangeClosed(1, 24).mapToObj(ind -> {
            OrderDto orderDto = new OrderDto();
            orderDto.setCost(ind);
            return orderDto;
        }).collect(Collectors.toList());

        CourierDto courierDto = new CourierDto();
        courierDto.setCourierType(CourierDto.CourierTypeEnum.FOOT);

        courierDto.calculateEarnings(completedOrders);
        courierDto.calculateRating(completedOrders, startDate, endDate);

        int expectedEarnings = 600;
        int expectedRating = 3;
        assertAll(
                () -> assertEquals(expectedEarnings, courierDto.getEarnings(), "Earnings not equals " + expectedEarnings),
                () -> assertEquals(expectedRating, courierDto.getRating(), "Rating not equals " + expectedRating));
    }

    @Test
    public void calculateEarningsAndRatingWhenOrders24AndHour24AndCourierTypeBike() {
        LocalDate startDate = LocalDate.parse("2023-03-20");
        LocalDate endDate = LocalDate.parse("2023-03-21");

        List<OrderDto> completedOrders = IntStream.rangeClosed(1, 24).mapToObj(ind -> {
            OrderDto orderDto = new OrderDto();
            orderDto.setCost(ind);
            return orderDto;
        }).collect(Collectors.toList());

        CourierDto courierDto = new CourierDto();
        courierDto.setCourierType(CourierDto.CourierTypeEnum.BIKE);

        courierDto.calculateEarnings(completedOrders);
        courierDto.calculateRating(completedOrders, startDate, endDate);

        int expectedEarnings = 900;
        int expectedRating = 2;
        assertAll(
                () -> assertEquals(expectedEarnings, courierDto.getEarnings(), "Earnings not equals " + expectedEarnings),
                () -> assertEquals(expectedRating, courierDto.getRating(), "Rating not equals " + expectedRating));
    }

    @Test
    public void calculateEarningsAndRatingWhenOrders24AndHour24AndCourierTypeAuto() {
        LocalDate startDate = LocalDate.parse("2023-03-20");
        LocalDate endDate = LocalDate.parse("2023-03-21");

        List<OrderDto> completedOrders = IntStream.rangeClosed(1, 24).mapToObj(ind -> {
            OrderDto orderDto = new OrderDto();
            orderDto.setCost(ind);
            return orderDto;
        }).collect(Collectors.toList());

        CourierDto courierDto = new CourierDto();
        courierDto.setCourierType(CourierDto.CourierTypeEnum.AUTO);

        courierDto.calculateEarnings(completedOrders);
        courierDto.calculateRating(completedOrders, startDate, endDate);

        int expectedEarnings = 1200;
        int expectedRating = 1;
        assertAll(
                () -> assertEquals(expectedEarnings, courierDto.getEarnings(), "Earnings not equals " + expectedEarnings),
                () -> assertEquals(expectedRating, courierDto.getRating(), "Rating not equals " + expectedRating));
    }

    @Test
    public void calculateEarningsAndRatingWhenOrders96AndHour48AndCourierTypeFoot() {
        LocalDate startDate = LocalDate.parse("2023-03-20");
        LocalDate endDate = LocalDate.parse("2023-03-22");

        List<OrderDto> completedOrders = IntStream.rangeClosed(1, 96).mapToObj(ind -> {
            OrderDto orderDto = new OrderDto();
            orderDto.setCost(ind);
            return orderDto;
        }).collect(Collectors.toList());

        CourierDto courierDto = new CourierDto();
        courierDto.setCourierType(CourierDto.CourierTypeEnum.FOOT);

        courierDto.calculateEarnings(completedOrders);
        courierDto.calculateRating(completedOrders, startDate, endDate);

        int expectedEarnings = 9312;
        int expectedRating = 6;
        assertAll(
                () -> assertEquals(expectedEarnings, courierDto.getEarnings(), "Earnings not equals " + expectedEarnings),
                () -> assertEquals(expectedRating, courierDto.getRating(), "Rating not equals " + expectedRating));
    }

    @Test
    public void calculateEarningsAndRatingWhenOrders96AndHour48AndCourierTypeBike() {
        LocalDate startDate = LocalDate.parse("2023-03-20");
        LocalDate endDate = LocalDate.parse("2023-03-22");

        List<OrderDto> completedOrders = IntStream.rangeClosed(1, 96).mapToObj(ind -> {
            OrderDto orderDto = new OrderDto();
            orderDto.setCost(ind);
            return orderDto;
        }).collect(Collectors.toList());

        CourierDto courierDto = new CourierDto();
        courierDto.setCourierType(CourierDto.CourierTypeEnum.BIKE);

        courierDto.calculateEarnings(completedOrders);
        courierDto.calculateRating(completedOrders, startDate, endDate);

        int expectedEarnings = 13968;
        int expectedRating = 4;
        assertAll(
                () -> assertEquals(expectedEarnings, courierDto.getEarnings(), "Earnings not equals " + expectedEarnings),
                () -> assertEquals(expectedRating, courierDto.getRating(), "Rating not equals " + expectedRating));
    }

    @Test
    public void calculateEarningsAndRatingWhenOrders96AndHour48AndCourierTypeAuto() {
        LocalDate startDate = LocalDate.parse("2023-03-20");
        LocalDate endDate = LocalDate.parse("2023-03-22");

        List<OrderDto> completedOrders = IntStream.rangeClosed(1, 96).mapToObj(ind -> {
            OrderDto orderDto = new OrderDto();
            orderDto.setCost(ind);
            return orderDto;
        }).collect(Collectors.toList());

        CourierDto courierDto = new CourierDto();
        courierDto.setCourierType(CourierDto.CourierTypeEnum.AUTO);

        courierDto.calculateEarnings(completedOrders);
        courierDto.calculateRating(completedOrders, startDate, endDate);

        int expectedEarnings = 18624;
        int expectedRating = 2;
        assertAll(
                () -> assertEquals(expectedEarnings, courierDto.getEarnings(), "Earnings not equals " + expectedEarnings),
                () -> assertEquals(expectedRating, courierDto.getRating(), "Rating not equals " + expectedRating));
    }

}
