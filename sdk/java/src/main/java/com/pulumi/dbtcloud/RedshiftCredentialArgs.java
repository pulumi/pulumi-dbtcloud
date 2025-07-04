// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RedshiftCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedshiftCredentialArgs Empty = new RedshiftCredentialArgs();

    /**
     * Default schema name
     * 
     */
    @Import(name="defaultSchema", required=true)
    private Output<String> defaultSchema;

    /**
     * @return Default schema name
     * 
     */
    public Output<String> defaultSchema() {
        return this.defaultSchema;
    }

    /**
     * Whether the Redshift credential is active
     * 
     */
    @Import(name="isActive")
    private @Nullable Output<Boolean> isActive;

    /**
     * @return Whether the Redshift credential is active
     * 
     */
    public Optional<Output<Boolean>> isActive() {
        return Optional.ofNullable(this.isActive);
    }

    /**
     * Number of threads to use
     * 
     */
    @Import(name="numThreads", required=true)
    private Output<Integer> numThreads;

    /**
     * @return Number of threads to use
     * 
     */
    public Output<Integer> numThreads() {
        return this.numThreads;
    }

    /**
     * The password for the Redshift account
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The password for the Redshift account
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * Project ID to create the Redshift credential in
     * 
     */
    @Import(name="projectId", required=true)
    private Output<Integer> projectId;

    /**
     * @return Project ID to create the Redshift credential in
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }

    /**
     * The username for the Redshift account.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username for the Redshift account.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private RedshiftCredentialArgs() {}

    private RedshiftCredentialArgs(RedshiftCredentialArgs $) {
        this.defaultSchema = $.defaultSchema;
        this.isActive = $.isActive;
        this.numThreads = $.numThreads;
        this.password = $.password;
        this.projectId = $.projectId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedshiftCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedshiftCredentialArgs $;

        public Builder() {
            $ = new RedshiftCredentialArgs();
        }

        public Builder(RedshiftCredentialArgs defaults) {
            $ = new RedshiftCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultSchema Default schema name
         * 
         * @return builder
         * 
         */
        public Builder defaultSchema(Output<String> defaultSchema) {
            $.defaultSchema = defaultSchema;
            return this;
        }

        /**
         * @param defaultSchema Default schema name
         * 
         * @return builder
         * 
         */
        public Builder defaultSchema(String defaultSchema) {
            return defaultSchema(Output.of(defaultSchema));
        }

        /**
         * @param isActive Whether the Redshift credential is active
         * 
         * @return builder
         * 
         */
        public Builder isActive(@Nullable Output<Boolean> isActive) {
            $.isActive = isActive;
            return this;
        }

        /**
         * @param isActive Whether the Redshift credential is active
         * 
         * @return builder
         * 
         */
        public Builder isActive(Boolean isActive) {
            return isActive(Output.of(isActive));
        }

        /**
         * @param numThreads Number of threads to use
         * 
         * @return builder
         * 
         */
        public Builder numThreads(Output<Integer> numThreads) {
            $.numThreads = numThreads;
            return this;
        }

        /**
         * @param numThreads Number of threads to use
         * 
         * @return builder
         * 
         */
        public Builder numThreads(Integer numThreads) {
            return numThreads(Output.of(numThreads));
        }

        /**
         * @param password The password for the Redshift account
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The password for the Redshift account
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param projectId Project ID to create the Redshift credential in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID to create the Redshift credential in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param username The username for the Redshift account.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username for the Redshift account.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public RedshiftCredentialArgs build() {
            if ($.defaultSchema == null) {
                throw new MissingRequiredPropertyException("RedshiftCredentialArgs", "defaultSchema");
            }
            if ($.numThreads == null) {
                throw new MissingRequiredPropertyException("RedshiftCredentialArgs", "numThreads");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("RedshiftCredentialArgs", "projectId");
            }
            return $;
        }
    }

}
