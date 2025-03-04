// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    public static class GetEnvironment
    {
        /// <summary>
        /// Retrieve data for a single environment
        /// </summary>
        public static Task<GetEnvironmentResult> InvokeAsync(GetEnvironmentArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEnvironmentResult>("dbtcloud:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve data for a single environment
        /// </summary>
        public static Output<GetEnvironmentResult> Invoke(GetEnvironmentInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnvironmentResult>("dbtcloud:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve data for a single environment
        /// </summary>
        public static Output<GetEnvironmentResult> Invoke(GetEnvironmentInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnvironmentResult>("dbtcloud:index/getEnvironment:getEnvironment", args ?? new GetEnvironmentInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnvironmentArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the environment
        /// </summary>
        [Input("environmentId", required: true)]
        public int EnvironmentId { get; set; }

        /// <summary>
        /// The project ID to which the environment belong
        /// </summary>
        [Input("projectId", required: true)]
        public int ProjectId { get; set; }

        public GetEnvironmentArgs()
        {
        }
        public static new GetEnvironmentArgs Empty => new GetEnvironmentArgs();
    }

    public sealed class GetEnvironmentInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the environment
        /// </summary>
        [Input("environmentId", required: true)]
        public Input<int> EnvironmentId { get; set; } = null!;

        /// <summary>
        /// The project ID to which the environment belong
        /// </summary>
        [Input("projectId", required: true)]
        public Input<int> ProjectId { get; set; } = null!;

        public GetEnvironmentInvokeArgs()
        {
        }
        public static new GetEnvironmentInvokeArgs Empty => new GetEnvironmentInvokeArgs();
    }


    [OutputType]
    public sealed class GetEnvironmentResult
    {
        /// <summary>
        /// A connection ID (used with Global Connections)
        /// </summary>
        public readonly int ConnectionId;
        /// <summary>
        /// The project ID to which the environment belong
        /// </summary>
        public readonly int CredentialsId;
        /// <summary>
        /// The custom branch name to use
        /// </summary>
        public readonly string CustomBranch;
        /// <summary>
        /// Version number of dbt to use in this environment.
        /// </summary>
        public readonly string DbtVersion;
        /// <summary>
        /// The type of deployment environment (currently 'production', 'staging' or empty)
        /// </summary>
        public readonly string DeploymentType;
        /// <summary>
        /// Whether model query history is on
        /// </summary>
        public readonly bool EnableModelQueryHistory;
        /// <summary>
        /// The ID of the environment
        /// </summary>
        public readonly int EnvironmentId;
        /// <summary>
        /// The ID of the extended attributes applied
        /// </summary>
        public readonly int ExtendedAttributesId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The name of the environment
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The project ID to which the environment belong
        /// </summary>
        public readonly int ProjectId;
        /// <summary>
        /// The type of environment (must be either development or deployment)
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Whether to use a custom git branch in this environment
        /// </summary>
        public readonly bool UseCustomBranch;

        [OutputConstructor]
        private GetEnvironmentResult(
            int connectionId,

            int credentialsId,

            string customBranch,

            string dbtVersion,

            string deploymentType,

            bool enableModelQueryHistory,

            int environmentId,

            int extendedAttributesId,

            string id,

            string name,

            int projectId,

            string type,

            bool useCustomBranch)
        {
            ConnectionId = connectionId;
            CredentialsId = credentialsId;
            CustomBranch = customBranch;
            DbtVersion = dbtVersion;
            DeploymentType = deploymentType;
            EnableModelQueryHistory = enableModelQueryHistory;
            EnvironmentId = environmentId;
            ExtendedAttributesId = extendedAttributesId;
            Id = id;
            Name = name;
            ProjectId = projectId;
            Type = type;
            UseCustomBranch = useCustomBranch;
        }
    }
}
