// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.hardwaresecuritymodules {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.hardwaresecuritymodules;
    exports com.azure.resourcemanager.hardwaresecuritymodules.fluent;
    exports com.azure.resourcemanager.hardwaresecuritymodules.fluent.models;
    exports com.azure.resourcemanager.hardwaresecuritymodules.models;

    opens com.azure.resourcemanager.hardwaresecuritymodules.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.hardwaresecuritymodules.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}