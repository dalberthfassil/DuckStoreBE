package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Service;


@Service
public class CardBoardPackagingStrategy implements PackagingStrategy {


    @Override
    public void ProcessPackaging() {
        System.out.println("using Plastic proteccion");
    }

    @Override
    public PackageType getPackageType() {
        return PackageType.CARDBOARD;
    }
}
