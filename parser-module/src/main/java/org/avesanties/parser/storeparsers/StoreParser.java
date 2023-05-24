package org.avesanties.parser.storeparsers;

import java.math.BigDecimal;
import org.avesanties.parser.dto.ItemDto;

public interface StoreParser {
  BigDecimal parsePrice(ItemDto item);

  String getStoreName();
}
