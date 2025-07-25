// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dbtcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-dbtcloud/sdk/go/dbtcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// using  import blocks (requires Terraform >= 1.5)
//
// import {
//
//	to = dbtcloud_job.my_job
//
//	id = "job_id"
//
// }
//
// import {
//
//	to = dbtcloud_job.my_job
//
//	id = "12345"
//
// }
//
// using the older import command
//
// ```sh
// $ pulumi import dbtcloud:index/job:Job my_job "job_id"
// ```
//
// ```sh
// $ pulumi import dbtcloud:index/job:Job my_job 12345
// ```
type Job struct {
	pulumi.CustomResourceState

	// The model selector for checking changes in the compare changes Advanced CI feature
	CompareChangesFlags pulumi.StringOutput `pulumi:"compareChangesFlags"`
	// Version number of dbt to use in this job, usually in the format 1.2.0-latest rather than core versions
	DbtVersion pulumi.StringPtrOutput `pulumi:"dbtVersion"`
	// Environment identifier that this job defers to (new deferring approach)
	DeferringEnvironmentId pulumi.IntPtrOutput `pulumi:"deferringEnvironmentId"`
	// Job identifier that this job defers to (legacy deferring approach)
	DeferringJobId pulumi.IntPtrOutput `pulumi:"deferringJobId"`
	// Description for the job
	Description pulumi.StringOutput `pulumi:"description"`
	// Environment ID to create the job in
	EnvironmentId pulumi.IntOutput `pulumi:"environmentId"`
	// Whether the CI job should fail when a lint error is found. Only used when `runLint` is set to `true`. Defaults to `true`.
	ErrorsOnLintFailure pulumi.BoolOutput `pulumi:"errorsOnLintFailure"`
	// List of commands to execute for the job
	ExecuteSteps pulumi.StringArrayOutput `pulumi:"executeSteps"`
	// Flag for whether the job should generate documentation
	GenerateDocs pulumi.BoolOutput `pulumi:"generateDocs"`
	// Should always be set to true as setting it to false is the same as creating a job in a deleted state. To create/keep a job in a 'deactivated' state, check  the `triggers` config.
	IsActive pulumi.BoolOutput `pulumi:"isActive"`
	// Which other job should trigger this job when it finishes, and on which conditions (sometimes referred as 'job chaining').
	JobCompletionTriggerConditions JobJobCompletionTriggerConditionArrayOutput `pulumi:"jobCompletionTriggerConditions"`
	// Job identifier
	JobId pulumi.IntOutput `pulumi:"jobId"`
	// Can be used to enforce the job type betwen `ci`, `merge` and `scheduled`. Without this value the job type is inferred from the triggers configured
	JobType pulumi.StringOutput `pulumi:"jobType"`
	// Job name
	Name pulumi.StringOutput `pulumi:"name"`
	// Number of threads to use in the job
	NumThreads pulumi.IntOutput `pulumi:"numThreads"`
	// Project ID to create the job in
	ProjectId pulumi.IntOutput `pulumi:"projectId"`
	// Whether the CI job should compare data changes introduced by the code changes. Requires `deferringEnvironmentId` to be set. (Advanced CI needs to be activated in the dbt Cloud Account Settings first as well)
	RunCompareChanges pulumi.BoolOutput `pulumi:"runCompareChanges"`
	// Flag for whether the job should add a `dbt source freshness` step to the job. The difference between manually adding a step with `dbt source freshness` in the job steps or using this flag is that with this flag, a failed freshness will still allow the following steps to run.
	RunGenerateSources pulumi.BoolOutput `pulumi:"runGenerateSources"`
	// Whether the CI job should lint SQL changes. Defaults to `false`.
	RunLint pulumi.BoolOutput `pulumi:"runLint"`
	// Custom cron expression for schedule
	ScheduleCron pulumi.StringPtrOutput `pulumi:"scheduleCron"`
	// List of days of week as numbers (0 = Sunday, 7 = Saturday) to execute the job at if running on a schedule
	ScheduleDays pulumi.IntArrayOutput `pulumi:"scheduleDays"`
	// List of hours to execute the job at if running on a schedule
	ScheduleHours pulumi.IntArrayOutput `pulumi:"scheduleHours"`
	// Number of hours between job executions if running on a schedule
	ScheduleInterval pulumi.IntOutput `pulumi:"scheduleInterval"`
	// Type of schedule to use, one of every*day/ days*of*week/ custom*cron/ interval_cron
	ScheduleType pulumi.StringOutput `pulumi:"scheduleType"`
	// Whether this job defers on a previous run of itself
	SelfDeferring pulumi.BoolOutput `pulumi:"selfDeferring"`
	// Target name for the dbt profile
	TargetName pulumi.StringOutput `pulumi:"targetName"`
	// [Deprectated - Moved to execution.timeout_seconds] Number of seconds to allow the job to run before timing out
	//
	// Deprecated: Moved to execution.timeout_seconds
	TimeoutSeconds pulumi.IntOutput `pulumi:"timeoutSeconds"`
	// Flags for which types of triggers to use, the values are `githubWebhook`, `gitProviderWebhook`, `schedule` and `onMerge`. All flags should be listed and set with `true` or `false`. When `onMerge` is `true`, all the other values must be false.\n\n`customBranchOnly` used to be allowed but has been deprecated from the API. The jobs will use the custom branch of the environment. Please remove the `customBranchOnly` from your config. \n\nTo create a job in a 'deactivated' state, set all to `false`.
	Triggers JobTriggersOutput `pulumi:"triggers"`
	// Whether the CI job should be automatically triggered on draft PRs
	TriggersOnDraftPr pulumi.BoolOutput `pulumi:"triggersOnDraftPr"`
}

