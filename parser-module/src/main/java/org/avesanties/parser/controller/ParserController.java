package org.avesanties.parser.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.avesanties.parser.dto.ItemDto;
import org.avesanties.parser.scheduledtasks.ItemLoader;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ParserController {

  private final ItemLoader ItemLoaderImpl;
  
  private List<ItemDto> items = new ArrayList<ItemDto>();
  
  public ParserController(ItemLoader itemLoaderImpl) {
    ItemLoaderImpl = itemLoaderImpl;
  }


  @Scheduled(fixedRate = 5, timeUnit = TimeUnit.SECONDS)
  public void loadItems() {
    items = ItemLoaderImpl.getItems();
    System.out.println(items.toString());
  }
}
