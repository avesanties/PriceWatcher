package org.avesanties.parser.scheduledtasks;

import java.util.List;
import org.avesanties.parser.dto.ItemDto;

public interface ItemLoader {
  List<ItemDto> getItems();
}
