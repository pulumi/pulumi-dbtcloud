// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud.Inputs
{

    public sealed class RedshiftSemanticLayerCredentialCredentialArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The internal credential ID
        /// </summary>
        [Input("credentialId")]
        public Input<int>? CredentialId { get; set; }

        /// <summary>
        /// Default schema name
        /// </summary>
        [Input("defaultSchema", required: true)]
        public Input<string> DefaultSchema { get; set; } = null!;

        /// <summary>
        /// The ID of this resource. Contains the project ID and the credential ID.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Whether the Redshift credential is active
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
        /// The password for the Redshift account
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

        /// <summary>
        /// Project ID to create the Redshift credential in
        /// </summary>
        [Input("projectId", required: true)]
        public Input<int> ProjectId { get; set; } = null!;

        /// <summary>
        /// The username for the Redshift account.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public RedshiftSemanticLayerCredentialCredentialArgs()
        {
        }
        public static new RedshiftSemanticLayerCredentialCredentialArgs Empty => new RedshiftSemanticLayerCredentialCredentialArgs();
    }
}
