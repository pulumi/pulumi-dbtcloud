// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.DbtCloud
{
    public static class GetJob
    {
        /// <summary>
        /// Get detailed information for a specific dbt Cloud job.
        /// </summary>
        public static Task<GetJobResult> InvokeAsync(GetJobArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetJobResult>("dbtcloud:index/getJob:getJob", args ?? new GetJobArgs(), options.WithDefaults());

        /// <summary>
        /// Get detailed information for a specific dbt Cloud job.
        /// </summary>
        public static Output<GetJobResult> Invoke(GetJobInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetJobResult>("dbtcloud:index/getJob:getJob", args ?? new GetJobInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Get detailed information for a specific dbt Cloud job.
        /// </summary>
        public static Output<GetJobResult> Invoke(GetJobInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetJobResult>("dbtcloud:index/getJob:getJob", args ?? new GetJobInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetJobArgs : global::Pulumi.InvokeArgs
    {
        [Input("jobCompletionTriggerConditions")]
        private List<Inputs.GetJobJobCompletionTriggerConditionArgs>? _jobCompletionTriggerConditions;

        /// <summary>
        /// Which other job should trigger this job when it finishes, and on which conditions. Format for the property will change in the next release to match the one from the one from dbtcloud*jobs.
        /// </summary>
        public List<Inputs.GetJobJobCompletionTriggerConditionArgs> CompletionTriggerCondition
        {
            get => _jobCompletionTriggerConditions ?? (_jobCompletionTriggerConditions = new List<Inputs.GetJobJobCompletionTriggerConditionArgs>());
            set => _jobCompletionTriggerConditions = value;
        }

        /// <summary>
        /// The ID of the job
        /// </summary>
        [Input("jobId", required: true)]
        public int JobId { get; set; }

        public GetJobArgs()
        {
        }
        public static new GetJobArgs Empty => new GetJobArgs();
    }

    public sealed class GetJobInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("jobCompletionTriggerConditions")]
        private InputList<Inputs.GetJobJobCompletionTriggerConditionInputArgs>? _jobCompletionTriggerConditions;

        /// <summary>
        /// Which other job should trigger this job when it finishes, and on which conditions. Format for the property will change in the next release to match the one from the one from dbtcloud*jobs.
        /// </summary>
        public InputList<Inputs.GetJobJobCompletionTriggerConditionInputArgs> JobCompletionTriggerConditions
        {
            get => _jobCompletionTriggerConditions ?? (_jobCompletionTriggerConditions = new InputList<Inputs.GetJobJobCompletionTriggerConditionInputArgs>());
            set => _jobCompletionTriggerConditions = value;
        }

        /// <summary>
        /// The ID of the job
        /// </summary>
        [Input("jobId", required: true)]
        public Input<int> JobId { get; set; } = null!;

        public GetJobInvokeArgs()
        {
        }
        public static new GetJobInvokeArgs Empty => new GetJobInvokeArgs();
    }


    [OutputType]
    public sealed class GetJobResult
    {
        /// <summary>
        /// The version of dbt used for the job. If not set, the environment version will be used.
        /// </summary>
        public readonly string DbtVersion;
        /// <summary>
        /// The ID of the environment this job defers to
        /// </summary>
        public readonly int DeferringEnvironmentId;
        /// <summary>
        /// [Deprectated - Deferral is now set at the environment level] The ID of the job definition this job defers to
        /// </summary>
        public readonly int DeferringJobId;
        /// <summary>
        /// The description of the job
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Details of the environment the job is running in
        /// </summary>
        public readonly Outputs.GetJobEnvironmentResult Environment;
        /// <summary>
        /// The ID of environment
        /// </summary>
        public readonly int EnvironmentId;
        /// <summary>
        /// The list of steps to run in the job
        /// </summary>
        public readonly ImmutableArray<string> ExecuteSteps;
        public readonly Outputs.GetJobExecutionResult Execution;
        /// <summary>
        /// Whether the job generate docs
        /// </summary>
        public readonly bool GenerateDocs;
        /// <summary>
        /// The ID of the job
        /// </summary>
        public readonly int Id;
        /// <summary>
        /// Which other job should trigger this job when it finishes, and on which conditions. Format for the property will change in the next release to match the one from the one from dbtcloud*jobs.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJobJobCompletionTriggerConditionResult> CompletionTriggerCondition;
        /// <summary>
        /// The ID of the job
        /// </summary>
        public readonly int JobId;
        /// <summary>
        /// The type of job (e.g. CI, scheduled)
        /// </summary>
        public readonly string JobType;
        /// <summary>
        /// The name of the job
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The ID of the project
        /// </summary>
        public readonly int ProjectId;
        /// <summary>
        /// Whether the job should compare data changes introduced by the code change in the PR
        /// </summary>
        public readonly bool RunCompareChanges;
        /// <summary>
        /// Whether the job test source freshness
        /// </summary>
        public readonly bool RunGenerateSources;
        public readonly Outputs.GetJobScheduleResult Schedule;
        /// <summary>
        /// Whether this job defers on a previous run of itself (overrides value in deferring*job*id)
        /// </summary>
        public readonly bool SelfDeferring;
        public readonly Outputs.GetJobSettingsResult Settings;
        /// <summary>
        /// [Deprectated - Moved to execution.timeout_seconds] Number of seconds before the job times out
        /// </summary>
        public readonly int TimeoutSeconds;
        public readonly Outputs.GetJobTriggersResult Triggers;
        /// <summary>
        /// Whether the CI job should be automatically triggered on draft PRs
        /// </summary>
        public readonly bool TriggersOnDraftPr;

        [OutputConstructor]
        private GetJobResult(
            string dbtVersion,

            int deferringEnvironmentId,

            int deferringJobId,

            string description,

            Outputs.GetJobEnvironmentResult environment,

            int environmentId,

            ImmutableArray<string> executeSteps,

            Outputs.GetJobExecutionResult execution,

            bool generateDocs,

            int id,

            ImmutableArray<Outputs.GetJobJobCompletionTriggerConditionResult> jobCompletionTriggerConditions,

            int jobId,

            string jobType,

            string name,

            int projectId,

            bool runCompareChanges,

            bool runGenerateSources,

            Outputs.GetJobScheduleResult schedule,

            bool selfDeferring,

            Outputs.GetJobSettingsResult settings,

            int timeoutSeconds,

            Outputs.GetJobTriggersResult triggers,

            bool triggersOnDraftPr)
        {
            DbtVersion = dbtVersion;
            DeferringEnvironmentId = deferringEnvironmentId;
            DeferringJobId = deferringJobId;
            Description = description;
            Environment = environment;
            EnvironmentId = environmentId;
            ExecuteSteps = executeSteps;
            Execution = execution;
            GenerateDocs = generateDocs;
            Id = id;
            CompletionTriggerCondition = jobCompletionTriggerConditions;
            JobId = jobId;
            JobType = jobType;
            Name = name;
            ProjectId = projectId;
            RunCompareChanges = runCompareChanges;
            RunGenerateSources = runGenerateSources;
            Schedule = schedule;
            SelfDeferring = selfDeferring;
            Settings = settings;
            TimeoutSeconds = timeoutSeconds;
            Triggers = triggers;
            TriggersOnDraftPr = triggersOnDraftPr;
        }
    }
}
