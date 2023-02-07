package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author : ShEnUx
 * @time : 9:49 AM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Orders {
    @Id
    private String oid;
    //Out=verse
    @ManyToOne(cascade = {CascadeType.REFRESH,CascadeType.DETACH})
    @JoinColumn(name = "customerID",referencedColumnName = "id",nullable = false)
    private Customer cusID;
    private LocalDate date;

    //Inverse
    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;
}
