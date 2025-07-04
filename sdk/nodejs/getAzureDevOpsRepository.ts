// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve the ID and details of an Azure Dev Ops repository
 * based on its name and the ID of the Azure Dev Ops project it belongs to.
 *
 * This data source requires connecting with a user token and doesn't work with a service token.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dbtcloud from "@pulumi/dbtcloud";
 *
 * const myAdoRepository = dbtcloud.getAzureDevOpsRepository({
 *     name: "my-repo-name",
 *     azureDevOpsProjectId: myAdoProject.id,
 * });
 * ```
 */
export function getAzureDevOpsRepository(args: GetAzureDevOpsRepositoryArgs, opts?: pulumi.InvokeOptions): Promise<GetAzureDevOpsRepositoryResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("dbtcloud:index/getAzureDevOpsRepository:getAzureDevOpsRepository", {
        "azureDevOpsProjectId": args.azureDevOpsProjectId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAzureDevOpsRepository.
 */
export interface GetAzureDevOpsRepositoryArgs {
    /**
     * The internal Azure Dev Ops ID of the ADO Project. Can be retrieved using the data source dbtcloud*azure*dev*ops*project and the project name
     */
    azureDevOpsProjectId: string;
    /**
     * The name of the ADO repository
     */
    name: string;
}

/**
 * A collection of values returned by getAzureDevOpsRepository.
 */
export interface GetAzureDevOpsRepositoryResult {
    /**
     * The internal Azure Dev Ops ID of the ADO Project. Can be retrieved using the data source dbtcloud*azure*dev*ops*project and the project name
     */
    readonly azureDevOpsProjectId: string;
    /**
     * The default branch of the ADO repository
     */
    readonly defaultBranch: string;
    /**
     * The URL of the ADO repository showing details about the repository and its attributes
     */
    readonly detailsUrl: string;
    /**
     * The internal Azure Dev Ops ID of the ADO Repository
     */
    readonly id: string;
    /**
     * The name of the ADO repository
     */
    readonly name: string;
    /**
     * The HTTP URL of the ADO repository used to connect to dbt Cloud
     */
    readonly remoteUrl: string;
    /**
     * The URL of the ADO repository accessible in the browser
     */
    readonly webUrl: string;
}
/**
 * Use this data source to retrieve the ID and details of an Azure Dev Ops repository
 * based on its name and the ID of the Azure Dev Ops project it belongs to.
 *
 * This data source requires connecting with a user token and doesn't work with a service token.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dbtcloud from "@pulumi/dbtcloud";
 *
 * const myAdoRepository = dbtcloud.getAzureDevOpsRepository({
 *     name: "my-repo-name",
 *     azureDevOpsProjectId: myAdoProject.id,
 * });
 * ```
 */
export function getAzureDevOpsRepositoryOutput(args: GetAzureDevOpsRepositoryOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetAzureDevOpsRepositoryResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("dbtcloud:index/getAzureDevOpsRepository:getAzureDevOpsRepository", {
        "azureDevOpsProjectId": args.azureDevOpsProjectId,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAzureDevOpsRepository.
 */
export interface GetAzureDevOpsRepositoryOutputArgs {
    /**
     * The internal Azure Dev Ops ID of the ADO Project. Can be retrieved using the data source dbtcloud*azure*dev*ops*project and the project name
     */
    azureDevOpsProjectId: pulumi.Input<string>;
    /**
     * The name of the ADO repository
     */
    name: pulumi.Input<string>;
}
