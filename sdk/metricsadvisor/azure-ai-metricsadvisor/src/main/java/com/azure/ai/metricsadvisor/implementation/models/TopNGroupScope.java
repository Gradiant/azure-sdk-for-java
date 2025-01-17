// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TopNGroupScope model. */
@Fluent
public final class TopNGroupScope {
    /*
     * top N, value range : [1, +∞)
     */
    @JsonProperty(value = "top", required = true)
    private int top;

    /*
     * point count used to look back, value range : [1, +∞)
     */
    @JsonProperty(value = "period", required = true)
    private int period;

    /*
     * min count should be in top N, value range : [1, +∞)
     *
     * should be less than or equal to period
     */
    @JsonProperty(value = "minTopCount", required = true)
    private int minTopCount;

    /** Creates an instance of TopNGroupScope class. */
    public TopNGroupScope() {}

    /**
     * Get the top property: top N, value range : [1, +∞).
     *
     * @return the top value.
     */
    public int getTop() {
        return this.top;
    }

    /**
     * Set the top property: top N, value range : [1, +∞).
     *
     * @param top the top value to set.
     * @return the TopNGroupScope object itself.
     */
    public TopNGroupScope setTop(int top) {
        this.top = top;
        return this;
    }

    /**
     * Get the period property: point count used to look back, value range : [1, +∞).
     *
     * @return the period value.
     */
    public int getPeriod() {
        return this.period;
    }

    /**
     * Set the period property: point count used to look back, value range : [1, +∞).
     *
     * @param period the period value to set.
     * @return the TopNGroupScope object itself.
     */
    public TopNGroupScope setPeriod(int period) {
        this.period = period;
        return this;
    }

    /**
     * Get the minTopCount property: min count should be in top N, value range : [1, +∞)
     *
     * <p>should be less than or equal to period.
     *
     * @return the minTopCount value.
     */
    public int getMinTopCount() {
        return this.minTopCount;
    }

    /**
     * Set the minTopCount property: min count should be in top N, value range : [1, +∞)
     *
     * <p>should be less than or equal to period.
     *
     * @param minTopCount the minTopCount value to set.
     * @return the TopNGroupScope object itself.
     */
    public TopNGroupScope setMinTopCount(int minTopCount) {
        this.minTopCount = minTopCount;
        return this;
    }
}
