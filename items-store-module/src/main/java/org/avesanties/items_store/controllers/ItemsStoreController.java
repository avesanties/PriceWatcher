package org.avesanties.items_store.controllers;

import java.util.List;

import org.avesanties.items_store.dto.ItemParsingDto;
import org.avesanties.items_store.model.Item;
import org.avesanties.items_store.model.Store;
import org.avesanties.items_store.services.ItemService;
import org.avesanties.items_store.services.StoreService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class ItemsStoreController {
	
	private ItemService itemService;
	
	private StoreService storeService;
	
	public ItemsStoreController(
			ItemService itemService,
			StoreService storeService) {
		this.itemService = itemService;
		this.storeService = storeService;
	}
	
	@GetMapping("/items/all/parsing")
	public List<ItemParsingDto> getAllItemsForParsing(){
		return itemService.getAllItemsForParsing();
	}
	
	@PostMapping("/items/new")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Item createItem(
			@Valid @RequestBody Item item,
			BindingResult result) {
		if(result.hasErrors())
			return null; //TODO: add exceptions
		
		return itemService.save(item);
	}
	
	
	@PostMapping("/store/new")
	@ResponseStatus(value = HttpStatus.CREATED)
	public Store createStore(
			@Valid @RequestBody Store store, 
			BindingResult result) {
		if(result.hasErrors())
			return null; //TODO: add exceptions
		
		return storeService.save(store);
	}
}