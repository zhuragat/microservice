package kz.zhuragat.orderservice.repository;

import kz.zhuragat.orderservice.model.*;
import org.springframework.data.jpa.repository.*;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
