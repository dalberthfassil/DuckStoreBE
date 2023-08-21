package com.ducks.store.domain.strategy.shipping;

import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.enums.ShippingType;

import java.util.List;

public interface ShippingStrategy{

    public void ProcessShipping();

    public List<String> getPackageFiller(PackageType packageType );
    public ShippingType getShippingType();
}
