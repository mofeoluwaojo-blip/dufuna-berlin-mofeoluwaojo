
package com.dufuna.berlin.mofeoluwaojo.lekki;

import com.dufuna.berlin.mofeoluwaojo.model.LekkiProperty;
import com.dufuna.berlin.mofeoluwaojo.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        // 1. Create a LekkiProperty object
        LekkiProperty property = new LekkiProperty();

        // 2. Create the service object
        MockLekkiPropertyService service = new MockLekkiPropertyService();

        // 3. Save the property
        service.saveProperty(property);

        // 4. Retrieve the property
        service.getProperty(property.getPropertyId());

    }
}