// NewJob registers a new resource with the given unique name, arguments, and options.
func NewJob(ctx *pulumi.Context,
	name string, args *JobArgs, opts ...pulumi.ResourceOption) (*Job, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EnvironmentId == nil {
		return nil, errors.New("invalid value for required argument 'EnvironmentId'")
	}
	if args.ExecuteSteps == nil {
		return nil, errors.New("invalid value for required argument 'ExecuteSteps'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Triggers == nil {
		return nil, errors.New("invalid value for required argument 'Triggers'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Job
	err := ctx.RegisterResource("dbtcloud:index/job:Job", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetJob gets an existing Job resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetJob(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *JobState, opts ...pulumi.ResourceOption) (*Job, error) {
	var resource Job
	err := ctx.ReadResource("dbtcloud:index/job:Job", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Job resources.
type jobState struct {
	// The model selector for checking changes in the compare changes Advanced CI feature
	CompareChangesFlags *string `pulumi:"compareChangesFlags"`
	// Version number of dbt to use in this job, usually in the format 1.2.0-latest rather than core versions
	DbtVersion *string `pulumi:"dbtVersion"`
	// Environment identifier that this job defers to (new deferring approach)
	DeferringEnvironmentId *int `pulumi:"deferringEnvironmentId"`
	// Job identifier that this job defers to (legacy deferring approach)
	DeferringJobId *int `pulumi:"deferringJobId"`
	// Description for the job
	Description *string `pulumi:"description"`
	// Environment ID to create the job in
	EnvironmentId *int `pulumi:"environmentId"`
	// Whether the CI job should fail when a lint error is found. Only used when `runLint` is set to `true`. Defaults to `true`.
	ErrorsOnLintFailure *bool `pulumi:"errorsOnLintFailure"`
	// List of commands to execute for the job
	ExecuteSteps []string `pulumi:"executeSteps"`
	// Flag for whether the job should generate documentation
	GenerateDocs *bool `pulumi:"generateDocs"`
	// Should always be set to true as setting it to false is the same as creating a job in a deleted state. To create/keep a job in a 'deactivated' state, check  the `triggers` config.
	IsActive *bool `pulumi:"isActive"`
	// Which other job should trigger this job when it finishes, and on which conditions (sometimes referred as 'job chaining').
	JobCompletionTriggerConditions []JobJobCompletionTriggerCondition `pulumi:"jobCompletionTriggerConditions"`
	// Job identifier
	JobId *int `pulumi:"jobId"`
	// Can be used to enforce the job type betwen `ci`, `merge` and `scheduled`. Without this value the job type is inferred from the triggers configured
	JobType *string `pulumi:"jobType"`
	// Job name
	Name *string `pulumi:"name"`
	// Number of threads to use in the job
	NumThreads *int `pulumi:"numThreads"`
	// Project ID to create the job in
	ProjectId *int `pulumi:"projectId"`
	// Whether the CI job should compare data changes introduced by the code changes. Requires `deferringEnvironmentId` to be set. (Advanced CI needs to be activated in the dbt Cloud Account Settings first as well)
	RunCompareChanges *bool `pulumi:"runCompareChanges"`
	// Flag for whether the job should add a `dbt source freshness` step to the job. The difference between manually adding a step with `dbt source freshness` in the job steps or using this flag is that with this flag, a failed freshness will still allow the following steps to run.
	RunGenerateSources *bool `pulumi:"runGenerateSources"`
	// Whether the CI job should lint SQL changes. Defaults to `false`.
	RunLint *bool `pulumi:"runLint"`
	// Custom cron expression for schedule
	ScheduleCron *string `pulumi:"scheduleCron"`
	// List of days of week as numbers (0 = Sunday, 7 = Saturday) to execute the job at if running on a schedule
	ScheduleDays []int `pulumi:"scheduleDays"`
	// List of hours to execute the job at if running on a schedule
	ScheduleHours []int `pulumi:"scheduleHours"`
	// Number of hours between job executions if running on a schedule
	ScheduleInterval *int `pulumi:"scheduleInterval"`
	// Type of schedule to use, one of every*day/ days*of*week/ custom*cron/ interval_cron
	ScheduleType *string `pulumi:"scheduleType"`
	// Whether this job defers on a previous run of itself
	SelfDeferring *bool `pulumi:"selfDeferring"`
	// Target name for the dbt profile
	TargetName *string `pulumi:"targetName"`
	// [Deprectated - Moved to execution.timeout_seconds] Number of seconds to allow the job to run before timing out
	//
	// Deprecated: Moved to execution.timeout_seconds
	TimeoutSeconds *int `pulumi:"timeoutSeconds"`
	// Flags for which types of triggers to use, the values are `githubWebhook`, `gitProviderWebhook`, `schedule` and `onMerge`. All flags should be listed and set with `true` or `false`. When `onMerge` is `true`, all the other values must be false.\n\n`customBranchOnly` used to be allowed but has been deprecated from the API. The jobs will use the custom branch of the environment. Please remove the `customBranchOnly` from your config. \n\nTo create a job in a 'deactivated' state, set all to `false`.
	Triggers *JobTriggers `pulumi:"triggers"`
	// Whether the CI job should be automatically triggered on draft PRs
	TriggersOnDraftPr *bool `pulumi:"triggersOnDraftPr"`
}

type JobState struct {
	// The model selector for checking changes in the compare changes Advanced CI feature
	CompareChangesFlags pulumi.StringPtrInput
	// Version number of dbt to use in this job, usually in the format 1.2.0-latest rather than core versions
	DbtVersion pulumi.StringPtrInput
	// Environment identifier that this job defers to (new deferring approach)
	DeferringEnvironmentId pulumi.IntPtrInput
	// Job identifier that this job defers to (legacy deferring approach)
	DeferringJobId pulumi.IntPtrInput
	// Description for the job
	Description pulumi.StringPtrInput
	// Environment ID to create the job in
	EnvironmentId pulumi.IntPtrInput
	// Whether the CI job should fail when a lint error is found. Only used when `runLint` is set to `true`. Defaults to `true`.
	ErrorsOnLintFailure pulumi.BoolPtrInput
	// List of commands to execute for the job
	ExecuteSteps pulumi.StringArrayInput
	// Flag for whether the job should generate documentation
	GenerateDocs pulumi.BoolPtrInput
	// Should always be set to true as setting it to false is the same as creating a job in a deleted state. To create/keep a job in a 'deactivated' state, check  the `triggers` config.
	IsActive pulumi.BoolPtrInput
	// Which other job should trigger this job when it finishes, and on which conditions (sometimes referred as 'job chaining').
	JobCompletionTriggerConditions JobJobCompletionTriggerConditionArrayInput
	// Job identifier
	JobId pulumi.IntPtrInput
	// Can be used to enforce the job type betwen `ci`, `merge` and `scheduled`. Without this value the job type is inferred from the triggers configured
	JobType pulumi.StringPtrInput
	// Job name
	Name pulumi.StringPtrInput
	// Number of threads to use in the job
	NumThreads pulumi.IntPtrInput
	// Project ID to create the job in
	ProjectId pulumi.IntPtrInput
	// Whether the CI job should compare data changes introduced by the code changes. Requires `deferringEnvironmentId` to be set. (Advanced CI needs to be activated in the dbt Cloud Account Settings first as well)
	RunCompareChanges pulumi.BoolPtrInput
	// Flag for whether the job should add a `dbt source freshness` step to the job. The difference between manually adding a step with `dbt source freshness` in the job steps or using this flag is that with this flag, a failed freshness will still allow the following steps to run.
	RunGenerateSources pulumi.BoolPtrInput
	// Whether the CI job should lint SQL changes. Defaults to `false`.
	RunLint pulumi.BoolPtrInput
	// Custom cron expression for schedule
	ScheduleCron pulumi.StringPtrInput
	// List of days of week as numbers (0 = Sunday, 7 = Saturday) to execute the job at if running on a schedule
	ScheduleDays pulumi.IntArrayInput
	// List of hours to execute the job at if running on a schedule
	ScheduleHours pulumi.IntArrayInput
	// Number of hours between job executions if running on a schedule
	ScheduleInterval pulumi.IntPtrInput
	// Type of schedule to use, one of every*day/ days*of*week/ custom*cron/ interval_cron
	ScheduleType pulumi.StringPtrInput
	// Whether this job defers on a previous run of itself
	SelfDeferring pulumi.BoolPtrInput
	// Target name for the dbt profile
	TargetName pulumi.StringPtrInput
	// [Deprectated - Moved to execution.timeout_seconds] Number of seconds to allow the job to run before timing out
	//
	// Deprecated: Moved to execution.timeout_seconds
	TimeoutSeconds pulumi.IntPtrInput
	// Flags for which types of triggers to use, the values are `githubWebhook`, `gitProviderWebhook`, `schedule` and `onMerge`. All flags should be listed and set with `true` or `false`. When `onMerge` is `true`, all the other values must be false.\n\n`customBranchOnly` used to be allowed but has been deprecated from the API. The jobs will use the custom branch of the environment. Please remove the `customBranchOnly` from your config. \n\nTo create a job in a 'deactivated' state, set all to `false`.
	Triggers JobTriggersPtrInput
	// Whether the CI job should be automatically triggered on draft PRs
	TriggersOnDraftPr pulumi.BoolPtrInput
}

func (JobState) ElementType() reflect.Type {
	return reflect.TypeOf((*jobState)(nil)).Elem()
}

type jobArgs struct {
	// The model selector for checking changes in the compare changes Advanced CI feature
	CompareChangesFlags *string `pulumi:"compareChangesFlags"`
	// Version number of dbt to use in this job, usually in the format 1.2.0-latest rather than core versions
	DbtVersion *string `pulumi:"dbtVersion"`
	// Environment identifier that this job defers to (new deferring approach)
	DeferringEnvironmentId *int `pulumi:"deferringEnvironmentId"`
	// Job identifier that this job defers to (legacy deferring approach)
	DeferringJobId *int `pulumi:"deferringJobId"`
	// Description for the job
	Description *string `pulumi:"description"`
	// Environment ID to create the job in
	EnvironmentId int `pulumi:"environmentId"`
	// Whether the CI job should fail when a lint error is found. Only used when `runLint` is set to `true`. Defaults to `true`.
	ErrorsOnLintFailure *bool `pulumi:"errorsOnLintFailure"`
	// List of commands to execute for the job
	ExecuteSteps []string `pulumi:"executeSteps"`
	// Flag for whether the job should generate documentation
	GenerateDocs *bool `pulumi:"generateDocs"`
	// Should always be set to true as setting it to false is the same as creating a job in a deleted state. To create/keep a job in a 'deactivated' state, check  the `triggers` config.
	IsActive *bool `pulumi:"isActive"`
	// Which other job should trigger this job when it finishes, and on which conditions (sometimes referred as 'job chaining').
	JobCompletionTriggerConditions []JobJobCompletionTriggerCondition `pulumi:"jobCompletionTriggerConditions"`
	// Can be used to enforce the job type betwen `ci`, `merge` and `scheduled`. Without this value the job type is inferred from the triggers configured
	JobType *string `pulumi:"jobType"`
	// Job name
	Name *string `pulumi:"name"`
	// Number of threads to use in the job
	NumThreads *int `pulumi:"numThreads"`
	// Project ID to create the job in
	ProjectId int `pulumi:"projectId"`
	// Whether the CI job should compare data changes introduced by the code changes. Requires `deferringEnvironmentId` to be set. (Advanced CI needs to be activated in the dbt Cloud Account Settings first as well)
	RunCompareChanges *bool `pulumi:"runCompareChanges"`
	// Flag for whether the job should add a `dbt source freshness` step to the job. The difference between manually adding a step with `dbt source freshness` in the job steps or using this flag is that with this flag, a failed freshness will still allow the following steps to run.
	RunGenerateSources *bool `pulumi:"runGenerateSources"`
	// Whether the CI job should lint SQL changes. Defaults to `false`.
	RunLint *bool `pulumi:"runLint"`
	// Custom cron expression for schedule
	ScheduleCron *string `pulumi:"scheduleCron"`
	// List of days of week as numbers (0 = Sunday, 7 = Saturday) to execute the job at if running on a schedule
	ScheduleDays []int `pulumi:"scheduleDays"`
	// List of hours to execute the job at if running on a schedule
	ScheduleHours []int `pulumi:"scheduleHours"`
	// Number of hours between job executions if running on a schedule
	ScheduleInterval *int `pulumi:"scheduleInterval"`
	// Type of schedule to use, one of every*day/ days*of*week/ custom*cron/ interval_cron
	ScheduleType *string `pulumi:"scheduleType"`
	// Whether this job defers on a previous run of itself
	SelfDeferring *bool `pulumi:"selfDeferring"`
	// Target name for the dbt profile
	TargetName *string `pulumi:"targetName"`
	// [Deprectated - Moved to execution.timeout_seconds] Number of seconds to allow the job to run before timing out
	//
	// Deprecated: Moved to execution.timeout_seconds
	TimeoutSeconds *int `pulumi:"timeoutSeconds"`
	// Flags for which types of triggers to use, the values are `githubWebhook`, `gitProviderWebhook`, `schedule` and `onMerge`. All flags should be listed and set with `true` or `false`. When `onMerge` is `true`, all the other values must be false.\n\n`customBranchOnly` used to be allowed but has been deprecated from the API. The jobs will use the custom branch of the environment. Please remove the `customBranchOnly` from your config. \n\nTo create a job in a 'deactivated' state, set all to `false`.
	Triggers JobTriggers `pulumi:"triggers"`
	// Whether the CI job should be automatically triggered on draft PRs
	TriggersOnDraftPr *bool `pulumi:"triggersOnDraftPr"`
}

// The set of arguments for constructing a Job resource.
type JobArgs struct {
	// The model selector for checking changes in the compare changes Advanced CI feature
	CompareChangesFlags pulumi.StringPtrInput
	// Version number of dbt to use in this job, usually in the format 1.2.0-latest rather than core versions
	DbtVersion pulumi.StringPtrInput
	// Environment identifier that this job defers to (new deferring approach)
	DeferringEnvironmentId pulumi.IntPtrInput
	// Job identifier that this job defers to (legacy deferring approach)
	DeferringJobId pulumi.IntPtrInput
	// Description for the job
	Description pulumi.StringPtrInput
	// Environment ID to create the job in
	EnvironmentId pulumi.IntInput
	// Whether the CI job should fail when a lint error is found. Only used when `runLint` is set to `true`. Defaults to `true`.
	ErrorsOnLintFailure pulumi.BoolPtrInput
	// List of commands to execute for the job
	ExecuteSteps pulumi.StringArrayInput
	// Flag for whether the job should generate documentation
	GenerateDocs pulumi.BoolPtrInput
	// Should always be set to true as setting it to false is the same as creating a job in a deleted state. To create/keep a job in a 'deactivated' state, check  the `triggers` config.
	IsActive pulumi.BoolPtrInput
	// Which other job should trigger this job when it finishes, and on which conditions (sometimes referred as 'job chaining').
	JobCompletionTriggerConditions JobJobCompletionTriggerConditionArrayInput
	// Can be used to enforce the job type betwen `ci`, `merge` and `scheduled`. Without this value the job type is inferred from the triggers configured
	JobType pulumi.StringPtrInput
	// Job name
	Name pulumi.StringPtrInput
	// Number of threads to use in the job
	NumThreads pulumi.IntPtrInput
	// Project ID to create the job in
	ProjectId pulumi.IntInput
	// Whether the CI job should compare data changes introduced by the code changes. Requires `deferringEnvironmentId` to be set. (Advanced CI needs to be activated in the dbt Cloud Account Settings first as well)
	RunCompareChanges pulumi.BoolPtrInput
	// Flag for whether the job should add a `dbt source freshness` step to the job. The difference between manually adding a step with `dbt source freshness` in the job steps or using this flag is that with this flag, a failed freshness will still allow the following steps to run.
	RunGenerateSources pulumi.BoolPtrInput
	// Whether the CI job should lint SQL changes. Defaults to `false`.
	RunLint pulumi.BoolPtrInput
	// Custom cron expression for schedule
	ScheduleCron pulumi.StringPtrInput
	// List of days of week as numbers (0 = Sunday, 7 = Saturday) to execute the job at if running on a schedule
	ScheduleDays pulumi.IntArrayInput
	// List of hours to execute the job at if running on a schedule
	ScheduleHours pulumi.IntArrayInput
	// Number of hours between job executions if running on a schedule
	ScheduleInterval pulumi.IntPtrInput
	// Type of schedule to use, one of every*day/ days*of*week/ custom*cron/ interval_cron
	ScheduleType pulumi.StringPtrInput
	// Whether this job defers on a previous run of itself
	SelfDeferring pulumi.BoolPtrInput
	// Target name for the dbt profile
	TargetName pulumi.StringPtrInput
	// [Deprectated - Moved to execution.timeout_seconds] Number of seconds to allow the job to run before timing out
	//
	// Deprecated: Moved to execution.timeout_seconds
	TimeoutSeconds pulumi.IntPtrInput
	// Flags for which types of triggers to use, the values are `githubWebhook`, `gitProviderWebhook`, `schedule` and `onMerge`. All flags should be listed and set with `true` or `false`. When `onMerge` is `true`, all the other values must be false.\n\n`customBranchOnly` used to be allowed but has been deprecated from the API. The jobs will use the custom branch of the environment. Please remove the `customBranchOnly` from your config. \n\nTo create a job in a 'deactivated' state, set all to `false`.
	Triggers JobTriggersInput
	// Whether the CI job should be automatically triggered on draft PRs
	TriggersOnDraftPr pulumi.BoolPtrInput
}

func (JobArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*jobArgs)(nil)).Elem()
}

type JobInput interface {
	pulumi.Input

	ToJobOutput() JobOutput
	ToJobOutputWithContext(ctx context.Context) JobOutput
}

func (*Job) ElementType() reflect.Type {
	return reflect.TypeOf((**Job)(nil)).Elem()
}

func (i *Job) ToJobOutput() JobOutput {
	return i.ToJobOutputWithContext(context.Background())
}

func (i *Job) ToJobOutputWithContext(ctx context.Context) JobOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobOutput)
}

// JobArrayInput is an input type that accepts JobArray and JobArrayOutput values.
// You can construct a concrete instance of `JobArrayInput` via:
//
//	JobArray{ JobArgs{...} }
type JobArrayInput interface {
	pulumi.Input

	ToJobArrayOutput() JobArrayOutput
	ToJobArrayOutputWithContext(context.Context) JobArrayOutput
}

type JobArray []JobInput

func (JobArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Job)(nil)).Elem()
}

func (i JobArray) ToJobArrayOutput() JobArrayOutput {
	return i.ToJobArrayOutputWithContext(context.Background())
}

func (i JobArray) ToJobArrayOutputWithContext(ctx context.Context) JobArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobArrayOutput)
}

