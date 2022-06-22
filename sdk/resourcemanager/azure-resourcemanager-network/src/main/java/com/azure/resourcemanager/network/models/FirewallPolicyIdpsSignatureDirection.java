// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for FirewallPolicyIdpsSignatureDirection. */
public enum FirewallPolicyIdpsSignatureDirection {
    /** Enum value 0. */
    ZERO(0),

    /** Enum value 1. */
    ONE(1),

    /** Enum value 2. */
    TWO(2);

    /** The actual serialized value for a FirewallPolicyIdpsSignatureDirection instance. */
    private final int value;

    FirewallPolicyIdpsSignatureDirection(int value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a FirewallPolicyIdpsSignatureDirection instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed FirewallPolicyIdpsSignatureDirection object, or null if unable to parse.
     */
    @JsonCreator
    public static FirewallPolicyIdpsSignatureDirection fromInt(int value) {
        FirewallPolicyIdpsSignatureDirection[] items = FirewallPolicyIdpsSignatureDirection.values();
        for (FirewallPolicyIdpsSignatureDirection item : items) {
            if (item.toInt() == value) {
                return item;
            }
        }
        return null;
    }

    /**
     * De-serializes the instance to int value.
     *
     * @return the int value.
     */
    @JsonValue
    public int toInt() {
        return this.value;
    }
}
