// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.confidentialledger {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.confidentialledger;
    exports com.azure.resourcemanager.confidentialledger.fluent;
    exports com.azure.resourcemanager.confidentialledger.fluent.models;
    exports com.azure.resourcemanager.confidentialledger.models;

    opens com.azure.resourcemanager.confidentialledger.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.confidentialledger.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}