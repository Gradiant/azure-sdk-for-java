// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A policy violation reported against a gallery artifact. */
@Fluent
public final class PolicyViolation {
    /*
     * Describes the nature of the policy violation.
     */
    @JsonProperty(value = "category")
    private PolicyViolationCategory category;

    /*
     * Describes specific details about why this policy violation was reported.
     */
    @JsonProperty(value = "details")
    private String details;

    /** Creates an instance of PolicyViolation class. */
    public PolicyViolation() {
    }

    /**
     * Get the category property: Describes the nature of the policy violation.
     *
     * @return the category value.
     */
    public PolicyViolationCategory category() {
        return this.category;
    }

    /**
     * Set the category property: Describes the nature of the policy violation.
     *
     * @param category the category value to set.
     * @return the PolicyViolation object itself.
     */
    public PolicyViolation withCategory(PolicyViolationCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get the details property: Describes specific details about why this policy violation was reported.
     *
     * @return the details value.
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details property: Describes specific details about why this policy violation was reported.
     *
     * @param details the details value to set.
     * @return the PolicyViolation object itself.
     */
    public PolicyViolation withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
