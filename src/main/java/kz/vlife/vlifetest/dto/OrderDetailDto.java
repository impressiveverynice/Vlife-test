package kz.vlife.vlifetest.dto;

import lombok.Data;

@Data
public class OrderDetailDto {
    private Long id;
    private Long merchantId;
    private String orderValue;
}
