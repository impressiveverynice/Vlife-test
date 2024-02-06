package kz.vlife.vlifetest.controller;


import kz.vlife.vlifetest.service.MerchantPersonalAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/cheque")
@RequiredArgsConstructor
public class MerchantStatsController {

    private final MerchantPersonalAccountService merchantPersonalAccountService;
    @GetMapping("/average")
    public Double getAverageCheque (Principal principal) {
        return merchantPersonalAccountService.calculateAverageChequeForMerchant(principal.getName());
    }

}
