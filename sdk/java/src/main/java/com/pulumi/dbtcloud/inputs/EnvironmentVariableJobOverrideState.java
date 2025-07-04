// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentVariableJobOverrideState extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentVariableJobOverrideState Empty = new EnvironmentVariableJobOverrideState();

    /**
     * The account id
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The account id
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The internal ID of this resource. Contains the project ID and the environment variable job override ID.
     * 
     */
    @Import(name="environmentVariableJobOverrideId")
    private @Nullable Output<Integer> environmentVariableJobOverrideId;

    /**
     * @return The internal ID of this resource. Contains the project ID and the environment variable job override ID.
     * 
     */
    public Optional<Output<Integer>> environmentVariableJobOverrideId() {
        return Optional.ofNullable(this.environmentVariableJobOverrideId);
    }

    /**
     * The job ID for which the environment variable is being overridden
     * 
     */
    @Import(name="jobDefinitionId")
    private @Nullable Output<Integer> jobDefinitionId;

    /**
     * @return The job ID for which the environment variable is being overridden
     * 
     */
    public Optional<Output<Integer>> jobDefinitionId() {
        return Optional.ofNullable(this.jobDefinitionId);
    }

    /**
     * The environment variable name to override
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The environment variable name to override
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Project ID to create the environment variable job override in
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<Integer> projectId;

    /**
     * @return Project ID to create the environment variable job override in
     * 
     */
    public Optional<Output<Integer>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The value for the override of the environment variable
     * 
     */
    @Import(name="rawValue")
    private @Nullable Output<String> rawValue;

    /**
     * @return The value for the override of the environment variable
     * 
     */
    public Optional<Output<String>> rawValue() {
        return Optional.ofNullable(this.rawValue);
    }

    private EnvironmentVariableJobOverrideState() {}

    private EnvironmentVariableJobOverrideState(EnvironmentVariableJobOverrideState $) {
        this.accountId = $.accountId;
        this.environmentVariableJobOverrideId = $.environmentVariableJobOverrideId;
        this.jobDefinitionId = $.jobDefinitionId;
        this.name = $.name;
        this.projectId = $.projectId;
        this.rawValue = $.rawValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentVariableJobOverrideState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentVariableJobOverrideState $;

        public Builder() {
            $ = new EnvironmentVariableJobOverrideState();
        }

        public Builder(EnvironmentVariableJobOverrideState defaults) {
            $ = new EnvironmentVariableJobOverrideState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account id
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account id
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param environmentVariableJobOverrideId The internal ID of this resource. Contains the project ID and the environment variable job override ID.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariableJobOverrideId(@Nullable Output<Integer> environmentVariableJobOverrideId) {
            $.environmentVariableJobOverrideId = environmentVariableJobOverrideId;
            return this;
        }

        /**
         * @param environmentVariableJobOverrideId The internal ID of this resource. Contains the project ID and the environment variable job override ID.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariableJobOverrideId(Integer environmentVariableJobOverrideId) {
            return environmentVariableJobOverrideId(Output.of(environmentVariableJobOverrideId));
        }

        /**
         * @param jobDefinitionId The job ID for which the environment variable is being overridden
         * 
         * @return builder
         * 
         */
        public Builder jobDefinitionId(@Nullable Output<Integer> jobDefinitionId) {
            $.jobDefinitionId = jobDefinitionId;
            return this;
        }

        /**
         * @param jobDefinitionId The job ID for which the environment variable is being overridden
         * 
         * @return builder
         * 
         */
        public Builder jobDefinitionId(Integer jobDefinitionId) {
            return jobDefinitionId(Output.of(jobDefinitionId));
        }

        /**
         * @param name The environment variable name to override
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The environment variable name to override
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId Project ID to create the environment variable job override in
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID to create the environment variable job override in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param rawValue The value for the override of the environment variable
         * 
         * @return builder
         * 
         */
        public Builder rawValue(@Nullable Output<String> rawValue) {
            $.rawValue = rawValue;
            return this;
        }

        /**
         * @param rawValue The value for the override of the environment variable
         * 
         * @return builder
         * 
         */
        public Builder rawValue(String rawValue) {
            return rawValue(Output.of(rawValue));
        }

        public EnvironmentVariableJobOverrideState build() {
            return $;
        }
    }

}
