// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.dbtcloud.outputs.GetJobsJobEnvironment;
import com.pulumi.dbtcloud.outputs.GetJobsJobExecution;
import com.pulumi.dbtcloud.outputs.GetJobsJobJobCompletionTriggerCondition;
import com.pulumi.dbtcloud.outputs.GetJobsJobSchedule;
import com.pulumi.dbtcloud.outputs.GetJobsJobSettings;
import com.pulumi.dbtcloud.outputs.GetJobsJobTriggers;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetJobsJob {
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
    private Integer deferringJobDefinitionId;
    /**
     * @return The description of the job
     * 
     */
    private String description;
    /**
     * @return Details of the environment the job is running in
     * 
     */
    private GetJobsJobEnvironment environment;
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
    private GetJobsJobExecution execution;
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
     * @return Whether the job is triggered by the completion of another job
     * 
     */
    private GetJobsJobJobCompletionTriggerCondition jobCompletionTriggerCondition;
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
    private GetJobsJobSchedule schedule;
    private GetJobsJobSettings settings;
    /**
     * @return [Deprectated - Moved to execution.timeout_seconds] Number of seconds before the job times out
     * 
     * @deprecated
     * Moved to execution.timeout_seconds
     * 
     */
    @Deprecated /* Moved to execution.timeout_seconds */
    private Integer timeoutSeconds;
    private GetJobsJobTriggers triggers;
    /**
     * @return Whether the CI job should be automatically triggered on draft PRs
     * 
     */
    private Boolean triggersOnDraftPr;

    private GetJobsJob() {}
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
    public Integer deferringJobDefinitionId() {
        return this.deferringJobDefinitionId;
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
    public GetJobsJobEnvironment environment() {
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
    public GetJobsJobExecution execution() {
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
     * @return Whether the job is triggered by the completion of another job
     * 
     */
    public GetJobsJobJobCompletionTriggerCondition jobCompletionTriggerCondition() {
        return this.jobCompletionTriggerCondition;
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
    public GetJobsJobSchedule schedule() {
        return this.schedule;
    }
    public GetJobsJobSettings settings() {
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
    public GetJobsJobTriggers triggers() {
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

    public static Builder builder(GetJobsJob defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dbtVersion;
        private Integer deferringEnvironmentId;
        private Integer deferringJobDefinitionId;
        private String description;
        private GetJobsJobEnvironment environment;
        private Integer environmentId;
        private List<String> executeSteps;
        private GetJobsJobExecution execution;
        private Boolean generateDocs;
        private Integer id;
        private GetJobsJobJobCompletionTriggerCondition jobCompletionTriggerCondition;
        private Integer jobId;
        private String jobType;
        private String name;
        private Integer projectId;
        private Boolean runCompareChanges;
        private Boolean runGenerateSources;
        private GetJobsJobSchedule schedule;
        private GetJobsJobSettings settings;
        private Integer timeoutSeconds;
        private GetJobsJobTriggers triggers;
        private Boolean triggersOnDraftPr;
        public Builder() {}
        public Builder(GetJobsJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbtVersion = defaults.dbtVersion;
    	      this.deferringEnvironmentId = defaults.deferringEnvironmentId;
    	      this.deferringJobDefinitionId = defaults.deferringJobDefinitionId;
    	      this.description = defaults.description;
    	      this.environment = defaults.environment;
    	      this.environmentId = defaults.environmentId;
    	      this.executeSteps = defaults.executeSteps;
    	      this.execution = defaults.execution;
    	      this.generateDocs = defaults.generateDocs;
    	      this.id = defaults.id;
    	      this.jobCompletionTriggerCondition = defaults.jobCompletionTriggerCondition;
    	      this.jobId = defaults.jobId;
    	      this.jobType = defaults.jobType;
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
    	      this.runCompareChanges = defaults.runCompareChanges;
    	      this.runGenerateSources = defaults.runGenerateSources;
    	      this.schedule = defaults.schedule;
    	      this.settings = defaults.settings;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
    	      this.triggers = defaults.triggers;
    	      this.triggersOnDraftPr = defaults.triggersOnDraftPr;
        }

        @CustomType.Setter
        public Builder dbtVersion(String dbtVersion) {
            if (dbtVersion == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "dbtVersion");
            }
            this.dbtVersion = dbtVersion;
            return this;
        }
        @CustomType.Setter
        public Builder deferringEnvironmentId(Integer deferringEnvironmentId) {
            if (deferringEnvironmentId == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "deferringEnvironmentId");
            }
            this.deferringEnvironmentId = deferringEnvironmentId;
            return this;
        }
        @CustomType.Setter
        public Builder deferringJobDefinitionId(Integer deferringJobDefinitionId) {
            if (deferringJobDefinitionId == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "deferringJobDefinitionId");
            }
            this.deferringJobDefinitionId = deferringJobDefinitionId;
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            if (description == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder environment(GetJobsJobEnvironment environment) {
            if (environment == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "environment");
            }
            this.environment = environment;
            return this;
        }
        @CustomType.Setter
        public Builder environmentId(Integer environmentId) {
            if (environmentId == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "environmentId");
            }
            this.environmentId = environmentId;
            return this;
        }
        @CustomType.Setter
        public Builder executeSteps(List<String> executeSteps) {
            if (executeSteps == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "executeSteps");
            }
            this.executeSteps = executeSteps;
            return this;
        }
        public Builder executeSteps(String... executeSteps) {
            return executeSteps(List.of(executeSteps));
        }
        @CustomType.Setter
        public Builder execution(GetJobsJobExecution execution) {
            if (execution == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "execution");
            }
            this.execution = execution;
            return this;
        }
        @CustomType.Setter
        public Builder generateDocs(Boolean generateDocs) {
            if (generateDocs == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "generateDocs");
            }
            this.generateDocs = generateDocs;
            return this;
        }
        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder jobCompletionTriggerCondition(GetJobsJobJobCompletionTriggerCondition jobCompletionTriggerCondition) {
            if (jobCompletionTriggerCondition == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "jobCompletionTriggerCondition");
            }
            this.jobCompletionTriggerCondition = jobCompletionTriggerCondition;
            return this;
        }
        @CustomType.Setter
        public Builder jobId(Integer jobId) {
            if (jobId == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "jobId");
            }
            this.jobId = jobId;
            return this;
        }
        @CustomType.Setter
        public Builder jobType(String jobType) {
            if (jobType == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "jobType");
            }
            this.jobType = jobType;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(Integer projectId) {
            if (projectId == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "projectId");
            }
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder runCompareChanges(Boolean runCompareChanges) {
            if (runCompareChanges == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "runCompareChanges");
            }
            this.runCompareChanges = runCompareChanges;
            return this;
        }
        @CustomType.Setter
        public Builder runGenerateSources(Boolean runGenerateSources) {
            if (runGenerateSources == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "runGenerateSources");
            }
            this.runGenerateSources = runGenerateSources;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(GetJobsJobSchedule schedule) {
            if (schedule == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "schedule");
            }
            this.schedule = schedule;
            return this;
        }
        @CustomType.Setter
        public Builder settings(GetJobsJobSettings settings) {
            if (settings == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "settings");
            }
            this.settings = settings;
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            if (timeoutSeconds == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "timeoutSeconds");
            }
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }
        @CustomType.Setter
        public Builder triggers(GetJobsJobTriggers triggers) {
            if (triggers == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "triggers");
            }
            this.triggers = triggers;
            return this;
        }
        @CustomType.Setter
        public Builder triggersOnDraftPr(Boolean triggersOnDraftPr) {
            if (triggersOnDraftPr == null) {
              throw new MissingRequiredPropertyException("GetJobsJob", "triggersOnDraftPr");
            }
            this.triggersOnDraftPr = triggersOnDraftPr;
            return this;
        }
        public GetJobsJob build() {
            final var _resultValue = new GetJobsJob();
            _resultValue.dbtVersion = dbtVersion;
            _resultValue.deferringEnvironmentId = deferringEnvironmentId;
            _resultValue.deferringJobDefinitionId = deferringJobDefinitionId;
            _resultValue.description = description;
            _resultValue.environment = environment;
            _resultValue.environmentId = environmentId;
            _resultValue.executeSteps = executeSteps;
            _resultValue.execution = execution;
            _resultValue.generateDocs = generateDocs;
            _resultValue.id = id;
            _resultValue.jobCompletionTriggerCondition = jobCompletionTriggerCondition;
            _resultValue.jobId = jobId;
            _resultValue.jobType = jobType;
            _resultValue.name = name;
            _resultValue.projectId = projectId;
            _resultValue.runCompareChanges = runCompareChanges;
            _resultValue.runGenerateSources = runGenerateSources;
            _resultValue.schedule = schedule;
            _resultValue.settings = settings;
            _resultValue.timeoutSeconds = timeoutSeconds;
            _resultValue.triggers = triggers;
            _resultValue.triggersOnDraftPr = triggersOnDraftPr;
            return _resultValue;
        }
    }
}
