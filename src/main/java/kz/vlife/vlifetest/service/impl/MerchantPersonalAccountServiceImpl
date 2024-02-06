package kz.vlife.vlifetest.service;

import kz.vlife.vlifetest.entity.OrderDetail;
import kz.vlife.vlifetest.repository.OrderDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class MerchantPersonalAccountServiceImpl implements MerchantPersonalAccountService{

    private final OrderDetailRepository orderDetailRepository;
    @Override
    public double calculateAverageChequeForGivenMerchantId(Long merchantId) {
        return collectOrderDetailListForGivenMerchantId(merchantId).stream()
                .mapToDouble(OrderDetail::getOrderValue)
                .average()
                .orElse(0.0);
    };

    @Override
    public List<OrderDetail> collectOrderDetailListForGivenMerchantId(Long merchantId) {
        List<OrderDetail> ordersDetailList = orderDetailRepository.findAllByMerchantId(merchantId);
        return ordersDetailList;
    }

    private Long getAuthenticatedMerchantId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // Assuming your authentication object has details of the authenticated merchant
        // You need to customize this part based on your authentication mechanism
        return 3l;
    }
}
