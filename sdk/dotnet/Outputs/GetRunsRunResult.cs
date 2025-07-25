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
    public sealed class GetRunsRunResult
    {
        /// <summary>
        /// The ID of the account
        /// </summary>
        public readonly int AccountId;
        /// <summary>
        /// The cause of the run
        /// </summary>
        public readonly string Cause;
        /// <summary>
        /// The branch of the commit
        /// </summary>
        public readonly string GitBranch;
        /// <summary>
        /// The SHA of the commit
        /// </summary>
        public readonly string GitSha;
        /// <summary>
        /// The ID of the pull request
        /// </summary>
        public readonly string GithubPullRequestId;
        /// <summary>
        /// The ID of the run
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// The ID of the job
        /// </summary>
        public readonly int JobId;
        /// <summary>
        /// The schema override
        /// </summary>
        public readonly string SchemaOverride;

        [OutputConstructor]
        private GetRunsRunResult(
            int accountId,

            string cause,

            string gitBranch,

            string gitSha,

            string githubPullRequestId,

            int id,

            int jobId,

            string schemaOverride)
        {
            AccountId = accountId;
            Cause = cause;
            GitBranch = gitBranch;
            GitSha = gitSha;
            GithubPullRequestId = githubPullRequestId;
            Id = id;
            JobId = jobId;
            SchemaOverride = schemaOverride;
        }
    }
}
