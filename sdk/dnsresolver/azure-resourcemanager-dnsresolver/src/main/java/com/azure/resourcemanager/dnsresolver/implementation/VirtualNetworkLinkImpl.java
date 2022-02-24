// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.implementation;

import com.azure.core.management.SubResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.dnsresolver.fluent.models.VirtualNetworkLinkInner;
import com.azure.resourcemanager.dnsresolver.models.ProvisioningState;
import com.azure.resourcemanager.dnsresolver.models.VirtualNetworkLink;
import com.azure.resourcemanager.dnsresolver.models.VirtualNetworkLinkPatch;
import java.util.Collections;
import java.util.Map;

public final class VirtualNetworkLinkImpl
    implements VirtualNetworkLink, VirtualNetworkLink.Definition, VirtualNetworkLink.Update {
    private VirtualNetworkLinkInner innerObject;

    private final com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public SubResource virtualNetwork() {
        return this.innerModel().virtualNetwork();
    }

    public Map<String, String> metadata() {
        Map<String, String> inner = this.innerModel().metadata();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualNetworkLinkInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dnsresolver.DnsResolverManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String dnsForwardingRulesetName;

    private String virtualNetworkLinkName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    private VirtualNetworkLinkPatch updateParameters;

    public VirtualNetworkLinkImpl withExistingDnsForwardingRuleset(
        String resourceGroupName, String dnsForwardingRulesetName) {
        this.resourceGroupName = resourceGroupName;
        this.dnsForwardingRulesetName = dnsForwardingRulesetName;
        return this;
    }

    public VirtualNetworkLink create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkLinks()
                .createOrUpdate(
                    resourceGroupName,
                    dnsForwardingRulesetName,
                    virtualNetworkLinkName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE);
        return this;
    }

    public VirtualNetworkLink create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkLinks()
                .createOrUpdate(
                    resourceGroupName,
                    dnsForwardingRulesetName,
                    virtualNetworkLinkName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    context);
        return this;
    }

    VirtualNetworkLinkImpl(String name, com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager) {
        this.innerObject = new VirtualNetworkLinkInner();
        this.serviceManager = serviceManager;
        this.virtualNetworkLinkName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public VirtualNetworkLinkImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new VirtualNetworkLinkPatch();
        return this;
    }

    public VirtualNetworkLink apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkLinks()
                .update(
                    resourceGroupName,
                    dnsForwardingRulesetName,
                    virtualNetworkLinkName,
                    updateParameters,
                    updateIfMatch,
                    Context.NONE);
        return this;
    }

    public VirtualNetworkLink apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkLinks()
                .update(
                    resourceGroupName,
                    dnsForwardingRulesetName,
                    virtualNetworkLinkName,
                    updateParameters,
                    updateIfMatch,
                    context);
        return this;
    }

    VirtualNetworkLinkImpl(
        VirtualNetworkLinkInner innerObject, com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.dnsForwardingRulesetName = Utils.getValueFromIdByName(innerObject.id(), "dnsForwardingRulesets");
        this.virtualNetworkLinkName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkLinks");
    }

    public VirtualNetworkLink refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkLinks()
                .getWithResponse(resourceGroupName, dnsForwardingRulesetName, virtualNetworkLinkName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualNetworkLink refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualNetworkLinks()
                .getWithResponse(resourceGroupName, dnsForwardingRulesetName, virtualNetworkLinkName, context)
                .getValue();
        return this;
    }

    public VirtualNetworkLinkImpl withVirtualNetwork(SubResource virtualNetwork) {
        this.innerModel().withVirtualNetwork(virtualNetwork);
        return this;
    }

    public VirtualNetworkLinkImpl withMetadata(Map<String, String> metadata) {
        if (isInCreateMode()) {
            this.innerModel().withMetadata(metadata);
            return this;
        } else {
            this.updateParameters.withMetadata(metadata);
            return this;
        }
    }

    public VirtualNetworkLinkImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    public VirtualNetworkLinkImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}