// JobMapInput is an input type that accepts JobMap and JobMapOutput values.
// You can construct a concrete instance of `JobMapInput` via:
//
//	JobMap{ "key": JobArgs{...} }
type JobMapInput interface {
	pulumi.Input

	ToJobMapOutput() JobMapOutput
	ToJobMapOutputWithContext(context.Context) JobMapOutput
}

type JobMap map[string]JobInput

func (JobMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Job)(nil)).Elem()
}

func (i JobMap) ToJobMapOutput() JobMapOutput {
	return i.ToJobMapOutputWithContext(context.Background())
}

func (i JobMap) ToJobMapOutputWithContext(ctx context.Context) JobMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(JobMapOutput)
}

type JobOutput struct{ *pulumi.OutputState }

func (JobOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Job)(nil)).Elem()
}

func (o JobOutput) ToJobOutput() JobOutput {
	return o
}

func (o JobOutput) ToJobOutputWithContext(ctx context.Context) JobOutput {
	return o
}

// The model selector for checking changes in the compare changes Advanced CI feature
func (o JobOutput) CompareChangesFlags() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.CompareChangesFlags }).(pulumi.StringOutput)
}

// Version number of dbt to use in this job, usually in the format 1.2.0-latest rather than core versions
func (o JobOutput) DbtVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.StringPtrOutput { return v.DbtVersion }).(pulumi.StringPtrOutput)
}

