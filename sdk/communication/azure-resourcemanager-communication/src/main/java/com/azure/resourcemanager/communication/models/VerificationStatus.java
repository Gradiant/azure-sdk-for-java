// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VerificationStatus. */
public final class VerificationStatus extends ExpandableStringEnum<VerificationStatus> {
    /** Static value NotStarted for VerificationStatus. */
    public static final VerificationStatus NOT_STARTED = fromString("NotStarted");

    /** Static value VerificationRequested for VerificationStatus. */
    public static final VerificationStatus VERIFICATION_REQUESTED = fromString("VerificationRequested");

    /** Static value VerificationInProgress for VerificationStatus. */
    public static final VerificationStatus VERIFICATION_IN_PROGRESS = fromString("VerificationInProgress");

    /** Static value VerificationFailed for VerificationStatus. */
    public static final VerificationStatus VERIFICATION_FAILED = fromString("VerificationFailed");

    /** Static value Verified for VerificationStatus. */
    public static final VerificationStatus VERIFIED = fromString("Verified");

    /** Static value CancellationRequested for VerificationStatus. */
    public static final VerificationStatus CANCELLATION_REQUESTED = fromString("CancellationRequested");

    /**
     * Creates or finds a VerificationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VerificationStatus.
     */
    @JsonCreator
    public static VerificationStatus fromString(String name) {
        return fromString(name, VerificationStatus.class);
    }

    /**
     * Gets known VerificationStatus values.
     *
     * @return known VerificationStatus values.
     */
    public static Collection<VerificationStatus> values() {
        return values(VerificationStatus.class);
    }
}