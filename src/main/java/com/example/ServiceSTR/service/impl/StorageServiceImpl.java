package com.example.ServiceSTR.service.impl;

import com.example.ServiceSTR.dto.StorageDto;
import com.example.ServiceSTR.entity.StorageEntity;
import com.example.ServiceSTR.repository.StorageRepository;
import com.example.ServiceSTR.service.StorageService;
import com.example.ServiceSTR.util.StorageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageRepository repository;

    @Override
    public StorageEntity addStorage(StorageDto storagesDto) {
        return repository.save(StorageConverter.toEntity(storagesDto));
    }

    @Override
    public List<StorageEntity> getListStorages() {
        return repository.findAll();
    }

    @Override
    public List<Long> deleteStorages(List<Long> ids) {
        ids.forEach(this::deleteStorage);
        return ids;
    }

    private Long deleteStorage(Long id) {
        repository.deleteById(id);
        return id;
    }
}
