package lk.ijse.spring.repo;

import lk.ijse.spring.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : ShEnUx
 * @time : 1:20 PM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
public interface OrderDetailsRepo extends JpaRepository<OrderDetails,String> {
}
