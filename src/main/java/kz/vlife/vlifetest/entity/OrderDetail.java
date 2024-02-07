package kz.vlife.vlifetest.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @JsonIgnore
    private String merchantName;
    private Double orderValue;

    public OrderDetail() {

    }

    public OrderDetail(String merchantName, double orderValue) {
        this.merchantName = merchantName;
        this.orderValue = orderValue;
    }
}
