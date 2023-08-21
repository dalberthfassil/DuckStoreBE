package com.ducks.store.domain.strategy.shipping;

import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.enums.ShippingType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeaShippingStrategy implements ShippingStrategy {

    @Override
    public void ProcessShipping() {
        System.out.println("using sea strategy");
    }

    @Override
    public List<String> getPackageFiller(PackageType packageType) {
        List<String> filler = new ArrayList<>();
        filler.add("Bolitas absorventes de humedad");
        filler.add("Bolsas con burbuja");
        return filler;
    }

    @Override
    public ShippingType getShippingType() {
        return ShippingType.MAR;
    }
}
