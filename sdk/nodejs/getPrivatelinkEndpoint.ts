// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dbtcloud from "@pulumi/dbtcloud";
 *
 * const testWithName = dbtcloud.getPrivatelinkEndpoint({
 *     name: "My Endpoint Name",
 * });
 * const testWithUrl = dbtcloud.getPrivatelinkEndpoint({
 *     privateLinkEndpointUrl: "abc.privatelink.def.com",
 * });
 * // in case multiple endpoints have the same name or URL
 * const testWithNameAndUrl = dbtcloud.getPrivatelinkEndpoint({
 *     name: "My Endpoint Name",
 *     privateLinkEndpointUrl: "abc.privatelink.def.com",
 * });
 * ```
 */
export function getPrivatelinkEndpoint(args?: GetPrivatelinkEndpointArgs, opts?: pulumi.InvokeOptions): Promise<GetPrivatelinkEndpointResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dbtcloud:index/getPrivatelinkEndpoint:getPrivatelinkEndpoint", {
        "name": args.name,
        "privateLinkEndpointUrl": args.privateLinkEndpointUrl,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpoint.
 */
export interface GetPrivatelinkEndpointArgs {
    /**
     * Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
     */
    name?: string;
    /**
     * The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
     */
    privateLinkEndpointUrl?: string;
}

/**
 * A collection of values returned by getPrivatelinkEndpoint.
 */
export interface GetPrivatelinkEndpointResult {
    /**
     * The CIDR range of the PrivateLink Endpoint
     */
    readonly cidrRange: string;
    /**
     * The internal ID of the PrivateLink Endpoint
     */
    readonly id: string;
    /**
     * Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
     */
    readonly name?: string;
    /**
     * The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
     */
    readonly privateLinkEndpointUrl?: string;
    /**
     * PrivatelinkEndpoint state should be 1 = active, as 2 = deleted
     *
     * @deprecated Remove this attribute's configuration as it's no longer in use and the attribute will be removed in the next major version of the provider.
     */
    readonly state: number;
    /**
     * Type of the PrivateLink Endpoint
     */
    readonly type: string;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dbtcloud from "@pulumi/dbtcloud";
 *
 * const testWithName = dbtcloud.getPrivatelinkEndpoint({
 *     name: "My Endpoint Name",
 * });
 * const testWithUrl = dbtcloud.getPrivatelinkEndpoint({
 *     privateLinkEndpointUrl: "abc.privatelink.def.com",
 * });
 * // in case multiple endpoints have the same name or URL
 * const testWithNameAndUrl = dbtcloud.getPrivatelinkEndpoint({
 *     name: "My Endpoint Name",
 *     privateLinkEndpointUrl: "abc.privatelink.def.com",
 * });
 * ```
 */
export function getPrivatelinkEndpointOutput(args?: GetPrivatelinkEndpointOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetPrivatelinkEndpointResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("dbtcloud:index/getPrivatelinkEndpoint:getPrivatelinkEndpoint", {
        "name": args.name,
        "privateLinkEndpointUrl": args.privateLinkEndpointUrl,
    }, opts);
}

/**
 * A collection of arguments for invoking getPrivatelinkEndpoint.
 */
export interface GetPrivatelinkEndpointOutputArgs {
    /**
     * Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
     */
    name?: pulumi.Input<string>;
    /**
     * The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
     */
    privateLinkEndpointUrl?: pulumi.Input<string>;
}
