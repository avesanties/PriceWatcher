package org.avesanties.parser.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ParserController {
  
  private final WebClient webClient;

  public ParserController(WebClient webClient) {
    this.webClient = webClient;
  }
  
  
}