// Environment identifier that this job defers to (new deferring approach)
func (o JobOutput) DeferringEnvironmentId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.IntPtrOutput { return v.DeferringEnvironmentId }).(pulumi.IntPtrOutput)
}

// Job identifier that this job defers to (legacy deferring approach)
func (o JobOutput) DeferringJobId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.IntPtrOutput { return v.DeferringJobId }).(pulumi.IntPtrOutput)
}

// Description for the job
func (o JobOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Environment ID to create the job in
func (o JobOutput) EnvironmentId() pulumi.IntOutput {
	return o.ApplyT(func(v *Job) pulumi.IntOutput { return v.EnvironmentId }).(pulumi.IntOutput)
}

// Whether the CI job should fail when a lint error is found. Only used when `runLint` is set to `true`. Defaults to `true`.
func (o JobOutput) ErrorsOnLintFailure() pulumi.BoolOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolOutput { return v.ErrorsOnLintFailure }).(pulumi.BoolOutput)
}

// List of commands to execute for the job
func (o JobOutput) ExecuteSteps() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Job) pulumi.StringArrayOutput { return v.ExecuteSteps }).(pulumi.StringArrayOutput)
}

// Flag for whether the job should generate documentation
func (o JobOutput) GenerateDocs() pulumi.BoolOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolOutput { return v.GenerateDocs }).(pulumi.BoolOutput)
}

