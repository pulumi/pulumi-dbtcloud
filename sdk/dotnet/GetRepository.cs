// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    public static class GetRepository
    {
        /// <summary>
        /// Retrieve data for a single repository
        /// </summary>
        public static Task<GetRepositoryResult> InvokeAsync(GetRepositoryArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetRepositoryResult>("dbtcloud:index/getRepository:getRepository", args ?? new GetRepositoryArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve data for a single repository
        /// </summary>
        public static Output<GetRepositoryResult> Invoke(GetRepositoryInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetRepositoryResult>("dbtcloud:index/getRepository:getRepository", args ?? new GetRepositoryInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Retrieve data for a single repository
        /// </summary>
        public static Output<GetRepositoryResult> Invoke(GetRepositoryInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetRepositoryResult>("dbtcloud:index/getRepository:getRepository", args ?? new GetRepositoryInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRepositoryArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether we should return the public deploy key
        /// </summary>
        [Input("fetchDeployKey")]
        public bool? FetchDeployKey { get; set; }

        /// <summary>
        /// Project ID to create the repository in
        /// </summary>
        [Input("projectId", required: true)]
        public int ProjectId { get; set; }

        /// <summary>
        /// ID for the repository
        /// </summary>
        [Input("repositoryId", required: true)]
        public int RepositoryId { get; set; }

        public GetRepositoryArgs()
        {
        }
        public static new GetRepositoryArgs Empty => new GetRepositoryArgs();
    }

    public sealed class GetRepositoryInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether we should return the public deploy key
        /// </summary>
        [Input("fetchDeployKey")]
        public Input<bool>? FetchDeployKey { get; set; }

        /// <summary>
        /// Project ID to create the repository in
        /// </summary>
        [Input("projectId", required: true)]
        public Input<int> ProjectId { get; set; } = null!;

        /// <summary>
        /// ID for the repository
        /// </summary>
        [Input("repositoryId", required: true)]
        public Input<int> RepositoryId { get; set; } = null!;

        public GetRepositoryInvokeArgs()
        {
        }
        public static new GetRepositoryInvokeArgs Empty => new GetRepositoryInvokeArgs();
    }


    [OutputType]
    public sealed class GetRepositoryResult
    {
        /// <summary>
        /// The Azure Dev Ops project ID
        /// </summary>
        public readonly string AzureActiveDirectoryProjectId;
        /// <summary>
        /// The Azure Dev Ops repository ID
        /// </summary>
        public readonly string AzureActiveDirectoryRepositoryId;
        /// <summary>
        /// If set to False (the default), the connection will fail if the service user doesn't have access to set webhooks
        /// </summary>
        public readonly bool AzureBypassWebhookRegistrationFailure;
        /// <summary>
        /// Public key generated by dbt when using `deploy_key` clone strategy
        /// </summary>
        public readonly string DeployKey;
        /// <summary>
        /// Whether we should return the public deploy key
        /// </summary>
        public readonly bool FetchDeployKey;
        /// <summary>
        /// Git clone strategy for the repository
        /// </summary>
        public readonly string GitCloneStrategy;
        /// <summary>
        /// Identifier for the GitHub installation
        /// </summary>
        public readonly int GithubInstallationId;
        /// <summary>
        /// Identifier for the Gitlab project
        /// </summary>
        public readonly int GitlabProjectId;
        /// <summary>
        /// The ID of this resource
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether the repository is active
        /// </summary>
        public readonly bool IsActive;
        /// <summary>
        /// Identifier for the PrivateLink endpoint.
        /// </summary>
        public readonly string PrivateLinkEndpointId;
        /// <summary>
        /// Project ID to create the repository in
        /// </summary>
        public readonly int ProjectId;
        /// <summary>
        /// The pull request URL template to be used when opening a pull request from within dbt Cloud's IDE
        /// </summary>
        public readonly string PullRequestUrlTemplate;
        /// <summary>
        /// Git URL for the repository or &lt;Group&gt;/&lt;Project&gt; for Gitlab
        /// </summary>
        public readonly string RemoteUrl;
        /// <summary>
        /// Credentials ID for the repository (From the repository side not the dbt Cloud ID)
        /// </summary>
        public readonly int RepositoryCredentialsId;
        /// <summary>
        /// ID for the repository
        /// </summary>
        public readonly int RepositoryId;

        [OutputConstructor]
        private GetRepositoryResult(
            string azureActiveDirectoryProjectId,

            string azureActiveDirectoryRepositoryId,

            bool azureBypassWebhookRegistrationFailure,

            string deployKey,

            bool fetchDeployKey,

            string gitCloneStrategy,

            int githubInstallationId,

            int gitlabProjectId,

            string id,

            bool isActive,

            string privateLinkEndpointId,

            int projectId,

            string pullRequestUrlTemplate,

            string remoteUrl,

            int repositoryCredentialsId,

            int repositoryId)
        {
            AzureActiveDirectoryProjectId = azureActiveDirectoryProjectId;
            AzureActiveDirectoryRepositoryId = azureActiveDirectoryRepositoryId;
            AzureBypassWebhookRegistrationFailure = azureBypassWebhookRegistrationFailure;
            DeployKey = deployKey;
            FetchDeployKey = fetchDeployKey;
            GitCloneStrategy = gitCloneStrategy;
            GithubInstallationId = githubInstallationId;
            GitlabProjectId = gitlabProjectId;
            Id = id;
            IsActive = isActive;
            PrivateLinkEndpointId = privateLinkEndpointId;
            ProjectId = projectId;
            PullRequestUrlTemplate = pullRequestUrlTemplate;
            RemoteUrl = remoteUrl;
            RepositoryCredentialsId = repositoryCredentialsId;
            RepositoryId = repositoryId;
        }
    }
}
