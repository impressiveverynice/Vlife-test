package kz.vlife.vlifetest.service;

import kz.vlife.vlifetest.entity.OrderDetail;

import java.util.List;

public interface MerchantPersonalAccountService {
    double calculateAverageChequeForGivenMerchantId(Long merchantId);
    List<OrderDetail> collectOrderDetailListForGivenMerchantId (Long merchantId);
}
