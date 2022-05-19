// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AnalyzeTextTaskResultsKind. */
public final class AnalyzeTextTaskResultsKind extends ExpandableStringEnum<AnalyzeTextTaskResultsKind> {
    /** Static value SentimentAnalysisResults for AnalyzeTextTaskResultsKind. */
    public static final AnalyzeTextTaskResultsKind SENTIMENT_ANALYSIS_RESULTS = fromString("SentimentAnalysisResults");

    /** Static value EntityRecognitionResults for AnalyzeTextTaskResultsKind. */
    public static final AnalyzeTextTaskResultsKind ENTITY_RECOGNITION_RESULTS = fromString("EntityRecognitionResults");

    /** Static value PiiEntityRecognitionResults for AnalyzeTextTaskResultsKind. */
    public static final AnalyzeTextTaskResultsKind PII_ENTITY_RECOGNITION_RESULTS =
            fromString("PiiEntityRecognitionResults");

    /** Static value KeyPhraseExtractionResults for AnalyzeTextTaskResultsKind. */
    public static final AnalyzeTextTaskResultsKind KEY_PHRASE_EXTRACTION_RESULTS =
            fromString("KeyPhraseExtractionResults");

    /** Static value LanguageDetectionResults for AnalyzeTextTaskResultsKind. */
    public static final AnalyzeTextTaskResultsKind LANGUAGE_DETECTION_RESULTS = fromString("LanguageDetectionResults");

    /** Static value EntityLinkingResults for AnalyzeTextTaskResultsKind. */
    public static final AnalyzeTextTaskResultsKind ENTITY_LINKING_RESULTS = fromString("EntityLinkingResults");

    /**
     * Creates or finds a AnalyzeTextTaskResultsKind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnalyzeTextTaskResultsKind.
     */
    @JsonCreator
    public static AnalyzeTextTaskResultsKind fromString(String name) {
        return fromString(name, AnalyzeTextTaskResultsKind.class);
    }

    /** @return known AnalyzeTextTaskResultsKind values. */
    public static Collection<AnalyzeTextTaskResultsKind> values() {
        return values(AnalyzeTextTaskResultsKind.class);
    }
}