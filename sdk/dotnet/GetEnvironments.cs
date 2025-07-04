// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    public static class GetEnvironments
    {
        /// <summary>
        /// Retrieve data for multiple environments
        /// </summary>
        public static Task<GetEnvironmentsResult> InvokeAsync(GetEnvironmentsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEnvironmentsResult>("dbtcloud:index/getEnvironments:getEnvironments", args ?? new GetEnvironmentsArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve data for multiple environments
        /// </summary>
        public static Output<GetEnvironmentsResult> Invoke(GetEnvironmentsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnvironmentsResult>("dbtcloud:index/getEnvironments:getEnvironments", args ?? new GetEnvironmentsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve data for multiple environments
        /// </summary>
        public static Output<GetEnvironmentsResult> Invoke(GetEnvironmentsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnvironmentsResult>("dbtcloud:index/getEnvironments:getEnvironments", args ?? new GetEnvironmentsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnvironmentsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project ID to filter the environments for [Optional]
        /// </summary>
        [Input("projectId")]
        public int? ProjectId { get; set; }

        public GetEnvironmentsArgs()
        {
        }
        public static new GetEnvironmentsArgs Empty => new GetEnvironmentsArgs();
    }

    public sealed class GetEnvironmentsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The project ID to filter the environments for [Optional]
        /// </summary>
        [Input("projectId")]
        public Input<int>? ProjectId { get; set; }

        public GetEnvironmentsInvokeArgs()
        {
        }
        public static new GetEnvironmentsInvokeArgs Empty => new GetEnvironmentsInvokeArgs();
    }


    [OutputType]
    public sealed class GetEnvironmentsResult
    {
        /// <summary>
        /// The list of environments
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnvironmentsEnvironmentResult> Environments;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The project ID to filter the environments for [Optional]
        /// </summary>
        public readonly int? ProjectId;

        [OutputConstructor]
        private GetEnvironmentsResult(
            ImmutableArray<Outputs.GetEnvironmentsEnvironmentResult> environments,

            string id,

            int? projectId)
        {
            Environments = environments;
            Id = id;
            ProjectId = projectId;
        }
    }
}
