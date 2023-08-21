package com.ducks.store.web.controller;

import org.springframework.http.ResponseEntity;
import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.enums.ShippingType;
import com.ducks.store.domain.service.factory.PackingFactoryService;
import com.ducks.store.domain.service.factory.ShippingFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/ducks")
public class DucksController {
    @Autowired
    PackingFactoryService factoryService;
    @Autowired
    ShippingFactoryService shippingFactoryService;

    @Autowired
    public DucksController() {

    }

    @GetMapping("getPackageType")
    public ResponseEntity<Map<String, Object>> packingType(@RequestParam DuckSize duckSize,
                                                        @RequestParam ShippingType shippingType) {
        PackageType packageType = getPackageTypeBySize(duckSize);
        factoryService.getPackingTypeStrategy(packageType).ProcessPackaging();
        Map<String, Object> responseMap = new HashMap<>();
        responseMap.put("PackageType", factoryService.getPackingTypeStrategy(packageType).getPackageType());
        responseMap.put("Protection", shippingFactoryService.getShippingStrategy(shippingType).getProtectionFiller(packageType));


        return ResponseEntity.ok(responseMap);


    }

    private PackageType getPackageTypeBySize(DuckSize duckSize) {
        if (duckSize == DuckSize.LARGE || duckSize == DuckSize.XLARGE) return PackageType.WOOD;
        if (duckSize == DuckSize.MEDIUM) return PackageType.CARDBOARD;
        if (duckSize == DuckSize.SMALL || duckSize == DuckSize.XSMALL) return PackageType.PLASTIC;
        throw new IllegalArgumentException("there is no exist a package type for this duck size");
    }
}
