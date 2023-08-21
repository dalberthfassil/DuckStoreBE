package com.ducks.store.web.controller;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.service.factory.PackingFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ducks")
public class DucksController {
    @Autowired
    PackingFactoryService factoryService;
    @Autowired
    public DucksController(){

    }

    @GetMapping("getPackageType")
    public PackageType  duckList(@RequestParam DuckSize duckSize){
        PackageType packageType = null;
        if(duckSize == DuckSize.LARGE || duckSize == DuckSize.XLARGE) packageType = PackageType.WOOD;
        if(duckSize == DuckSize.MEDIUM) packageType = PackageType.CARDBOARD;
        if(duckSize == DuckSize.SMALL || duckSize == DuckSize.XSMALL) packageType = PackageType.PLASTIC;

        factoryService.getPackingTypeStrategy(packageType).ProcessPackaing();
       return factoryService.getPackingTypeStrategy(packageType).getPackageType();


    }
}
