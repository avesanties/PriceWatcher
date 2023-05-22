package org.avesanties.items_store.services.impl;

import org.avesanties.items_store.dto.ItemParsingDto;
import org.avesanties.items_store.model.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemMapper {
	
	public ItemParsingDto toItemParsingDto(Item item) {
		return new ItemParsingDto(
				item.getId(),
				item.getName(),
				item.getLink(),
				item.getStore());
	}
}
