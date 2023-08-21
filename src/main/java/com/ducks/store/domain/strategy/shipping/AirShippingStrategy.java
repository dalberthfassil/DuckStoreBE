package com.ducks.store.domain.strategy.shipping;

import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.enums.ShippingType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirShippingStrategy implements ShippingStrategy {

    @Override
    public void ProcessShipping() {
        System.out.println("using air strategy");
    }

    @Override
    public List<String> getPackageFiller(PackageType packageType) {
        List<String> filler = new ArrayList<>();
        if (packageType.equals(PackageType.WOOD) || packageType.equals(PackageType.CARDBOARD)) {
            filler.add("Bolitas de Plastoformo");
        }
        if (packageType.equals(PackageType.PLASTIC)) {
            filler.add("Bolsas con burbuja");
        }
        return filler;
    }

    @Override
    public ShippingType getShippingType() {
        return ShippingType.AIRE;
    }
}
