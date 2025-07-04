// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    public static class GetUserGroups
    {
        /// <summary>
        /// Gets information about a specific dbt Cloud user's groups.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DbtCloud = Pulumi.DbtCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myUserGroups = DbtCloud.GetUserGroups.Invoke(new()
        ///     {
        ///         UserId = 12345,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetUserGroupsResult> InvokeAsync(GetUserGroupsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUserGroupsResult>("dbtcloud:index/getUserGroups:getUserGroups", args ?? new GetUserGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a specific dbt Cloud user's groups.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DbtCloud = Pulumi.DbtCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myUserGroups = DbtCloud.GetUserGroups.Invoke(new()
        ///     {
        ///         UserId = 12345,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetUserGroupsResult> Invoke(GetUserGroupsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserGroupsResult>("dbtcloud:index/getUserGroups:getUserGroups", args ?? new GetUserGroupsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Gets information about a specific dbt Cloud user's groups.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using DbtCloud = Pulumi.DbtCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var myUserGroups = DbtCloud.GetUserGroups.Invoke(new()
        ///     {
        ///         UserId = 12345,
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetUserGroupsResult> Invoke(GetUserGroupsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetUserGroupsResult>("dbtcloud:index/getUserGroups:getUserGroups", args ?? new GetUserGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserGroupsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The internal ID of a dbt Cloud user.
        /// </summary>
        [Input("userId", required: true)]
        public int UserId { get; set; }

        public GetUserGroupsArgs()
        {
        }
        public static new GetUserGroupsArgs Empty => new GetUserGroupsArgs();
    }

    public sealed class GetUserGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The internal ID of a dbt Cloud user.
        /// </summary>
        [Input("userId", required: true)]
        public Input<int> UserId { get; set; } = null!;

        public GetUserGroupsInvokeArgs()
        {
        }
        public static new GetUserGroupsInvokeArgs Empty => new GetUserGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserGroupsResult
    {
        /// <summary>
        /// IDs of the groups assigned to the user.
        /// </summary>
        public readonly ImmutableArray<int> GroupIds;
        /// <summary>
        /// The ID of this resource. It is the same as the user_id.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The internal ID of a dbt Cloud user.
        /// </summary>
        public readonly int UserId;

        [OutputConstructor]
        private GetUserGroupsResult(
            ImmutableArray<int> groupIds,

            string id,

            int userId)
        {
            GroupIds = groupIds;
            Id = id;
            UserId = userId;
        }
    }
}
