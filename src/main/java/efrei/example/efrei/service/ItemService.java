package efrei.example.efrei.service;

import efrei.example.efrei.domain.Item;
import efrei.example.efrei.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {return itemRepository.findAll();}
}