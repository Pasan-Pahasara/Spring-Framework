package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : ShEnUx
 * @time : 10:48 AM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
public interface OrdersRepo extends JpaRepository<Orders,String> {
}