// Should always be set to true as setting it to false is the same as creating a job in a deleted state. To create/keep a job in a 'deactivated' state, check  the `triggers` config.
func (o JobOutput) IsActive() pulumi.BoolOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolOutput { return v.IsActive }).(pulumi.BoolOutput)
}

// Which other job should trigger this job when it finishes, and on which conditions (sometimes referred as 'job chaining').
func (o JobOutput) JobCompletionTriggerConditions() JobJobCompletionTriggerConditionArrayOutput {
	return o.ApplyT(func(v *Job) JobJobCompletionTriggerConditionArrayOutput { return v.JobCompletionTriggerConditions }).(JobJobCompletionTriggerConditionArrayOutput)
}

// Job identifier
func (o JobOutput) JobId() pulumi.IntOutput {
	return o.ApplyT(func(v *Job) pulumi.IntOutput { return v.JobId }).(pulumi.IntOutput)
}

// Can be used to enforce the job type betwen `ci`, `merge` and `scheduled`. Without this value the job type is inferred from the triggers configured
func (o JobOutput) JobType() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.JobType }).(pulumi.StringOutput)
}

// Job name
func (o JobOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Number of threads to use in the job
func (o JobOutput) NumThreads() pulumi.IntOutput {
	return o.ApplyT(func(v *Job) pulumi.IntOutput { return v.NumThreads }).(pulumi.IntOutput)
}

// Project ID to create the job in
func (o JobOutput) ProjectId() pulumi.IntOutput {
	return o.ApplyT(func(v *Job) pulumi.IntOutput { return v.ProjectId }).(pulumi.IntOutput)
}

// Whether the CI job should compare data changes introduced by the code changes. Requires `deferringEnvironmentId` to be set. (Advanced CI needs to be activated in the dbt Cloud Account Settings first as well)
func (o JobOutput) RunCompareChanges() pulumi.BoolOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolOutput { return v.RunCompareChanges }).(pulumi.BoolOutput)
}

