package kz.vlife.vlifetest.service;

import kz.vlife.vlifetest.entity.OrderDetail;

import java.util.List;

public interface MerchantPersonalAccountService {
    double calculateAverageChequeForMerchant(String username);

    List<OrderDetail> collectOrdersByUsername(String username);
}