package kz.vlife.vlifetest.controller;

import kz.vlife.vlifetest.entity.OrderDetail;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MerchantStatsController {

    @GetMapping("/getAverageChequeForMerchant")
    public void getAverageCheque (Long merchantId, List<OrderDetail> orderDetailList) {

    }

}
