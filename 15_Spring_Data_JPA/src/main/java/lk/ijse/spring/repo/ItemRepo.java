package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : ShEnUx
 * @time : 9:32 AM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
public interface ItemRepo extends JpaRepository<Item,String> {
}
