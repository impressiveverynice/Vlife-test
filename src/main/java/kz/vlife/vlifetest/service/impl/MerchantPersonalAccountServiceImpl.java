package kz.vlife.vlifetest.service.impl;

import kz.vlife.vlifetest.entity.OrderDetail;
import kz.vlife.vlifetest.repository.OrderDetailRepository;
import kz.vlife.vlifetest.service.MerchantPersonalAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class MerchantPersonalAccountServiceImpl implements MerchantPersonalAccountService {

    private final OrderDetailRepository orderDetailRepository;

    @Override
    public double calculateAverageChequeForMerchant(String username) {
        return collectOrdersByUsername(username).stream()
                .mapToDouble(OrderDetail::getOrderValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public List<OrderDetail> collectOrdersByUsername(String username) {
        List<OrderDetail> ordersDetailList = orderDetailRepository.findAllByMerchantName(username);
        return ordersDetailList;
    }

}
