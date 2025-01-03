// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    public static class GetConnection
    {
        public static Task<GetConnectionResult> InvokeAsync(GetConnectionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetConnectionResult>("dbtcloud:index/getConnection:getConnection", args ?? new GetConnectionArgs(), options.WithDefaults());

        public static Output<GetConnectionResult> Invoke(GetConnectionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionResult>("dbtcloud:index/getConnection:getConnection", args ?? new GetConnectionInvokeArgs(), options.WithDefaults());

        public static Output<GetConnectionResult> Invoke(GetConnectionInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetConnectionResult>("dbtcloud:index/getConnection:getConnection", args ?? new GetConnectionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetConnectionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID for the connection
        /// </summary>
        [Input("connectionId", required: true)]
        public int ConnectionId { get; set; }

        /// <summary>
        /// Project ID to create the connection in
        /// </summary>
        [Input("projectId", required: true)]
        public int ProjectId { get; set; }

        public GetConnectionArgs()
        {
        }
        public static new GetConnectionArgs Empty => new GetConnectionArgs();
    }

    public sealed class GetConnectionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// ID for the connection
        /// </summary>
        [Input("connectionId", required: true)]
        public Input<int> ConnectionId { get; set; } = null!;

        /// <summary>
        /// Project ID to create the connection in
        /// </summary>
        [Input("projectId", required: true)]
        public Input<int> ProjectId { get; set; } = null!;

        public GetConnectionInvokeArgs()
        {
        }
        public static new GetConnectionInvokeArgs Empty => new GetConnectionInvokeArgs();
    }


    [OutputType]
    public sealed class GetConnectionResult
    {
        /// <summary>
        /// Account for the connection
        /// </summary>
        public readonly string Account;
        /// <summary>
        /// Flag for whether or not to use the keep session alive parameter in the connection
        /// </summary>
        public readonly bool AllowKeepAlive;
        /// <summary>
        /// Flag for whether or not to use SSO for the connection
        /// </summary>
        public readonly bool AllowSso;
        /// <summary>
        /// ID for the connection
        /// </summary>
        public readonly int ConnectionId;
        /// <summary>
        /// Database name for the connection
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether the connection is active
        /// </summary>
        public readonly bool IsActive;
        /// <summary>
        /// Connection name
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID of the PrivateLink connection
        /// </summary>
        public readonly string PrivateLinkEndpointId;
        /// <summary>
        /// Project ID to create the connection in
        /// </summary>
        public readonly int ProjectId;
        /// <summary>
        /// Role name for the connection
        /// </summary>
        public readonly string Role;
        /// <summary>
        /// Connection type
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Warehouse name for the connection
        /// </summary>
        public readonly string Warehouse;

        [OutputConstructor]
        private GetConnectionResult(
            string account,

            bool allowKeepAlive,

            bool allowSso,

            int connectionId,

            string database,

            string id,

            bool isActive,

            string name,

            string privateLinkEndpointId,

            int projectId,

            string role,

            string type,

            string warehouse)
        {
            Account = account;
            AllowKeepAlive = allowKeepAlive;
            AllowSso = allowSso;
            ConnectionId = connectionId;
            Database = database;
            Id = id;
            IsActive = isActive;
            Name = name;
            PrivateLinkEndpointId = privateLinkEndpointId;
            ProjectId = projectId;
            Role = role;
            Type = type;
            Warehouse = warehouse;
        }
    }
}
