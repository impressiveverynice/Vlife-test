package kz.vlife.vlifetest.controller;


import kz.vlife.vlifetest.entity.OrderDetail;
import kz.vlife.vlifetest.service.MerchantPersonalAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class MerchantStatsController {

    private final MerchantPersonalAccountService merchantPersonalAccountService;

    @GetMapping("/average-cheque")
    public Double getAverageCheque(Principal principal) {
        return merchantPersonalAccountService.calculateAverageChequeForMerchant(principal.getName());
    }

    @GetMapping("/orders")
    public List<OrderDetail> getAllOrders (Principal principal) {
        return merchantPersonalAccountService.collectOrdersByUsername(principal.getName());
    }

}
