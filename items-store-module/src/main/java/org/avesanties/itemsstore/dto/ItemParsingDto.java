package org.avesanties.itemsstore.dto;

import org.avesanties.itemsstore.model.Store;

public class ItemParsingDto {

  private final Long id;

  private final String name;

  private final String link;

  private final Store store;

  public ItemParsingDto(Long id, String name, String link, Store store) {
    this.id = id;
    this.name = name;
    this.link = link;
    this.store = store;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getLink() {
    return link;
  }

  public Store getStore() {
    return store;
  }
}
