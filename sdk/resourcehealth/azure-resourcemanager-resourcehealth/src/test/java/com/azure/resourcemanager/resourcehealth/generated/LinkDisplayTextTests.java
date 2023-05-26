// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.models.LinkDisplayText;
import org.junit.jupiter.api.Assertions;

public final class LinkDisplayTextTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LinkDisplayText model =
            BinaryData.fromString("{\"value\":\"cuh\",\"localizedValue\":\"tcty\"}").toObject(LinkDisplayText.class);
        Assertions.assertEquals("cuh", model.value());
        Assertions.assertEquals("tcty", model.localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LinkDisplayText model = new LinkDisplayText().withValue("cuh").withLocalizedValue("tcty");
        model = BinaryData.fromObject(model).toObject(LinkDisplayText.class);
        Assertions.assertEquals("cuh", model.value());
        Assertions.assertEquals("tcty", model.localizedValue());
    }
}
