package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CardBoardPackagingStrategy implements PackagingStrategy {


    @Override
    public void ProcessPackaging() {
        System.out.println("using Plastic proteccion");
    }

    @Override
    public double getTotal(int amount, double price) {
        double total = amount*price;
        return total-(total*0.01);
    }

    @Override
    public List<String> getDetails() {
        List<String> details = new ArrayList<>();
        details.add( "descuento 1% por tipo paquete carton");
        return details;
    }

    @Override
    public PackageType getPackageType() {
        return PackageType.CARDBOARD;
    }
}
