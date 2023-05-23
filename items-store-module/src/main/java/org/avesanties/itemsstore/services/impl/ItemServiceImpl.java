package org.avesanties.itemsstore.services.impl;

import java.util.List;
import org.avesanties.itemsstore.dto.ItemParsingDto;
import org.avesanties.itemsstore.model.Item;
import org.avesanties.itemsstore.model.ItemRepository;
import org.avesanties.itemsstore.services.ItemService;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

  private ItemRepository itemRepository;

  private ItemMapper itemMapper;

  public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper) {
    this.itemRepository = itemRepository;
    this.itemMapper = itemMapper;
  }

  @Override
  public List<ItemParsingDto> getAllItemsForParsing() {
    List<Item> items = itemRepository.findAll();

    return items.stream().map(itemMapper::toItemParsingDto).toList();
  }

  @Override
  public Item save(Item item) {
    return itemRepository.save(item);
  }
}
