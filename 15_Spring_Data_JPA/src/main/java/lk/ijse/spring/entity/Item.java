package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author : ShEnUx
 * @time : 12:32 PM
 * @date : 2/6/2023
 * @since : 0.1.0
 **/
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Item {
    @Id
    private String code;
    private String description;
    private int qtyOnHand;
    private BigDecimal unitPrice;
}
