package com.dufuna.berlin.mofeoluwaojo.service;

import com.dufuna.berlin.mofeoluwaojo.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {

    @Override
    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
    }

    @Override
    public LekkiProperty getProperty(Long propertyId) {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return null;
    }
}
