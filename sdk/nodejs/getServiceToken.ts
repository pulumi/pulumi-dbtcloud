// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

export function getServiceToken(args: GetServiceTokenArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dbtcloud:index/getServiceToken:getServiceToken", {
        "serviceTokenId": args.serviceTokenId,
        "serviceTokenPermissions": args.serviceTokenPermissions,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceToken.
 */
export interface GetServiceTokenArgs {
    /**
     * The ID of the service token
     */
    serviceTokenId: number;
    /**
     * Permissions set for the service token
     */
    serviceTokenPermissions?: inputs.GetServiceTokenServiceTokenPermission[];
}

/**
 * A collection of values returned by getServiceToken.
 */
export interface GetServiceTokenResult {
    /**
     * The ID of the service token
     */
    readonly id: string;
    /**
     * Service token name
     */
    readonly name: string;
    /**
     * The ID of the service token
     */
    readonly serviceTokenId: number;
    /**
     * Permissions set for the service token
     */
    readonly serviceTokenPermissions?: outputs.GetServiceTokenServiceTokenPermission[];
    /**
     * Service token UID (part of the token)
     */
    readonly uid: string;
}
export function getServiceTokenOutput(args: GetServiceTokenOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceTokenResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("dbtcloud:index/getServiceToken:getServiceToken", {
        "serviceTokenId": args.serviceTokenId,
        "serviceTokenPermissions": args.serviceTokenPermissions,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceToken.
 */
export interface GetServiceTokenOutputArgs {
    /**
     * The ID of the service token
     */
    serviceTokenId: pulumi.Input<number>;
    /**
     * Permissions set for the service token
     */
    serviceTokenPermissions?: pulumi.Input<pulumi.Input<inputs.GetServiceTokenServiceTokenPermissionArgs>[]>;
}