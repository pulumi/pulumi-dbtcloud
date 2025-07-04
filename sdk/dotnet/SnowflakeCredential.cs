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
    /// Snowflake credential resource. This resource is used both as a stand-alone credential, but also as part of the Semantic Layer credential definition for Snowflake.
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
    ///     var prodCredential = new DbtCloud.SnowflakeCredential("prod_credential", new()
    ///     {
    ///         ProjectId = dbtProject.Id,
    ///         AuthType = "password",
    ///         NumThreads = 16,
    ///         Schema = "SCHEMA",
    ///         User = "user",
    ///         Password = "password",
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
    ///   to = dbtcloud_snowflake_credential.prod_snowflake_credential
    /// 
    ///   id = "project_id:credential_id"
    /// 
    /// }
    /// 
    /// import {
    /// 
    ///   to = dbtcloud_snowflake_credential.prod_snowflake_credential
    /// 
    ///   id = "12345:6789"
    /// 
    /// }
    /// 
    /// using the older import command
    /// 
    /// ```sh
    /// $ pulumi import dbtcloud:index/snowflakeCredential:SnowflakeCredential prod_snowflake_credential "project_id:credential_id"
    /// ```
    /// 
    /// ```sh
    /// $ pulumi import dbtcloud:index/snowflakeCredential:SnowflakeCredential prod_snowflake_credential 12345:6789
    /// ```
    /// </summary>
    [DbtCloudResourceType("dbtcloud:index/snowflakeCredential:SnowflakeCredential")]
    public partial class SnowflakeCredential : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The type of Snowflake credential ('password' or 'keypair')
        /// </summary>
        [Output("authType")]
        public Output<string> AuthType { get; private set; } = null!;

        /// <summary>
        /// The internal credential ID
        /// </summary>
        [Output("credentialId")]
        public Output<int> CredentialId { get; private set; } = null!;

        /// <summary>
        /// The catalog to connect use
        /// </summary>
        [Output("database")]
        public Output<string?> Database { get; private set; } = null!;

        /// <summary>
        /// Whether the Snowflake credential is active
        /// </summary>
        [Output("isActive")]
        public Output<bool> IsActive { get; private set; } = null!;

        /// <summary>
        /// Number of threads to use
        /// </summary>
        [Output("numThreads")]
        public Output<int> NumThreads { get; private set; } = null!;

        /// <summary>
        /// The password for the Snowflake account
        /// </summary>
        [Output("password")]
        public Output<string> Password { get; private set; } = null!;

        /// <summary>
        /// The private key for the Snowflake account
        /// </summary>
        [Output("privateKey")]
        public Output<string> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// The passphrase for the private key
        /// </summary>
        [Output("privateKeyPassphrase")]
        public Output<string> PrivateKeyPassphrase { get; private set; } = null!;

        /// <summary>
        /// Project ID to create the Snowflake credential in
        /// </summary>
        [Output("projectId")]
        public Output<int> ProjectId { get; private set; } = null!;

        /// <summary>
        /// The role to assume
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// The schema where to create models. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
        /// </summary>
        [Output("schema")]
        public Output<string> Schema { get; private set; } = null!;

        /// <summary>
        /// This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Snowflake credential for the Semantic Layer.
        /// </summary>
        [Output("semanticLayerCredential")]
        public Output<bool> SemanticLayerCredential { get; private set; } = null!;

        /// <summary>
        /// The username for the Snowflake account. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
        /// </summary>
        [Output("user")]
        public Output<string> User { get; private set; } = null!;

        /// <summary>
        /// The warehouse to use
        /// </summary>
        [Output("warehouse")]
        public Output<string?> Warehouse { get; private set; } = null!;


        /// <summary>
        /// Create a SnowflakeCredential resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SnowflakeCredential(string name, SnowflakeCredentialArgs args, CustomResourceOptions? options = null)
            : base("dbtcloud:index/snowflakeCredential:SnowflakeCredential", name, args ?? new SnowflakeCredentialArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SnowflakeCredential(string name, Input<string> id, SnowflakeCredentialState? state = null, CustomResourceOptions? options = null)
            : base("dbtcloud:index/snowflakeCredential:SnowflakeCredential", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/pulumi/pulumi-dbtcloud",
                AdditionalSecretOutputs =
                {
                    "password",
                    "privateKey",
                    "privateKeyPassphrase",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SnowflakeCredential resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SnowflakeCredential Get(string name, Input<string> id, SnowflakeCredentialState? state = null, CustomResourceOptions? options = null)
        {
            return new SnowflakeCredential(name, id, state, options);
        }
    }

    public sealed class SnowflakeCredentialArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of Snowflake credential ('password' or 'keypair')
        /// </summary>
        [Input("authType", required: true)]
        public Input<string> AuthType { get; set; } = null!;

        /// <summary>
        /// The catalog to connect use
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Whether the Snowflake credential is active
        /// </summary>
        [Input("isActive")]
        public Input<bool>? IsActive { get; set; }

        /// <summary>
        /// Number of threads to use
        /// </summary>
        [Input("numThreads", required: true)]
        public Input<int> NumThreads { get; set; } = null!;

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password for the Snowflake account
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The private key for the Snowflake account
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKeyPassphrase")]
        private Input<string>? _privateKeyPassphrase;

        /// <summary>
        /// The passphrase for the private key
        /// </summary>
        public Input<string>? PrivateKeyPassphrase
        {
            get => _privateKeyPassphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyPassphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Project ID to create the Snowflake credential in
        /// </summary>
        [Input("projectId", required: true)]
        public Input<int> ProjectId { get; set; } = null!;

        /// <summary>
        /// The role to assume
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The schema where to create models. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Snowflake credential for the Semantic Layer.
        /// </summary>
        [Input("semanticLayerCredential")]
        public Input<bool>? SemanticLayerCredential { get; set; }

        /// <summary>
        /// The username for the Snowflake account. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        /// <summary>
        /// The warehouse to use
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public SnowflakeCredentialArgs()
        {
        }
        public static new SnowflakeCredentialArgs Empty => new SnowflakeCredentialArgs();
    }

    public sealed class SnowflakeCredentialState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The type of Snowflake credential ('password' or 'keypair')
        /// </summary>
        [Input("authType")]
        public Input<string>? AuthType { get; set; }

        /// <summary>
        /// The internal credential ID
        /// </summary>
        [Input("credentialId")]
        public Input<int>? CredentialId { get; set; }

        /// <summary>
        /// The catalog to connect use
        /// </summary>
        [Input("database")]
        public Input<string>? Database { get; set; }

        /// <summary>
        /// Whether the Snowflake credential is active
        /// </summary>
        [Input("isActive")]
        public Input<bool>? IsActive { get; set; }

        /// <summary>
        /// Number of threads to use
        /// </summary>
        [Input("numThreads")]
        public Input<int>? NumThreads { get; set; }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password for the Snowflake account
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The private key for the Snowflake account
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("privateKeyPassphrase")]
        private Input<string>? _privateKeyPassphrase;

        /// <summary>
        /// The passphrase for the private key
        /// </summary>
        public Input<string>? PrivateKeyPassphrase
        {
            get => _privateKeyPassphrase;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKeyPassphrase = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Project ID to create the Snowflake credential in
        /// </summary>
        [Input("projectId")]
        public Input<int>? ProjectId { get; set; }

        /// <summary>
        /// The role to assume
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The schema where to create models. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
        /// </summary>
        [Input("schema")]
        public Input<string>? Schema { get; set; }

        /// <summary>
        /// This field indicates that the credential is used as part of the Semantic Layer configuration. It is used to create a Snowflake credential for the Semantic Layer.
        /// </summary>
        [Input("semanticLayerCredential")]
        public Input<bool>? SemanticLayerCredential { get; set; }

        /// <summary>
        /// The username for the Snowflake account. This is an optional field ONLY if the credential is used for Semantic Layer configuration, otherwise it is required.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        /// <summary>
        /// The warehouse to use
        /// </summary>
        [Input("warehouse")]
        public Input<string>? Warehouse { get; set; }

        public SnowflakeCredentialState()
        {
        }
        public static new SnowflakeCredentialState Empty => new SnowflakeCredentialState();
    }
}
