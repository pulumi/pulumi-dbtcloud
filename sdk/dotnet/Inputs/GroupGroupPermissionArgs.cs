// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud.Inputs
{

    public sealed class GroupGroupPermissionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether access should be provided for all projects or not.
        /// </summary>
        [Input("allProjects", required: true)]
        public Input<bool> AllProjects { get; set; } = null!;

        /// <summary>
        /// Set of permissions to apply. The permissions allowed are the same as the ones for the `dbtcloud.Group` resource.
        /// </summary>
        [Input("permissionSet", required: true)]
        public Input<string> PermissionSet { get; set; } = null!;

        /// <summary>
        /// Project ID to apply this permission to for this group.
        /// </summary>
        [Input("projectId")]
        public Input<int>? ProjectId { get; set; }

        [Input("writableEnvironmentCategories")]
        private InputList<string>? _writableEnvironmentCategories;

        /// <summary>
        /// What types of environments to apply Write permissions to.
        /// Even if Write access is restricted to some environment types, the permission set will have Read access to all environments.
        /// The values allowed are `all`, `development`, `staging`, `production` and `other`.
        /// Not setting a value is the same as selecting `all`.
        /// Not all permission sets support environment level write settings, only `analyst`, `database_admin`, `developer`, `git_admin` and `team_admin`.
        /// </summary>
        public InputList<string> WritableEnvironmentCategories
        {
            get => _writableEnvironmentCategories ?? (_writableEnvironmentCategories = new InputList<string>());
            set => _writableEnvironmentCategories = value;
        }

        public GroupGroupPermissionArgs()
        {
        }
        public static new GroupGroupPermissionArgs Empty => new GroupGroupPermissionArgs();
    }
}