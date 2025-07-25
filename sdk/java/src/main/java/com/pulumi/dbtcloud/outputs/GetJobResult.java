// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dbtcloud.outputs.GetJobEnvironment;
import com.pulumi.dbtcloud.outputs.GetJobExecution;
import com.pulumi.dbtcloud.outputs.GetJobJobCompletionTriggerCondition;
import com.pulumi.dbtcloud.outputs.GetJobSchedule;
import com.pulumi.dbtcloud.outputs.GetJobSettings;
import com.pulumi.dbtcloud.outputs.GetJobTriggers;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetJobResult {
    /**
     * @return The version of dbt used for the job. If not set, the environment version will be used.
     * 
     */
    private String dbtVersion;
    /**
     * @return The ID of the environment this job defers to
     * 
     */
    private Integer deferringEnvironmentId;
    /**
     * @return [Deprectated - Deferral is now set at the environment level] The ID of the job definition this job defers to
     * 
     * @deprecated
     * Deferral is now set at the environment level
     * 
     */
    @Deprecated /* Deferral is now set at the environment level */
    private Integer deferringJobId;
    /**
     * @return The description of the job
     * 
     */
    private String description;
    /**
     * @return Details of the environment the job is running in
     * 
     */
    private GetJobEnvironment environment;
    /**
     * @return The ID of environment
     * 
     */
    private Integer environmentId;
    /**
     * @return The list of steps to run in the job
     * 
     */
    private List<String> executeSteps;
    private GetJobExecution execution;
    /**
     * @return Whether the job generate docs
     * 
     */
    private Boolean generateDocs;
    /**
     * @return The ID of the job
     * 
     */
    private Integer id;
    /**
     * @return Which other job should trigger this job when it finishes, and on which conditions. Format for the property will change in the next release to match the one from the one from dbtcloud*jobs.
     * 
     */
    private List<GetJobJobCompletionTriggerCondition> jobCompletionTriggerConditions;
    /**
     * @return The ID of the job
     * 
     */
    private Integer jobId;
    /**
     * @return The type of job (e.g. CI, scheduled)
     * 
     */
    private String jobType;
    /**
     * @return The name of the job
     * 
     */
    private String name;
    /**
     * @return The ID of the project
     * 
     */
    private Integer projectId;
    /**
     * @return Whether the job should compare data changes introduced by the code change in the PR
     * 
     */
    private Boolean runCompareChanges;
    /**
     * @return Whether the job test source freshness
     * 
     */
    private Boolean runGenerateSources;
    private GetJobSchedule schedule;
    /**
     * @return Whether this job defers on a previous run of itself (overrides value in deferring*job*id)
     * 
     */
    private Boolean selfDeferring;
    private GetJobSettings settings;
    /**
     * @return [Deprectated - Moved to execution.timeout_seconds] Number of seconds before the job times out
     * 
     * @deprecated
     * Moved to execution.timeout_seconds
     * 
     */
    @Deprecated /* Moved to execution.timeout_seconds */
    private Integer timeoutSeconds;
    private GetJobTriggers triggers;
    /**
     * @return Whether the CI job should be automatically triggered on draft PRs
     * 
     */
    private Boolean triggersOnDraftPr;

    private GetJobResult() {}
    /**
     * @return The version of dbt used for the job. If not set, the environment version will be used.
     * 
     */
    public String dbtVersion() {
        return this.dbtVersion;
    }
    /**
     * @return The ID of the environment this job defers to
     * 
     */
    public Integer deferringEnvironmentId() {
        return this.deferringEnvironmentId;
    }
    /**
     * @return [Deprectated - Deferral is now set at the environment level] The ID of the job definition this job defers to
     * 
     * @deprecated
     * Deferral is now set at the environment level
     * 
     */
    @Deprecated /* Deferral is now set at the environment level */
    public Integer deferringJobId() {
        return this.deferringJobId;
    }
    /**
     * @return The description of the job
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Details of the environment the job is running in
     * 
     */
    public GetJobEnvironment environment() {
        return this.environment;
    }
    /**
     * @return The ID of environment
     * 
     */
    public Integer environmentId() {
        return this.environmentId;
    }
    /**
     * @return The list of steps to run in the job
     * 
     */
    public List<String> executeSteps() {
        return this.executeSteps;
    }
    public GetJobExecution execution() {
        return this.execution;
    }
    /**
     * @return Whether the job generate docs
     * 
     */
    public Boolean generateDocs() {
        return this.generateDocs;
    }
    /**
     * @return The ID of the job
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return Which other job should trigger this job when it finishes, and on which conditions. Format for the property will change in the next release to match the one from the one from dbtcloud*jobs.
     * 
     */
    public List<GetJobJobCompletionTriggerCondition> jobCompletionTriggerConditions() {
        return this.jobCompletionTriggerConditions;
    }
    /**
     * @return The ID of the job
     * 
     */
    public Integer jobId() {
        return this.jobId;
    }
    /**
     * @return The type of job (e.g. CI, scheduled)
     * 
     */
    public String jobType() {
        return this.jobType;
    }
    /**
     * @return The name of the job
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The ID of the project
     * 
     */
    public Integer projectId() {
        return this.projectId;
    }
    /**
     * @return Whether the job should compare data changes introduced by the code change in the PR
     * 
     */
    public Boolean runCompareChanges() {
        return this.runCompareChanges;
    }
    /**
     * @return Whether the job test source freshness
     * 
     */
    public Boolean runGenerateSources() {
        return this.runGenerateSources;
    }
    public GetJobSchedule schedule() {
        return this.schedule;
    }
    /**
     * @return Whether this job defers on a previous run of itself (overrides value in deferring*job*id)
     * 
     */
    public Boolean selfDeferring() {
        return this.selfDeferring;
    }
    public GetJobSettings settings() {
        return this.settings;
    }
    /**
     * @return [Deprectated - Moved to execution.timeout_seconds] Number of seconds before the job times out
     * 
     * @deprecated
     * Moved to execution.timeout_seconds
     * 
     */
    @Deprecated /* Moved to execution.timeout_seconds */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }
    public GetJobTriggers triggers() {
        return this.triggers;
    }
    /**
     * @return Whether the CI job should be automatically triggered on draft PRs
     * 
     */
    public Boolean triggersOnDraftPr() {
        return this.triggersOnDraftPr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dbtVersion;
        private Integer deferringEnvironmentId;
        private Integer deferringJobId;
        private String description;
        private GetJobEnvironment environment;
        private Integer environmentId;
        private List<String> executeSteps;
        private GetJobExecution execution;
        private Boolean generateDocs;
        private Integer id;
        private List<GetJobJobCompletionTriggerCondition> jobCompletionTriggerConditions;
        private Integer jobId;
        private String jobType;
        private String name;
        private Integer projectId;
        private Boolean runCompareChanges;
        private Boolean runGenerateSources;
        private GetJobSchedule schedule;
        private Boolean selfDeferring;
        private GetJobSettings settings;
        private Integer timeoutSeconds;
        private GetJobTriggers triggers;
        private Boolean triggersOnDraftPr;
        public Builder() {}
        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbtVersion = defaults.dbtVersion;
    	      this.deferringEnvironmentId = defaults.deferringEnvironmentId;
    	      this.deferringJobId = defaults.deferringJobId;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.environmentId = defaults.environmentId;
    	      this.executeSteps = defaults.executeSteps;
    	      this.execution = defaults.execution;
    	      this.generateDocs = defaults.generateDocs;
    	      this.id = defaults.id;
    	      this.jobCompletionTriggerConditions = defaults.jobCompletionTriggerConditions;
    	      this.jobId = defaults.jobId;
    	      this.jobType = defaults.jobType;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.runCompareChanges = defaults.runCompareChanges;
    	      this.runGenerateSources = defaults.runGenerateSources;
    	      this.schedule = defaults.schedule;
    	      this.selfDeferring = defaults.selfDeferring;
    	      this.settings = defaults.settings;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.triggers = defaults.triggers;
    	      this.triggersOnDraftPr = defaults.triggersOnDraftPr;
        }

        @CustomType.Setter
        public Builder dbtVersion(String dbtVersion) {
            if (dbtVersion == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "dbtVersion");
            }
            this.dbtVersion = dbtVersion;
            return this;
        }
        @CustomType.Setter
        public Builder deferringEnvironmentId(Integer deferringEnvironmentId) {
            if (deferringEnvironmentId == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "deferringEnvironmentId");
            }
            this.deferringEnvironmentId = deferringEnvironmentId;
            return this;
        }
        @CustomType.Setter
        public Builder deferringJobId(Integer deferringJobId) {
            if (deferringJobId == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "deferringJobId");
            }
            this.deferringJobId = deferringJobId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetJobEnvironment environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder environmentId(Integer environmentId) {
            if (environmentId == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "environmentId");
            }
            this.environmentId = environmentId;
            return this;
        }
        @CustomType.Setter
        public Builder executeSteps(List<String> executeSteps) {
            if (executeSteps == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "executeSteps");
            }
            this.executeSteps = executeSteps;
            return this;
        }
        public Builder executeSteps(String... executeSteps) {
            return executeSteps(List.of(executeSteps));
        }
        @CustomType.Setter
        public Builder execution(GetJobExecution execution) {
            if (execution == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "execution");
            }
            this.execution = execution;
            return this;
        }
        @CustomType.Setter
        public Builder generateDocs(Boolean generateDocs) {
            if (generateDocs == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "generateDocs");
            }
            this.generateDocs = generateDocs;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder jobCompletionTriggerConditions(List<GetJobJobCompletionTriggerCondition> jobCompletionTriggerConditions) {
            if (jobCompletionTriggerConditions == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "jobCompletionTriggerConditions");
            }
            this.jobCompletionTriggerConditions = jobCompletionTriggerConditions;
            return this;
        }
        public Builder jobCompletionTriggerConditions(GetJobJobCompletionTriggerCondition... jobCompletionTriggerConditions) {
            return jobCompletionTriggerConditions(List.of(jobCompletionTriggerConditions));
        }
        @CustomType.Setter
        public Builder jobId(Integer jobId) {
            if (jobId == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "jobId");
            }
            this.jobId = jobId;
            return this;
        }
        @CustomType.Setter
        public Builder jobType(String jobType) {
            if (jobType == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "jobType");
            }
            this.jobType = jobType;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(Integer projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder runCompareChanges(Boolean runCompareChanges) {
            if (runCompareChanges == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "runCompareChanges");
            }
            this.runCompareChanges = runCompareChanges;
            return this;
        }
        @CustomType.Setter
        public Builder runGenerateSources(Boolean runGenerateSources) {
            if (runGenerateSources == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "runGenerateSources");
            }
            this.runGenerateSources = runGenerateSources;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(GetJobSchedule schedule) {
            if (schedule == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "schedule");
            }
            this.schedule = schedule;
            return this;
        }
        @CustomType.Setter
        public Builder selfDeferring(Boolean selfDeferring) {
            if (selfDeferring == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "selfDeferring");
            }
            this.selfDeferring = selfDeferring;
            return this;
        }
        @CustomType.Setter
        public Builder settings(GetJobSettings settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "settings");
            }
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            if (timeoutSeconds == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "timeoutSeconds");
            }
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder triggers(GetJobTriggers triggers) {
            if (triggers == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "triggers");
            }
            this.triggers = triggers;
            return this;
        }
        @CustomType.Setter
        public Builder triggersOnDraftPr(Boolean triggersOnDraftPr) {
            if (triggersOnDraftPr == null) {
              throw new MissingRequiredPropertyException("GetJobResult", "triggersOnDraftPr");
            }
            this.triggersOnDraftPr = triggersOnDraftPr;
            return this;
        }
        public GetJobResult build() {
            final var _resultValue = new GetJobResult();
            _resultValue.dbtVersion = dbtVersion;
            _resultValue.deferringEnvironmentId = deferringEnvironmentId;
            _resultValue.deferringJobId = deferringJobId;
            _resultValue.description = description;
            _resultValue.environment = environment;
            _resultValue.environmentId = environmentId;
            _resultValue.executeSteps = executeSteps;
            _resultValue.execution = execution;
            _resultValue.generateDocs = generateDocs;
            _resultValue.id = id;
            _resultValue.jobCompletionTriggerConditions = jobCompletionTriggerConditions;
            _resultValue.jobId = jobId;
            _resultValue.jobType = jobType;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.runCompareChanges = runCompareChanges;
            _resultValue.runGenerateSources = runGenerateSources;
            _resultValue.schedule = schedule;
            _resultValue.selfDeferring = selfDeferring;
            _resultValue.settings = settings;
            _resultValue.timeoutSeconds = timeoutSeconds;
            _resultValue.triggers = triggers;
            _resultValue.triggersOnDraftPr = triggersOnDraftPr;
            return _resultValue;
        }
    }
}
