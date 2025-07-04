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
    /// Extended attributes resource
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using DbtCloud = Pulumi.DbtCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     // extended_attributes can be set as a raw JSON string or encoded with Terraform's `jsonencode()` function
    ///     // we recommend using `jsonencode()` to avoid Terraform reporting changes due to whitespaces or keys ordering
    ///     var myAttributes = new DbtCloud.ExtendedAttributesDetails("my_attributes", new()
    ///     {
    ///         ExtendedAttributes = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["type"] = "databricks",
    ///             ["catalog"] = "dbt_catalog",
    ///             ["http_path"] = "/sql/your/http/path",
    ///             ["my_nested_field"] = new Dictionary&lt;string, object?&gt;
    ///             {
    ///                 ["subfield"] = "my_value",
    ///             },
    ///         }),
    ///         ProjectId = dbtProject.Id,
    ///     });
    /// 
    ///     var issueDepl = new DbtCloud.Environment("issue_depl", new()
    ///     {
    ///         DbtVersion = "latest",
    ///         Name = "My environment",
    ///         ProjectId = dbtProject.Id,
    ///         Type = "deployment",
    ///         UseCustomBranch = false,
    ///         CredentialId = dbtCredentialId,
    ///         DeploymentType = "production",
    ///         ExtendedAttributesId = myAttributes.ExtendedAttributesId,
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
    ///   to = dbtcloud_extended_attributes.test_extended_attributes
    /// 
    ///   id = "project_id_id:extended_attributes_id"
    /// 
    /// }
    /// 
    /// import {
    /// 
    ///   to = dbtcloud_extended_attributes.test_extended_attributes
    /// 
    ///   id = "12345:6789"
    /// 
    /// }
    /// 
    /// using the older import command
    /// 
    /// ```sh
    /// $ pulumi import dbtcloud:index/extendedAttributes:ExtendedAttributes test_extended_attributes "project_id_id:extended_attributes_id"
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import dbtcloud:index/extendedAttributes:ExtendedAttributes test_extended_attributes 12345:6789
    /// ```
    /// </summary>
    [DbtCloudResourceType("dbtcloud:index/extendedAttributes:ExtendedAttributes")]
    public partial class ExtendedAttributesDetails : global::Pulumi.CustomResource
    {
        [Output("extendedAttributes")]
        public Output<string> ExtendedAttributes { get; private set; } = null!;

        /// <summary>
        /// Extended attributes ID
        /// </summary>
        [Output("extendedAttributesId")]
        public Output<int> ExtendedAttributesId { get; private set; } = null!;

        /// <summary>
        /// Project ID to create the extended attributes in
        /// </summary>
        [Output("projectId")]
        public Output<int> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The state of the extended attributes (1 = active, 2 = inactive)
        /// </summary>
        [Output("state")]
        public Output<int> State { get; private set; } = null!;


        /// <summary>
        /// Create a ExtendedAttributesDetails resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ExtendedAttributesDetails(string name, ExtendedAttributesDetailsArgs args, CustomResourceOptions? options = null)
            : base("dbtcloud:index/extendedAttributes:ExtendedAttributes", name, args ?? new ExtendedAttributesDetailsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ExtendedAttributesDetails(string name, Input<string> id, ExtendedAttributesDetailsState? state = null, CustomResourceOptions? options = null)
            : base("dbtcloud:index/extendedAttributes:ExtendedAttributes", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ExtendedAttributesDetails resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ExtendedAttributesDetails Get(string name, Input<string> id, ExtendedAttributesDetailsState? state = null, CustomResourceOptions? options = null)
        {
            return new ExtendedAttributesDetails(name, id, state, options);
        }
    }

    public sealed class ExtendedAttributesDetailsArgs : global::Pulumi.ResourceArgs
    {
        [Input("extendedAttributes", required: true)]
        public Input<string> ExtendedAttributes { get; set; } = null!;

        /// <summary>
        /// Project ID to create the extended attributes in
        /// </summary>
        [Input("projectId", required: true)]
        public Input<int> ProjectId { get; set; } = null!;

        /// <summary>
        /// The state of the extended attributes (1 = active, 2 = inactive)
        /// </summary>
        [Input("state")]
        public Input<int>? State { get; set; }

        public ExtendedAttributesDetailsArgs()
        {
        }
        public static new ExtendedAttributesDetailsArgs Empty => new ExtendedAttributesDetailsArgs();
    }

    public sealed class ExtendedAttributesDetailsState : global::Pulumi.ResourceArgs
    {
        [Input("extendedAttributes")]
        public Input<string>? ExtendedAttributes { get; set; }

        /// <summary>
        /// Extended attributes ID
        /// </summary>
        [Input("extendedAttributesId")]
        public Input<int>? ExtendedAttributesId { get; set; }

        /// <summary>
        /// Project ID to create the extended attributes in
        /// </summary>
        [Input("projectId")]
        public Input<int>? ProjectId { get; set; }

        /// <summary>
        /// The state of the extended attributes (1 = active, 2 = inactive)
        /// </summary>
        [Input("state")]
        public Input<int>? State { get; set; }

        public ExtendedAttributesDetailsState()
        {
        }
        public static new ExtendedAttributesDetailsState Empty => new ExtendedAttributesDetailsState();
    }
}
