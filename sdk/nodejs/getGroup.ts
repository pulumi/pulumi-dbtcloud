// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Retrieve group details
 */
export function getGroup(args: GetGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dbtcloud:index/getGroup:getGroup", {
        "groupId": args.groupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupArgs {
    /**
     * The ID of the group
     */
    groupId: number;
}

/**
 * A collection of values returned by getGroup.
 */
export interface GetGroupResult {
    /**
     * Whether the group will be assigned by default to users. The value needs to be the same for all partial permissions for the same group.
     */
    readonly assignByDefault: boolean;
    /**
     * The ID of the group
     */
    readonly groupId: number;
    /**
     * Partial permissions for the group. Those permissions will be added/removed when config is added/removed.
     */
    readonly groupPermissions: outputs.GetGroupGroupPermission[];
    /**
     * The ID of this resource
     */
    readonly id: number;
    /**
     * Group name
     */
    readonly name: string;
    /**
     * SSO mapping group names for this group
     */
    readonly ssoMappingGroups: string[];
}
/**
 * Retrieve group details
 */
export function getGroupOutput(args: GetGroupOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetGroupResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("dbtcloud:index/getGroup:getGroup", {
        "groupId": args.groupId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGroup.
 */
export interface GetGroupOutputArgs {
    /**
     * The ID of the group
     */
    groupId: pulumi.Input<number>;
}
