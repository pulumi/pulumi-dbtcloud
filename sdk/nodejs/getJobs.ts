// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dbtcloud from "@pulumi/dbtcloud";
 *
 * // we can search all jobs by project
 * const testAllJobsInProject = dbtcloud.getJobs({
 *     projectId: 1234,
 * });
 * // or by environment
 * const testAllJobsInEnvironment = dbtcloud.getJobs({
 *     environmentId: 1234,
 * });
 * const myJobsProd = testAllJobsInProject.then(testAllJobsInProject => .filter(job => job.environment?.deploymentType == "production").map(job => (job)));
 * ```
 */
export function getJobs(args?: GetJobsArgs, opts?: pulumi.InvokeOptions): Promise<GetJobsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dbtcloud:index/getJobs:getJobs", {
        "environmentId": args.environmentId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getJobs.
 */
export interface GetJobsArgs {
    /**
     * The ID of the environment for which we want to retrieve the jobs (one of `projectId` or `environmentId` must be set)
     */
    environmentId?: number;
    /**
     * The ID of the project for which we want to retrieve the jobs (one of `projectId` or `environmentId` must be set)
     */
    projectId?: number;
}

/**
 * A collection of values returned by getJobs.
 */
export interface GetJobsResult {
    /**
     * The ID of the environment for which we want to retrieve the jobs (one of `projectId` or `environmentId` must be set)
     */
    readonly environmentId?: number;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Set of jobs with their details
     */
    readonly jobs: outputs.GetJobsJob[];
    /**
     * The ID of the project for which we want to retrieve the jobs (one of `projectId` or `environmentId` must be set)
     */
    readonly projectId?: number;
}
/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dbtcloud from "@pulumi/dbtcloud";
 *
 * // we can search all jobs by project
 * const testAllJobsInProject = dbtcloud.getJobs({
 *     projectId: 1234,
 * });
 * // or by environment
 * const testAllJobsInEnvironment = dbtcloud.getJobs({
 *     environmentId: 1234,
 * });
 * const myJobsProd = testAllJobsInProject.then(testAllJobsInProject => .filter(job => job.environment?.deploymentType == "production").map(job => (job)));
 * ```
 */
export function getJobsOutput(args?: GetJobsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetJobsResult> {
    args = args || {};
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("dbtcloud:index/getJobs:getJobs", {
        "environmentId": args.environmentId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getJobs.
 */
export interface GetJobsOutputArgs {
    /**
     * The ID of the environment for which we want to retrieve the jobs (one of `projectId` or `environmentId` must be set)
     */
    environmentId?: pulumi.Input<number>;
    /**
     * The ID of the project for which we want to retrieve the jobs (one of `projectId` or `environmentId` must be set)
     */
    projectId?: pulumi.Input<number>;
}