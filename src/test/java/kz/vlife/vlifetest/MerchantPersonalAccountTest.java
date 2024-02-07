package kz.vlife.vlifetest;

import kz.vlife.vlifetest.entity.OrderDetail;
import kz.vlife.vlifetest.repository.OrderDetailRepository;
import kz.vlife.vlifetest.service.impl.MerchantPersonalAccountServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MerchantPersonalAccountTest {
    @Mock
    private OrderDetailRepository orderDetailRepository;

    @InjectMocks
    private MerchantPersonalAccountServiceImpl merchantService;

    @Test
    public void givenOrderDetails_whenCalculateAverageChequeForTwoOrders_thenReturnAverageCheque() {
        String username = "testUser";
        List<OrderDetail> orders = Arrays.asList(
                new OrderDetail("testUser", 10.0),
                new OrderDetail("testUser", 20.0)
        );
        when(orderDetailRepository.findAllByMerchantName(username)).thenReturn(orders);
        double expectedAverage = 15.0;
        double actualAverage = merchantService.calculateAverageChequeForMerchant(username);

        assertEquals(expectedAverage, actualAverage, 0.01);
    }

    //for clarity I am using the same test for 5 values instead of 2
    @Test
    public void givenOrderDetails_whenCalculateAverageChequeForFiveOrders_thenReturnAverageCheque() {
        String username = "testUser";
        List<OrderDetail> orders = Arrays.asList(
                new OrderDetail("testUser", 10.0),
                new OrderDetail("testUser", 20.0),
                new OrderDetail("testUser", 30.0),
                new OrderDetail("testUser", 40.0),
                new OrderDetail("testUser", 50.0)
        );
        when(orderDetailRepository.findAllByMerchantName(username)).thenReturn(orders);
        double expectedAverage = 30.0;
        double actualAverage = merchantService.calculateAverageChequeForMerchant(username);

        assertEquals(expectedAverage, actualAverage, 0.01);
    }

}
