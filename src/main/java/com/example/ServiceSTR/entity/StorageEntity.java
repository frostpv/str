package com.example.ServiceSTR.entity;

import com.example.ServiceSTR.util.StorageType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class StorageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "A_STR_ID")
    private Long id;

    @Column(name = "A_STR_TYPE")
    private StorageType storageType;

    @Column(name = "A_STR_PATH")
    private String storagePath;

    @Column(name = "A_BKT_NAME")
    private String bucketName;

    @Column(name = "A_STR_STATUS", columnDefinition = "boolean default false")
    private Boolean status;
}
