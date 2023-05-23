package org.avesanties.itemsstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class Price {

  @NotNull
  @Column(name = "value_date")
  private LocalDate date;

  @NotNull
  @PositiveOrZero
  @Column(name = "val")
  private BigDecimal value;

  public Price(@NotNull LocalDate date, @NotNull BigDecimal value, Item item) {
    this.date = date;
    this.value = value;
  }

  public Price() {

  }

  public LocalDate getDate() {
    return date;
  }

  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Price [date=" + date + ", value=" + value + "]";
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, value);
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
    Price other = (Price) obj;
    return Objects.equals(date, other.date) && Objects.equals(value, other.value);
  }
}
