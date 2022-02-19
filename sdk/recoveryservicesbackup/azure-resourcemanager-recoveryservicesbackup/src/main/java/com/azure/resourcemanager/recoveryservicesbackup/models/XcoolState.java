// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for XcoolState. */
public final class XcoolState extends ExpandableStringEnum<XcoolState> {
    /** Static value Invalid for XcoolState. */
    public static final XcoolState INVALID = fromString("Invalid");

    /** Static value Enabled for XcoolState. */
    public static final XcoolState ENABLED = fromString("Enabled");

    /** Static value Disabled for XcoolState. */
    public static final XcoolState DISABLED = fromString("Disabled");

    /**
     * Creates or finds a XcoolState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding XcoolState.
     */
    @JsonCreator
    public static XcoolState fromString(String name) {
        return fromString(name, XcoolState.class);
    }

    /** @return known XcoolState values. */
    public static Collection<XcoolState> values() {
        return values(XcoolState.class);
    }
}