// Flag for whether the job should add a `dbt source freshness` step to the job. The difference between manually adding a step with `dbt source freshness` in the job steps or using this flag is that with this flag, a failed freshness will still allow the following steps to run.
func (o JobOutput) RunGenerateSources() pulumi.BoolOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolOutput { return v.RunGenerateSources }).(pulumi.BoolOutput)
}

// Whether the CI job should lint SQL changes. Defaults to `false`.
func (o JobOutput) RunLint() pulumi.BoolOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolOutput { return v.RunLint }).(pulumi.BoolOutput)
}

// Custom cron expression for schedule
func (o JobOutput) ScheduleCron() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Job) pulumi.StringPtrOutput { return v.ScheduleCron }).(pulumi.StringPtrOutput)
}

// List of days of week as numbers (0 = Sunday, 7 = Saturday) to execute the job at if running on a schedule
func (o JobOutput) ScheduleDays() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *Job) pulumi.IntArrayOutput { return v.ScheduleDays }).(pulumi.IntArrayOutput)
}

// List of hours to execute the job at if running on a schedule
func (o JobOutput) ScheduleHours() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *Job) pulumi.IntArrayOutput { return v.ScheduleHours }).(pulumi.IntArrayOutput)
}

// Number of hours between job executions if running on a schedule
func (o JobOutput) ScheduleInterval() pulumi.IntOutput {
	return o.ApplyT(func(v *Job) pulumi.IntOutput { return v.ScheduleInterval }).(pulumi.IntOutput)
}

