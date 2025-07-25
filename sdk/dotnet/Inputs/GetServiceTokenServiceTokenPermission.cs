// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud.Inputs
{

    public sealed class GetServiceTokenServiceTokenPermissionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Whether or not to apply this permission to all projects for this service token
        /// </summary>
        [Input("allProjects", required: true)]
        public bool AllProjects { get; set; }

        /// <summary>
        /// Set of permissions to apply
        /// </summary>
        [Input("permissionSet", required: true)]
        public string PermissionSet { get; set; } = null!;

        /// <summary>
        /// Project ID to apply this permission to for this service token
        /// </summary>
        [Input("projectId", required: true)]
        public int ProjectId { get; set; }

        [Input("writableEnvironmentCategories", required: true)]
        private List<string>? _writableEnvironmentCategories;

        /// <summary>
        /// What types of environments to apply Write permissions to.
        /// Even if Write access is restricted to some environment types, the permission set will have Read access to all environments.
        /// The values allowed are `all`, `development`, `staging`, `production` and `other`.
        /// Not setting a value is the same as selecting `all`.
        /// Not all permission sets support environment level write settings, only `analyst`, `database_admin`, `developer`, `git_admin` and `team_admin`.
        /// </summary>
        public List<string> WritableEnvironmentCategories
        {
            get => _writableEnvironmentCategories ?? (_writableEnvironmentCategories = new List<string>());
            set => _writableEnvironmentCategories = value;
        }

        public GetServiceTokenServiceTokenPermissionArgs()
        {
        }
        public static new GetServiceTokenServiceTokenPermissionArgs Empty => new GetServiceTokenServiceTokenPermissionArgs();
    }
}
