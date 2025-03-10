// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    public static class GetSnowflakeCredential
    {
        public static Task<GetSnowflakeCredentialResult> InvokeAsync(GetSnowflakeCredentialArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSnowflakeCredentialResult>("dbtcloud:index/getSnowflakeCredential:getSnowflakeCredential", args ?? new GetSnowflakeCredentialArgs(), options.WithDefaults());

        public static Output<GetSnowflakeCredentialResult> Invoke(GetSnowflakeCredentialInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnowflakeCredentialResult>("dbtcloud:index/getSnowflakeCredential:getSnowflakeCredential", args ?? new GetSnowflakeCredentialInvokeArgs(), options.WithDefaults());

        public static Output<GetSnowflakeCredentialResult> Invoke(GetSnowflakeCredentialInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnowflakeCredentialResult>("dbtcloud:index/getSnowflakeCredential:getSnowflakeCredential", args ?? new GetSnowflakeCredentialInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSnowflakeCredentialArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Credential ID
        /// </summary>
        [Input("credentialId", required: true)]
        public int CredentialId { get; set; }

        /// <summary>
        /// Project ID
        /// </summary>
        [Input("projectId", required: true)]
        public int ProjectId { get; set; }

        public GetSnowflakeCredentialArgs()
        {
        }
        public static new GetSnowflakeCredentialArgs Empty => new GetSnowflakeCredentialArgs();
    }

    public sealed class GetSnowflakeCredentialInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Credential ID
        /// </summary>
        [Input("credentialId", required: true)]
        public Input<int> CredentialId { get; set; } = null!;

        /// <summary>
        /// Project ID
        /// </summary>
        [Input("projectId", required: true)]
        public Input<int> ProjectId { get; set; } = null!;

        public GetSnowflakeCredentialInvokeArgs()
        {
        }
        public static new GetSnowflakeCredentialInvokeArgs Empty => new GetSnowflakeCredentialInvokeArgs();
    }


    [OutputType]
    public sealed class GetSnowflakeCredentialResult
    {
        /// <summary>
        /// The type of Snowflake credential ('password' or 'keypair')
        /// </summary>
        public readonly string AuthType;
        /// <summary>
        /// Credential ID
        /// </summary>
        public readonly int CredentialId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether the Snowflake credential is active
        /// </summary>
        public readonly bool IsActive;
        /// <summary>
        /// Number of threads to use
        /// </summary>
        public readonly int NumThreads;
        /// <summary>
        /// Project ID
        /// </summary>
        public readonly int ProjectId;
        /// <summary>
        /// Default schema name
        /// </summary>
        public readonly string Schema;
        /// <summary>
        /// Username for Snowflake
        /// </summary>
        public readonly string User;

        [OutputConstructor]
        private GetSnowflakeCredentialResult(
            string authType,

            int credentialId,

            string id,

            bool isActive,

            int numThreads,

            int projectId,

            string schema,

            string user)
        {
            AuthType = authType;
            CredentialId = credentialId;
            Id = id;
            IsActive = isActive;
            NumThreads = numThreads;
            ProjectId = projectId;
            Schema = schema;
            User = user;
        }
    }
}
