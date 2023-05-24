package org.avesanties.parser.dto;

public final class ItemDto {
  private Long id;

  private String name;

  private String link;

  private String store;

  public ItemDto() {
  
  }

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

  @Override
  public String toString() {
    return "ItemDto [id=" + id + ", name=" + name + ", link=" + link + ", store=" + store + "]";
  }
}