// Type of schedule to use, one of every*day/ days*of*week/ custom*cron/ interval_cron
func (o JobOutput) ScheduleType() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.ScheduleType }).(pulumi.StringOutput)
}

// Whether this job defers on a previous run of itself
func (o JobOutput) SelfDeferring() pulumi.BoolOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolOutput { return v.SelfDeferring }).(pulumi.BoolOutput)
}

// Target name for the dbt profile
func (o JobOutput) TargetName() pulumi.StringOutput {
	return o.ApplyT(func(v *Job) pulumi.StringOutput { return v.TargetName }).(pulumi.StringOutput)
}

// [Deprectated - Moved to execution.timeout_seconds] Number of seconds to allow the job to run before timing out
//
// Deprecated: Moved to execution.timeout_seconds
func (o JobOutput) TimeoutSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *Job) pulumi.IntOutput { return v.TimeoutSeconds }).(pulumi.IntOutput)
}

// Flags for which types of triggers to use, the values are `githubWebhook`, `gitProviderWebhook`, `schedule` and `onMerge`. All flags should be listed and set with `true` or `false`. When `onMerge` is `true`, all the other values must be false.\n\n`customBranchOnly` used to be allowed but has been deprecated from the API. The jobs will use the custom branch of the environment. Please remove the `customBranchOnly` from your config. \n\nTo create a job in a 'deactivated' state, set all to `false`.
func (o JobOutput) Triggers() JobTriggersOutput {
	return o.ApplyT(func(v *Job) JobTriggersOutput { return v.Triggers }).(JobTriggersOutput)
}

