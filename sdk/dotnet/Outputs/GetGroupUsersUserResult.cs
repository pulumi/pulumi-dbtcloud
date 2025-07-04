// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud.Outputs
{

    [OutputType]
    public sealed class GetGroupUsersUserResult
    {
        /// <summary>
        /// Email of the user
        /// </summary>
        public readonly string Email;
        /// <summary>
        /// ID of the user
        /// </summary>
        public readonly int Id;

        [OutputConstructor]
        private GetGroupUsersUserResult(
            string email,

            int id)
        {
            Email = email;
            Id = id;
        }
    }
}
