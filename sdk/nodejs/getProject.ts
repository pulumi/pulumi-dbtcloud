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
 * // projects data sources can use the project_id parameter (preferred uniqueness is ensured)
 * const testProject = dbtcloud.getProject({
 *     projectId: dbtCloudProjectId,
 * });
 * // or they can use project names
 * // the provider will raise an error if more than one project is found with the same name
 * const anotherTestProject = dbtcloud.getProject({
 *     name: "My other project name",
 * });
 * ```
 */
export function getProject(args?: GetProjectArgs, opts?: pulumi.InvokeOptions): Promise<GetProjectResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dbtcloud:index/getProject:getProject", {
        "description": args.description,
        "name": args.name,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProject.
 */
export interface GetProjectArgs {
    /**
     * The description of the project
     */
    description?: string;
    /**
     * Given name for project
     */
    name?: string;
    /**
     * ID of the project to represent
     */
    projectId?: number;
}

/**
 * A collection of values returned by getProject.
 */
export interface GetProjectResult {
    /**
     * ID of the connection associated with the project
     */
    readonly connectionId: number;
    /**
     * The description of the project
     */
    readonly description: string;
    /**
     * ID of Job for the documentation
     */
    readonly docsJobId: number;
    /**
     * ID of Job for source freshness
     */
    readonly freshnessJobId: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Given name for project
     */
    readonly name: string;
    /**
     * ID of the project to represent
     */
    readonly projectId?: number;
    /**
     * ID of the repository associated with the project
     */
    readonly repositoryId: number;
    /**
     * Project state should be 1 = active, as 2 = deleted
     *
     * @deprecated Remove this attribute's configuration as it's no longer in use and the attribute will be removed in the next major version of the provider.
     */
    readonly state: number;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dbtcloud from "@pulumi/dbtcloud";
 *
 * // projects data sources can use the project_id parameter (preferred uniqueness is ensured)
 * const testProject = dbtcloud.getProject({
 *     projectId: dbtCloudProjectId,
 * });
 * // or they can use project names
 * // the provider will raise an error if more than one project is found with the same name
 * const anotherTestProject = dbtcloud.getProject({
 *     name: "My other project name",
 * });
 * ```
 */
export function getProjectOutput(args?: GetProjectOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetProjectResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("dbtcloud:index/getProject:getProject", {
        "description": args.description,
        "name": args.name,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getProject.
 */
export interface GetProjectOutputArgs {
    /**
     * The description of the project
     */
    description?: pulumi.Input<string>;
    /**
     * Given name for project
     */
    name?: pulumi.Input<string>;
    /**
     * ID of the project to represent
     */
    projectId?: pulumi.Input<number>;
}
