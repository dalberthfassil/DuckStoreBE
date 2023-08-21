package com.ducks.store.domain.strategy.stuffing;

import com.ducks.store.domain.enums.ShippingType;
import org.springframework.stereotype.Service;

@Service
public class BubbleBagStrategy implements  PackageStuffingStrategy{
    @Override
    public String getStuffingType(ShippingType shippingType, String packagingType) {
        if (shippingType == ShippingType.AIRE || packagingType.equals("plastico")) {
            return "bolsas con burbujas";
        }
        if (shippingType == ShippingType.MAR ) {
            return "bolsas con burbujas";
        }
        return null;
    }
}
