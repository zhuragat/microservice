package kz.zhuragat.orderservice.dto;

import lombok.*;

import java.math.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItemDto {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
