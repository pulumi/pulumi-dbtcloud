// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    public static class GetPrivatelinkEndpoint
    {
        /// <summary>
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
        ///     var testWithName = DbtCloud.GetPrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         Name = "My Endpoint Name",
        ///     });
        /// 
        ///     var testWithUrl = DbtCloud.GetPrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         PrivateLinkEndpointUrl = "abc.privatelink.def.com",
        ///     });
        /// 
        ///     // in case multiple endpoints have the same name or URL
        ///     var testWithNameAndUrl = DbtCloud.GetPrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         Name = "My Endpoint Name",
        ///         PrivateLinkEndpointUrl = "abc.privatelink.def.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetPrivatelinkEndpointResult> InvokeAsync(GetPrivatelinkEndpointArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivatelinkEndpointResult>("dbtcloud:index/getPrivatelinkEndpoint:getPrivatelinkEndpoint", args ?? new GetPrivatelinkEndpointArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var testWithName = DbtCloud.GetPrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         Name = "My Endpoint Name",
        ///     });
        /// 
        ///     var testWithUrl = DbtCloud.GetPrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         PrivateLinkEndpointUrl = "abc.privatelink.def.com",
        ///     });
        /// 
        ///     // in case multiple endpoints have the same name or URL
        ///     var testWithNameAndUrl = DbtCloud.GetPrivatelinkEndpoint.Invoke(new()
        ///     {
        ///         Name = "My Endpoint Name",
        ///         PrivateLinkEndpointUrl = "abc.privatelink.def.com",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetPrivatelinkEndpointResult> Invoke(GetPrivatelinkEndpointInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivatelinkEndpointResult>("dbtcloud:index/getPrivatelinkEndpoint:getPrivatelinkEndpoint", args ?? new GetPrivatelinkEndpointInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivatelinkEndpointArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
        /// </summary>
        [Input("privateLinkEndpointUrl")]
        public string? PrivateLinkEndpointUrl { get; set; }

        public GetPrivatelinkEndpointArgs()
        {
        }
        public static new GetPrivatelinkEndpointArgs Empty => new GetPrivatelinkEndpointArgs();
    }

    public sealed class GetPrivatelinkEndpointInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
        /// </summary>
        [Input("privateLinkEndpointUrl")]
        public Input<string>? PrivateLinkEndpointUrl { get; set; }

        public GetPrivatelinkEndpointInvokeArgs()
        {
        }
        public static new GetPrivatelinkEndpointInvokeArgs Empty => new GetPrivatelinkEndpointInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivatelinkEndpointResult
    {
        /// <summary>
        /// The CIDR range of the PrivateLink Endpoint
        /// </summary>
        public readonly string CidrRange;
        /// <summary>
        /// The internal ID of the PrivateLink Endpoint
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Given descriptive name for the PrivateLink Endpoint (name and/or private*link*endpoint_url need to be provided to return data for the datasource)
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The URL of the PrivateLink Endpoint (private*link*endpoint_url and/or name need to be provided to return data for the datasource)
        /// </summary>
        public readonly string? PrivateLinkEndpointUrl;
        /// <summary>
        /// PrivatelinkEndpoint state should be 1 = active, as 2 = deleted
        /// </summary>
        public readonly int State;
        /// <summary>
        /// Type of the PrivateLink Endpoint
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetPrivatelinkEndpointResult(
            string cidrRange,

            string id,

            string? name,

            string? privateLinkEndpointUrl,

            int state,

            string type)
        {
            CidrRange = cidrRange;
            Id = id;
            Name = name;
            PrivateLinkEndpointUrl = privateLinkEndpointUrl;
            State = state;
            Type = type;
        }
    }
}