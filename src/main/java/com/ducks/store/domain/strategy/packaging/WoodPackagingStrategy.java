package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WoodPackagingStrategy implements PackagingStrategy {
    @Override
    public void ProcessPackaging() {
        System.out.println("using wood");
    }

    @Override
    public double getTotal(int amount, double price) {
        double total = amount*price;
        return total+(total*0.05);
    }

    @Override
    public List<String> getDetails() {
        List<String> details = new ArrayList<>();
        details.add( "agregado 5% por tipo paquete madera");
        return details;
    }

    @Override
    public PackageType getPackageType() {
        return PackageType.WOOD;
    }

}
