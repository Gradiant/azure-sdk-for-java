// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.VirtualHubEffectiveRoute;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** EffectiveRoutes List. */
@Fluent
public final class VirtualHubEffectiveRouteListInner {
    /*
     * The list of effective routes configured on the virtual hub or the specified resource.
     */
    @JsonProperty(value = "value")
    private List<VirtualHubEffectiveRoute> value;

    /** Creates an instance of VirtualHubEffectiveRouteListInner class. */
    public VirtualHubEffectiveRouteListInner() {
    }

    /**
     * Get the value property: The list of effective routes configured on the virtual hub or the specified resource.
     *
     * @return the value value.
     */
    public List<VirtualHubEffectiveRoute> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of effective routes configured on the virtual hub or the specified resource.
     *
     * @param value the value value to set.
     * @return the VirtualHubEffectiveRouteListInner object itself.
     */
    public VirtualHubEffectiveRouteListInner withValue(List<VirtualHubEffectiveRoute> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
