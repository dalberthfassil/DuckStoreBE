package com.ducks.store.web.controller;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.ShippingType;
import com.ducks.store.domain.service.IShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/ducks")
public class DucksController {

    private final IShippingService iShippingService;
    @Autowired
    public DucksController(IShippingService shippingService){
        this.iShippingService= shippingService;
    }


    @GetMapping("getPackageType")
    public String  duckList(DuckSize duckSize, ShippingType shippingType){

        String result= iShippingService.processShipping(duckSize,shippingType);

        return result;
    }
}
