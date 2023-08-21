package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.DuckSize;
import com.ducks.store.domain.enums.PackageType;
import org.springframework.stereotype.Service;


public class CardBoardPackagingStrategy  implements PackagingStrategy {
//    @Override
//    public String getPackageType(DuckSize size) {
//        if (size == DuckSize.MEDIUM) {
//            return "plastico";
//        }
//        return null;
//    }

    @Override
    public void ProcessPackaing() {
        System.out.println("using Plastic proteccion");
    }

    @Override
    public PackageType getPackageType() {
        return PackageType.CARDBOARD;
    }
}
