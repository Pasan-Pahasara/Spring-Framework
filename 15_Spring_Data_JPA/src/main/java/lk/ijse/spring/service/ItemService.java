package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.ItemDTO;

import java.util.ArrayList;

/**
 * @author : ShEnUx
 * @time : 1:21 PM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
public interface ItemService {
    void saveItem(ItemDTO itemDTO);
    void deleteItem(String code);
    void updateItem(ItemDTO itemDTO);
    ArrayList<ItemDTO> getAllItems();
}
