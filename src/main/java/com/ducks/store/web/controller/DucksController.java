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
    public DucksController() {

    }

    @GetMapping("getPackageType")
    public PackageType duckList(@RequestParam DuckSize duckSize) {
        PackageType packageType = getPackageTypeBySize(duckSize);
        factoryService.getPackingTypeStrategy(packageType).ProcessPackaging();
        return factoryService.getPackingTypeStrategy(packageType).getPackageType();

    }

    private PackageType getPackageTypeBySize(DuckSize duckSize) {
        if (duckSize == DuckSize.LARGE || duckSize == DuckSize.XLARGE) return PackageType.WOOD;
        if (duckSize == DuckSize.MEDIUM) return PackageType.CARDBOARD;
        if (duckSize == DuckSize.SMALL || duckSize == DuckSize.XSMALL) return PackageType.PLASTIC;
        throw new IllegalArgumentException("there is no exist a package type for this duck size");
    }
}
