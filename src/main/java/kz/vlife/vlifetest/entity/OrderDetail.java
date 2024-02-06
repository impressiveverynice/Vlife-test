package kz.vlife.vlifetest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "order_details")
public class OrderDetail {
    @Id
    private Long id;

    private String merchantName;
    private Double orderValue;
}
