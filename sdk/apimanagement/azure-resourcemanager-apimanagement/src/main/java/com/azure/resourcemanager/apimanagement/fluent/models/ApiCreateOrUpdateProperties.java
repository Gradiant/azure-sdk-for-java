// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.ApiContactInformation;
import com.azure.resourcemanager.apimanagement.models.ApiCreateOrUpdatePropertiesWsdlSelector;
import com.azure.resourcemanager.apimanagement.models.ApiLicenseInformation;
import com.azure.resourcemanager.apimanagement.models.ApiType;
import com.azure.resourcemanager.apimanagement.models.ApiVersionSetContractDetails;
import com.azure.resourcemanager.apimanagement.models.AuthenticationSettingsContract;
import com.azure.resourcemanager.apimanagement.models.ContentFormat;
import com.azure.resourcemanager.apimanagement.models.Protocol;
import com.azure.resourcemanager.apimanagement.models.SoapApiType;
import com.azure.resourcemanager.apimanagement.models.SubscriptionKeyParameterNamesContract;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** API Create or Update Properties. */
@Fluent
public final class ApiCreateOrUpdateProperties extends ApiContractProperties {
    /*
     * Content value when Importing an API.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * Format of the Content in which the API is getting imported.
     */
    @JsonProperty(value = "format")
    private ContentFormat format;

    /*
     * Criteria to limit import of WSDL to a subset of the document.
     */
    @JsonProperty(value = "wsdlSelector")
    private ApiCreateOrUpdatePropertiesWsdlSelector wsdlSelector;

    /*
     * Type of API to create.
     * * `http` creates a REST API
     * * `soap` creates a SOAP pass-through API
     * * `websocket` creates websocket API
     * * `graphql` creates GraphQL API.
     */
    @JsonProperty(value = "apiType")
    private SoapApiType soapApiType;

    /**
     * Get the value property: Content value when Importing an API.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Content value when Importing an API.
     *
     * @param value the value value to set.
     * @return the ApiCreateOrUpdateProperties object itself.
     */
    public ApiCreateOrUpdateProperties withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the format property: Format of the Content in which the API is getting imported.
     *
     * @return the format value.
     */
    public ContentFormat format() {
        return this.format;
    }

    /**
     * Set the format property: Format of the Content in which the API is getting imported.
     *
     * @param format the format value to set.
     * @return the ApiCreateOrUpdateProperties object itself.
     */
    public ApiCreateOrUpdateProperties withFormat(ContentFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the wsdlSelector property: Criteria to limit import of WSDL to a subset of the document.
     *
     * @return the wsdlSelector value.
     */
    public ApiCreateOrUpdatePropertiesWsdlSelector wsdlSelector() {
        return this.wsdlSelector;
    }

    /**
     * Set the wsdlSelector property: Criteria to limit import of WSDL to a subset of the document.
     *
     * @param wsdlSelector the wsdlSelector value to set.
     * @return the ApiCreateOrUpdateProperties object itself.
     */
    public ApiCreateOrUpdateProperties withWsdlSelector(ApiCreateOrUpdatePropertiesWsdlSelector wsdlSelector) {
        this.wsdlSelector = wsdlSelector;
        return this;
    }

    /**
     * Get the soapApiType property: Type of API to create. * `http` creates a REST API * `soap` creates a SOAP
     * pass-through API * `websocket` creates websocket API * `graphql` creates GraphQL API.
     *
     * @return the soapApiType value.
     */
    public SoapApiType soapApiType() {
        return this.soapApiType;
    }

    /**
     * Set the soapApiType property: Type of API to create. * `http` creates a REST API * `soap` creates a SOAP
     * pass-through API * `websocket` creates websocket API * `graphql` creates GraphQL API.
     *
     * @param soapApiType the soapApiType value to set.
     * @return the ApiCreateOrUpdateProperties object itself.
     */
    public ApiCreateOrUpdateProperties withSoapApiType(SoapApiType soapApiType) {
        this.soapApiType = soapApiType;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withSourceApiId(String sourceApiId) {
        super.withSourceApiId(sourceApiId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withDisplayName(String displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withServiceUrl(String serviceUrl) {
        super.withServiceUrl(serviceUrl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withPath(String path) {
        super.withPath(path);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withProtocols(List<Protocol> protocols) {
        super.withProtocols(protocols);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withApiVersionSet(ApiVersionSetContractDetails apiVersionSet) {
        super.withApiVersionSet(apiVersionSet);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withAuthenticationSettings(
        AuthenticationSettingsContract authenticationSettings) {
        super.withAuthenticationSettings(authenticationSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withSubscriptionKeyParameterNames(
        SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        super.withSubscriptionKeyParameterNames(subscriptionKeyParameterNames);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withApiType(ApiType apiType) {
        super.withApiType(apiType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withApiRevision(String apiRevision) {
        super.withApiRevision(apiRevision);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withApiVersion(String apiVersion) {
        super.withApiVersion(apiVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withIsCurrent(Boolean isCurrent) {
        super.withIsCurrent(isCurrent);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withApiRevisionDescription(String apiRevisionDescription) {
        super.withApiRevisionDescription(apiRevisionDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withApiVersionDescription(String apiVersionDescription) {
        super.withApiVersionDescription(apiVersionDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withApiVersionSetId(String apiVersionSetId) {
        super.withApiVersionSetId(apiVersionSetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withSubscriptionRequired(Boolean subscriptionRequired) {
        super.withSubscriptionRequired(subscriptionRequired);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withTermsOfServiceUrl(String termsOfServiceUrl) {
        super.withTermsOfServiceUrl(termsOfServiceUrl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withContact(ApiContactInformation contact) {
        super.withContact(contact);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiCreateOrUpdateProperties withLicense(ApiLicenseInformation license) {
        super.withLicense(license);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (wsdlSelector() != null) {
            wsdlSelector().validate();
        }
    }
}
