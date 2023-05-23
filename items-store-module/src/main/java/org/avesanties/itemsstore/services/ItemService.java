package org.avesanties.itemsstore.services;

import java.util.List;
import org.avesanties.itemsstore.dto.ItemParsingDto;
import org.avesanties.itemsstore.model.Item;

public interface ItemService {

  List<ItemParsingDto> getAllItemsForParsing();

  Item save(Item item);
}
