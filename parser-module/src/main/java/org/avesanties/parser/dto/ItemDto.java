package org.avesanties.parser.dto;

public class ItemDto {
  private final Long id;

  private final String name;

  private final String link;

  private final String store;

  public ItemDto(Long id, String name, String link, String store) {
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

  public String getStore() {
    return store;
  }
}
