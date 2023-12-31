package ru.yandex.yandexlavka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.yandex.yandexlavka.controller.CourierController;
import ru.yandex.yandexlavka.controller.OrderController;
import ru.yandex.yandexlavka.service.MainService;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
class YandexLavkaApplicationTests extends CommonTest {

    @Autowired
    private CourierController courierController;

    @Autowired
    private OrderController orderController;

    @MockBean
    private MainService mainService;

    @Test
    public void contextLoads() throws Exception {
        assertNotNull(courierController);
        assertNotNull(orderController);
    }


}
