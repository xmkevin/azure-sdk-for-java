// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.generated;

/**
 * Samples for Accounts List.
 */
public final class AccountsListSamples {
    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/stable/2024-01-01/examples/
     * Accounts_List_MinimumSet_Gen.json
     */
    /**
     * Sample code: Accounts_List_MinimumSet_Gen.
     * 
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void accountsListMinimumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        manager.accounts().list("ruxvg@xqkmdhrnoo.hlmbpm", "egh", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/newrelic/resource-manager/NewRelic.Observability/stable/2024-01-01/examples/
     * Accounts_List_MaximumSet_Gen.json
     */
    /**
     * Sample code: Accounts_List_MaximumSet_Gen.
     * 
     * @param manager Entry point to NewRelicObservabilityManager.
     */
    public static void accountsListMaximumSetGen(
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager) {
        manager.accounts().list("ruxvg@xqkmdhrnoo.hlmbpm", "egh", com.azure.core.util.Context.NONE);
    }
}
