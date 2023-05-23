package org.avesanties.itemsstore.model;


import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "items")
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotEmpty
  @Size(min = 1, max = 255)
  @Column(nullable = false)
  private String name;

  @NotEmpty
  @Column(nullable = false)
  private String link;

  @NotNull
  @ManyToOne(optional = false)
  private Store store;

  @ElementCollection(fetch = FetchType.LAZY)
  private Set<Price> prices = new HashSet<Price>();

  public Item(@NotEmpty @Size(min = 1, max = 255) String name, @NotEmpty String link,
      @NotNull Store store) {
    this.name = name;
    this.link = link;
    this.store = store;
  }

  public Item() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Long getId() {
    return id;
  }

  public Store getStore() {
    return store;
  }

  public Set<Price> getPrices() {
    return Collections.unmodifiableSet(this.prices);
  }

  public void addPrice(Price newPrice) {
    this.prices.add(newPrice);
  }

  @Override
  public String toString() {
    return "Item [id=" + id + ", name=" + name + ", link=" + link + ", store=" + store + ", prices="
        + prices + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, link, name, prices, store);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Item other = (Item) obj;
    return Objects.equals(id, other.id) && Objects.equals(link, other.link)
        && Objects.equals(name, other.name) && Objects.equals(prices, other.prices)
        && Objects.equals(store, other.store);
  }
}


