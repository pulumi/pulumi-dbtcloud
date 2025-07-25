// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud.Inputs
{

    public sealed class RedshiftSemanticLayerCredentialConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The adapter version
        /// </summary>
        [Input("adapterVersion", required: true)]
        public Input<string> AdapterVersion { get; set; } = null!;

        /// <summary>
        /// The name of the configuration
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project
        /// </summary>
        [Input("projectId", required: true)]
        public Input<int> ProjectId { get; set; } = null!;

        public RedshiftSemanticLayerCredentialConfigurationGetArgs()
        {
        }
        public static new RedshiftSemanticLayerCredentialConfigurationGetArgs Empty => new RedshiftSemanticLayerCredentialConfigurationGetArgs();
    }
}
