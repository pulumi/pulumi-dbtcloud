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
    public sealed class GetJobsJobTriggersResult
    {
        /// <summary>
        /// Whether the job runs automatically on PR creation
        /// </summary>
        public readonly bool GitProviderWebhook;
        /// <summary>
        /// Whether the job runs automatically on PR creation
        /// </summary>
        public readonly bool GithubWebhook;
        /// <summary>
        /// Whether the job runs automatically once a PR is merged
        /// </summary>
        public readonly bool OnMerge;
        /// <summary>
        /// Whether the job runs on a schedule
        /// </summary>
        public readonly bool Schedule;

        [OutputConstructor]
        private GetJobsJobTriggersResult(
            bool gitProviderWebhook,

            bool githubWebhook,

            bool onMerge,

            bool schedule)
        {
            GitProviderWebhook = gitProviderWebhook;
            GithubWebhook = githubWebhook;
            OnMerge = onMerge;
            Schedule = schedule;
        }
    }
}
