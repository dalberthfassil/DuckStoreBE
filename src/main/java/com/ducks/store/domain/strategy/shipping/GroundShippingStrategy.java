package com.ducks.store.domain.strategy.shipping;

import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.enums.ShippingType;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<String> getPackageFiller(PackageType packageType) {
        List<String> filler = new ArrayList<>();
        filler.add("Bolitas de plastoformo");
        return filler;
    }

    @Override
    public ShippingType getShippingType() {
        return ShippingType.TIERRA;
    }
}
