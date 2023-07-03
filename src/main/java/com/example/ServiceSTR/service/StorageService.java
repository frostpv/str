package com.example.ServiceSTR.service;

import com.example.ServiceSTR.dto.StorageDto;
import com.example.ServiceSTR.entity.StorageEntity;

import java.util.List;

public interface StorageService {
    StorageEntity addStorage (StorageDto storagesDto);

    List<StorageEntity> getListStorages ();

    List<Long> deleteStorages(List<Long> ids);
}
