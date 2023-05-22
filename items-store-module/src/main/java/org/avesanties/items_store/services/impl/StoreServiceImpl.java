package org.avesanties.items_store.services.impl;

import org.avesanties.items_store.model.Store;
import org.avesanties.items_store.model.StoreRepository;
import org.avesanties.items_store.services.StoreService;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService{
	
	private StoreRepository storeRepository;
	
	public StoreServiceImpl(
			StoreRepository storeRepository) {
		this.storeRepository = storeRepository;
	}

	@Override
	public Store save(Store store) {
		return storeRepository.save(store);
	}
}
