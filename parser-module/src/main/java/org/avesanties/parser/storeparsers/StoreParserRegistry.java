package org.avesanties.parser.storeparsers;

import java.math.BigDecimal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.avesanties.parser.dto.ItemDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StoreParserRegistry {

  private final ApplicationContext applicationContext;

  private final Map<String, StoreParser> parsers = new ConcurrentHashMap<String, StoreParser>();

  public StoreParserRegistry(ApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  @EventListener
  private void allParsersAreRegistrated(ContextRefreshedEvent cre) {
    parsers.putAll(applicationContext.getBeansOfType(StoreParser.class));
  }

  public BigDecimal parsePriceInItem(ItemDto item) {
    if (!parsers.containsKey(item.getStore())) {
      // TODO: throw new exception
    }

    return parsers.get(item.getStore()).parsePrice(item);
  }
}
