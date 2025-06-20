// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    /// <summary>
    /// Manages a dbt Cloud project.
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
    ///     var dbtProject = new DbtCloud.Project("dbt_project", new()
    ///     {
    ///         Name = "Analytics",
    ///     });
    /// 
    ///     var dbtProjectWithDescription = new DbtCloud.Project("dbt_project_with_description", new()
    ///     {
    ///         Name = "Analytics with description",
    ///         Description = "My awesome analytics project",
    ///     });
    /// 
    ///     var dbtProjectWithSubdir = new DbtCloud.Project("dbt_project_with_subdir", new()
    ///     {
    ///         Name = "Analytics in Subdir",
    ///         DbtProjectSubdirectory = "path",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// using  import blocks (requires Terraform &gt;= 1.5)
    /// 
    /// import {
    /// 
    ///   to = dbtcloud_project.my_project
    /// 
    ///   id = "project_id"
    /// 
    /// }
    /// 
    /// import {
    /// 
    ///   to = dbtcloud_project.my_project
    /// 
    ///   id = "12345"
    /// 
    /// }
    /// 
    /// using the older import command
    /// 
    /// ```sh
    /// $ pulumi import dbtcloud:index/project:Project my_project "project_id"
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import dbtcloud:index/project:Project my_project 12345
    /// ```
    /// </summary>
    [DbtCloudResourceType("dbtcloud:index/project:Project")]
    public partial class Project : global::Pulumi.CustomResource
    {
        /// <summary>
        /// DBT project subdirectory
        /// </summary>
        [Output("dbtProjectSubdirectory")]
        public Output<string> DbtProjectSubdirectory { get; private set; } = null!;

        /// <summary>
        /// Description for the project. Will show in dbt Explorer.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Project name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The type of dbt project (0=default or 1=hybrid)
        /// </summary>
        [Output("type")]
        public Output<int> Type { get; private set; } = null!;


        /// <summary>
        /// Create a Project resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Project(string name, ProjectArgs? args = null, CustomResourceOptions? options = null)
            : base("dbtcloud:index/project:Project", name, args ?? new ProjectArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Project(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
            : base("dbtcloud:index/project:Project", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-dbtcloud",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Project resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Project Get(string name, Input<string> id, ProjectState? state = null, CustomResourceOptions? options = null)
        {
            return new Project(name, id, state, options);
        }
    }

    public sealed class ProjectArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DBT project subdirectory
        /// </summary>
        [Input("dbtProjectSubdirectory")]
        public Input<string>? DbtProjectSubdirectory { get; set; }

        /// <summary>
        /// Description for the project. Will show in dbt Explorer.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Project name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of dbt project (0=default or 1=hybrid)
        /// </summary>
        [Input("type")]
        public Input<int>? Type { get; set; }

        public ProjectArgs()
        {
        }
        public static new ProjectArgs Empty => new ProjectArgs();
    }

    public sealed class ProjectState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// DBT project subdirectory
        /// </summary>
        [Input("dbtProjectSubdirectory")]
        public Input<string>? DbtProjectSubdirectory { get; set; }

        /// <summary>
        /// Description for the project. Will show in dbt Explorer.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Project name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The type of dbt project (0=default or 1=hybrid)
        /// </summary>
        [Input("type")]
        public Input<int>? Type { get; set; }

        public ProjectState()
        {
        }
        public static new ProjectState Empty => new ProjectState();
    }
}
