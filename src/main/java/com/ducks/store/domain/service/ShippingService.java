package com.ducks.store.domain.service;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.PackageType;
import com.ducks.store.domain.enums.ShippingType;
import com.ducks.store.domain.service.factory.PackingFactoryService;
import com.ducks.store.domain.strategy.packaging.CardBoardPackagingStrategy;
import com.ducks.store.domain.strategy.packaging.PackagingStrategy;
import com.ducks.store.domain.strategy.packaging.PlasticPackagingStrategy;
import com.ducks.store.domain.strategy.packaging.WoodPackagingStrategy;
import com.ducks.store.domain.strategy.stuffing.PackageStuffingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShippingService implements IShippingService {
    private  PackagingStrategy packagingStrategy;
    private  PackageStuffingStrategy packageStuffingStrategy;
    private Map<DuckSize, PackagingStrategy> packagesStrategies;
    @Autowired
    public ShippingService(PackagingStrategy packagingStrategy, PackageStuffingStrategy packageStuffingStrategy) {
        this.packagingStrategy = packagingStrategy;
        this.packageStuffingStrategy=packageStuffingStrategy;
        packagesStrategies = new HashMap<>();
        packagesStrategies.put(DuckSize.XLARGE, new WoodPackagingStrategy());
        packagesStrategies.put(DuckSize.LARGE, new WoodPackagingStrategy());
        packagesStrategies.put(DuckSize.MEDIUM, new CardBoardPackagingStrategy());
        packagesStrategies.put(DuckSize.SMALL, new PlasticPackagingStrategy());
        packagesStrategies.put(DuckSize.XSMALL, new PlasticPackagingStrategy());
    }

    @Override
    public String processShipping(DuckSize duckSize, ShippingType shippingType) {
        PackagingStrategy packageType= packagesStrategies.get(duckSize);

        PackageType packaging= packageType.getPackageType();


        String packageStuffing=packageStuffingStrategy.getStuffingType(shippingType,"plastic");
        return  "se enviara con :" + packaging + " y se rellenara con " + packageStuffing;
    }


}
