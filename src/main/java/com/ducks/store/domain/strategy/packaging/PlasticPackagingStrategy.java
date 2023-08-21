package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Service;;


@Service
public class PlasticPackagingStrategy implements PackagingStrategy {
    @Override
    public void ProcessPackaging() {
        System.out.println("using plastic");
    }

    @Override
    public PackageType getPackageType() {
        return PackageType.PLASTIC;
    }

}
