package org.avesanties.parser.scheduledtasks;

import java.util.List;
import org.avesanties.parser.dto.ItemDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ItemLoaderImpl implements ItemLoader {

  private final WebClient webClient;

  public ItemLoaderImpl(WebClient webClient) {
    this.webClient = webClient;
  }

  @Override
  public List<ItemDto> getItems() {
    return webClient.get().uri(String.join("", "/items/all/parsing")).retrieve()
        .bodyToMono(new ParameterizedTypeReference<List<ItemDto>>() {}).block();
  }

}
