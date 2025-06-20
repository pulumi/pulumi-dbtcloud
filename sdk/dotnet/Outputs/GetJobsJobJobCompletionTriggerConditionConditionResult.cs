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
    public sealed class GetJobsJobJobCompletionTriggerConditionConditionResult
    {
        public readonly int JobId;
        public readonly int ProjectId;
        public readonly ImmutableArray<string> Statuses;

        [OutputConstructor]
        private GetJobsJobJobCompletionTriggerConditionConditionResult(
            int jobId,

            int projectId,

            ImmutableArray<string> statuses)
        {
            JobId = jobId;
            ProjectId = projectId;
            Statuses = statuses;
        }
    }
}
