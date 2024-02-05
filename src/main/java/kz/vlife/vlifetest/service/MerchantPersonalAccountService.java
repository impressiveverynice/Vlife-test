package kz.vlife.vlifetest.service;

import kz.vlife.vlifetest.entity.OrderDetail;

import java.util.List;

public interface MerchantPersonalAccountService {

    void getAverageCheque (Long merchantId, List<OrderDetail> orderDetailList);
}
