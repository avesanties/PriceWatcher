package org.avesanties.itemsstore.services.impl;

import org.avesanties.itemsstore.model.Store;
import org.avesanties.itemsstore.model.StoreRepository;
import org.avesanties.itemsstore.services.StoreService;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

  private StoreRepository storeRepository;

  public StoreServiceImpl(StoreRepository storeRepository) {
    this.storeRepository = storeRepository;
  }

  @Override
  public Store save(Store store) {
    return storeRepository.save(store);
  }
}
