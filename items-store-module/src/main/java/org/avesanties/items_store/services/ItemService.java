package org.avesanties.items_store.services;

import java.util.List;

import org.avesanties.items_store.dto.ItemParsingDto;
import org.avesanties.items_store.model.Item;

public interface ItemService {
	
	List<ItemParsingDto> getAllItemsForParsing();
	
	Item save(Item item);
}
