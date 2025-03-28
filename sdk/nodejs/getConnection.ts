// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export function getConnection(args: GetConnectionArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dbtcloud:index/getConnection:getConnection", {
        "connectionId": args.connectionId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionArgs {
    /**
     * ID for the connection
     */
    connectionId: number;
    /**
     * Project ID to create the connection in
     */
    projectId: number;
}

/**
 * A collection of values returned by getConnection.
 */
export interface GetConnectionResult {
    /**
     * Account for the connection
     */
    readonly account: string;
    /**
     * Flag for whether or not to use the keep session alive parameter in the connection
     */
    readonly allowKeepAlive: boolean;
    /**
     * Flag for whether or not to use SSO for the connection
     */
    readonly allowSso: boolean;
    /**
     * ID for the connection
     */
    readonly connectionId: number;
    /**
     * Database name for the connection
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Whether the connection is active
     */
    readonly isActive: boolean;
    /**
     * Connection name
     */
    readonly name: string;
    /**
     * The ID of the PrivateLink connection
     */
    readonly privateLinkEndpointId: string;
    /**
     * Project ID to create the connection in
     */
    readonly projectId: number;
    /**
     * Role name for the connection
     */
    readonly role: string;
    /**
     * Connection type
     */
    readonly type: string;
    /**
     * Warehouse name for the connection
     */
    readonly warehouse: string;
}
export function getConnectionOutput(args: GetConnectionOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetConnectionResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("dbtcloud:index/getConnection:getConnection", {
        "connectionId": args.connectionId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnection.
 */
export interface GetConnectionOutputArgs {
    /**
     * ID for the connection
     */
    connectionId: pulumi.Input<number>;
    /**
     * Project ID to create the connection in
     */
    projectId: pulumi.Input<number>;
}