// Whether the CI job should be automatically triggered on draft PRs
func (o JobOutput) TriggersOnDraftPr() pulumi.BoolOutput {
	return o.ApplyT(func(v *Job) pulumi.BoolOutput { return v.TriggersOnDraftPr }).(pulumi.BoolOutput)
}

type JobArrayOutput struct{ *pulumi.OutputState }

func (JobArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Job)(nil)).Elem()
}

func (o JobArrayOutput) ToJobArrayOutput() JobArrayOutput {
	return o
}

func (o JobArrayOutput) ToJobArrayOutputWithContext(ctx context.Context) JobArrayOutput {
	return o
}

func (o JobArrayOutput) Index(i pulumi.IntInput) JobOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Job {
		return vs[0].([]*Job)[vs[1].(int)]
	}).(JobOutput)
}

type JobMapOutput struct{ *pulumi.OutputState }

func (JobMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Job)(nil)).Elem()
}

func (o JobMapOutput) ToJobMapOutput() JobMapOutput {
	return o
}

func (o JobMapOutput) ToJobMapOutputWithContext(ctx context.Context) JobMapOutput {
	return o
}

func (o JobMapOutput) MapIndex(k pulumi.StringInput) JobOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Job {
		return vs[0].(map[string]*Job)[vs[1].(string)]
	}).(JobOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*JobInput)(nil)).Elem(), &Job{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobArrayInput)(nil)).Elem(), JobArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*JobMapInput)(nil)).Elem(), JobMap{})
	pulumi.RegisterOutputType(JobOutput{})
	pulumi.RegisterOutputType(JobArrayOutput{})
	pulumi.RegisterOutputType(JobMapOutput{})
}
