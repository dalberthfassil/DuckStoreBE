package com.ducks.store.domain.strategy.shipping;

import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.enums.ProtectionType;
import com.ducks.store.domain.enums.ShippingType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroundShippingStrategy implements ShippingStrategy {


    @Override
    public void ProcessShipping() {
        System.out.println("using ground strategy");
    }

    @Override
    public List<ProtectionType> getProtectionFiller(PackageType packageType) {
        List<ProtectionType> filler = new ArrayList<>();
        filler.add(ProtectionType.PLASTOFORM_BALLS);
        return filler;
    }

    @Override
    public ShippingType getShippingType() {
        return ShippingType.TIERRA;
    }

    @Override
    public double getTaxes(int amount) {
        return amount*10;
    }

    @Override
    public List<String> getDetails(int amount) {
        List<String> details = new ArrayList<>();
        details.add("agregado 10 USD * candidad - envio por tierra");
        return details;
    }
}
