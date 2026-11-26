package com.dufuna.berlin.mofeoluwaojo.service;

import com.dufuna.berlin.mofeoluwaojo.model.LekkiProperty;

public interface LekkiPropertyService {

    void saveProperty(LekkiProperty property);

    LekkiProperty getProperty(Long propertyId);

}
