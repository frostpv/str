package com.example.ServiceSTR.repository;

import com.example.ServiceSTR.entity.StorageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<StorageEntity, Long> {
}
