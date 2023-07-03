package com.example.ServiceSTR.util;

import com.example.ServiceSTR.dto.StorageDto;
import com.example.ServiceSTR.entity.StorageEntity;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StorageConverter {

    public static StorageEntity toEntity(StorageDto dto) {
        return dto == null ? null : convertGeneralEntityData(dto);
    }

    private static StorageEntity convertGeneralEntityData(StorageDto dto) {
        StorageEntity storageEntity = new StorageEntity();
        storageEntity.setStoragePath(dto.getPathName());
        storageEntity.setStorageType(dto.getStorageType());
        storageEntity.setBucketName(dto.getBucketName());
        return storageEntity;
    }

    public static StorageDto toDto(StorageEntity storageEntity) {
        if (storageEntity == null) {
            return null;
        }

        StorageDto dto = new StorageDto();
        dto.setPathName(storageEntity.getStoragePath());
        dto.setStorageType(storageEntity.getStorageType());
        dto.setBucketName(storageEntity.getBucketName());
        return dto;
    }
}
