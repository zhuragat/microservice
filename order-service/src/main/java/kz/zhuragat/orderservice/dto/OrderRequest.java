package kz.zhuragat.orderservice.dto;

import kz.zhuragat.orderservice.model.*;
import lombok.*;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private List<OrderLineItemDto> orderLineItemDtoList;
}
