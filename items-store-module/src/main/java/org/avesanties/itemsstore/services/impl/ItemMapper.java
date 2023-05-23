package org.avesanties.itemsstore.services.impl;

import org.avesanties.itemsstore.dto.ItemParsingDto;
import org.avesanties.itemsstore.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {

  public ItemParsingDto toItemParsingDto(Item item) {
    return new ItemParsingDto(item.getId(), item.getName(), item.getLink(), item.getStore().getName());
  }
}
