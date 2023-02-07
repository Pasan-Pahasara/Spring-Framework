package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : ShEnUx
 * @time : 10:09 AM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class OrdersDTO {
    private String oid;
    private LocalDate date;//Jackson ට තනියම String type එන data එකක් LocalDate එකට convert කරන්න බෑ ඒකට Jackson Datatype: JSR310 ත් use කරන්න ඕන.
    private String cusID;
    private List<OrderDetailsDTO> orderDetails;
}
