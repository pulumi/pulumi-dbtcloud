// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud.Inputs
{

    public sealed class GlobalConnectionStarburstGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The hostname of the account to connect to.
        /// </summary>
        [Input("host", required: true)]
        public Input<string> Host { get; set; } = null!;

        /// <summary>
        /// The authentication method. Only LDAP for now.
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// The port to connect to for this connection. Default=443
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        public GlobalConnectionStarburstGetArgs()
        {
        }
        public static new GlobalConnectionStarburstGetArgs Empty => new GlobalConnectionStarburstGetArgs();
    }
}
