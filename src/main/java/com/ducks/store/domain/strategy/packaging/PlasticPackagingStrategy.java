package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Service;;import java.util.ArrayList;
import java.util.List;


@Service
public class PlasticPackagingStrategy implements PackagingStrategy {
   private int amount = 0;
    private double price=0;
    @Override
    public void ProcessPackaging() {
        System.out.println("using plastic");
    }



    @Override
    public double getTotal(int amount, double price) {
        double total = amount*price;
        return total+(total*0.10);
    }

    @Override
    public List<String> getDetails() {
        List<String> details = new ArrayList<>();
        details.add( "agregado 10% por tipo paquete plastico");
        return details;
    }

    @Override
    public PackageType getPackageType() {
        return PackageType.PLASTIC;
    }

}
