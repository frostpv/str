package com.example.ServiceSTR.controller;

import com.example.ServiceSTR.dto.StorageDto;
import com.example.ServiceSTR.entity.StorageEntity;
import com.example.ServiceSTR.service.StorageService;
import com.example.ServiceSTR.util.StorageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("storages")
public class StorageController {

    @Autowired
    private StorageService storageService;

    @PostMapping
    public ResponseEntity<StorageDto> addStorage(@RequestParam StorageDto storageDto){
        StorageEntity storageEntity = storageService.addStorage(storageDto);

        return ResponseEntity.ok(StorageConverter.toDto(storageEntity));
    }

    @GetMapping
    public ResponseEntity<List<StorageDto>> getStorageList(){
        List<StorageDto> collect = storageService.getListStorages().stream()
                .map(StorageConverter::toDto)
                .collect(Collectors.toList());

        return ResponseEntity.ok(collect);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteStorage(@RequestParam List<String> ids){
        List<Long> collect = ids.stream()
                .map(Long::valueOf)
                .collect(Collectors.toList());

        storageService.deleteStorages(collect);
        return ResponseEntity.ok("Storages was deleted" + ids);
    }

}
