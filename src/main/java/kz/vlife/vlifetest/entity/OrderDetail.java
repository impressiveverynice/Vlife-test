package kz.vlife.vlifetest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class OrderDetail {
    @Id
    private Long id;
    @Column(name = "merchant_id")
    private Long merchantId;
    @Column(name = "order_value")
    private String orderValue;
}
