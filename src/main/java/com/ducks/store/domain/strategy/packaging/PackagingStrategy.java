package com.ducks.store.domain.strategy.packaging;

import com.ducks.store.domain.enums.PackageType;

import java.util.List;

public interface PackagingStrategy {
     public void ProcessPackaging();
    public double getTotal(int amount, double price);
    public List<String> getDetails();
    public PackageType getPackageType();
}
