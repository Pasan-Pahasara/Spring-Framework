package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.ItemDTO;
import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import lk.ijse.spring.service.ItemService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

/**
 * @author : ShEnUx
 * @time : 1:24 PM
 * @date : 2/7/2023
 * @since : 0.1.0
 **/
@Service
@Transactional
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepo repo;

    @Autowired
    private ModelMapper mapper;
    @Override
    public void saveItem(ItemDTO itemDTO) {
        System.out.println("Save Item Invoked"+itemDTO.toString());
        if (repo.existsById(itemDTO.getCode())) {
            throw new RuntimeException("Item Already Exist. Please enter another id..!");
        }
        repo.save(mapper.map(itemDTO, Item.class));
    }

    @Override
    public void deleteItem(String code) {
        if (!repo.existsById(code)) {
            throw new RuntimeException("Wrong ID..Please enter valid id..!");
        }
        repo.deleteById(code);
    }

    @Override
    public void updateItem(ItemDTO itemDTO) {
        if (!repo.existsById(itemDTO.getCode())) {
            throw new RuntimeException("Wrong ID..No Such a Item to Update..!");
        }
        repo.save(mapper.map(itemDTO, Item.class));
    }

    @Override
    public ArrayList<ItemDTO> getAllItems() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<ItemDTO>>() {}.getType());

    }
}
