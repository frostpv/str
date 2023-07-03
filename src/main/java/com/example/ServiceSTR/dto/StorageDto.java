package com.example.ServiceSTR.dto;

import com.example.ServiceSTR.util.StorageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StorageDto {
    private StorageType storageType;
    private String bucketName;
    private String pathName;
}
