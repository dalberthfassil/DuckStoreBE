package com.ducks.store.domain.strategy.shipping;

import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.enums.ProtectionType;
import com.ducks.store.domain.enums.ShippingType;
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
    public List<ProtectionType> getProtectionFiller(PackageType packageType) {
        List<ProtectionType> filler = new ArrayList<>();
        if (packageType.equals(PackageType.WOOD) || packageType.equals(PackageType.CARDBOARD)) {
            filler.add(ProtectionType.PLASTOFORM_BALLS);
        }
        if (packageType.equals(PackageType.PLASTIC)) {
            filler.add(ProtectionType.BUBBLE_BAG);
        }
        return filler;
    }

    @Override
    public ShippingType getShippingType() {
        return ShippingType.AIRE;
    }
}
