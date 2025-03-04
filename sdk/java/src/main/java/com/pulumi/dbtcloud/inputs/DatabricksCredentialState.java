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


public final class DatabricksCredentialState extends com.pulumi.resources.ResourceArgs {

    public static final DatabricksCredentialState Empty = new DatabricksCredentialState();

    /**
     * Databricks adapter ID for the credential (do not fill in when using global connections, only to be used for connections created with the legacy connection resource `dbtcloud.Connection`)
     * 
     */
    @Import(name="adapterId")
    private @Nullable Output<Integer> adapterId;

    /**
     * @return Databricks adapter ID for the credential (do not fill in when using global connections, only to be used for connections created with the legacy connection resource `dbtcloud.Connection`)
     * 
     */
    public Optional<Output<Integer>> adapterId() {
        return Optional.ofNullable(this.adapterId);
    }

    /**
     * The type of the adapter (databricks or spark)
     * 
     */
    @Import(name="adapterType")
    private @Nullable Output<String> adapterType;

    /**
     * @return The type of the adapter (databricks or spark)
     * 
     */
    public Optional<Output<String>> adapterType() {
        return Optional.ofNullable(this.adapterType);
    }

    /**
     * The catalog where to create models (only for the databricks adapter)
     * 
     */
    @Import(name="catalog")
    private @Nullable Output<String> catalog;

    /**
     * @return The catalog where to create models (only for the databricks adapter)
     * 
     */
    public Optional<Output<String>> catalog() {
        return Optional.ofNullable(this.catalog);
    }

    /**
     * The system Databricks credential ID
     * 
     */
    @Import(name="credentialId")
    private @Nullable Output<Integer> credentialId;

    /**
     * @return The system Databricks credential ID
     * 
     */
    public Optional<Output<Integer>> credentialId() {
        return Optional.ofNullable(this.credentialId);
    }

    /**
     * Project ID to create the Databricks credential in
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<Integer> projectId;

    /**
     * @return Project ID to create the Databricks credential in
     * 
     */
    public Optional<Output<Integer>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The schema where to create models
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return The schema where to create models
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Target name
     * 
     * @deprecated
     * This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.
     * 
     */
    @Deprecated /* This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables. */
    @Import(name="targetName")
    private @Nullable Output<String> targetName;

    /**
     * @return Target name
     * 
     * @deprecated
     * This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.
     * 
     */
    @Deprecated /* This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables. */
    public Optional<Output<String>> targetName() {
        return Optional.ofNullable(this.targetName);
    }

    /**
     * Token for Databricks user
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return Token for Databricks user
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    private DatabricksCredentialState() {}

    private DatabricksCredentialState(DatabricksCredentialState $) {
        this.adapterId = $.adapterId;
        this.adapterType = $.adapterType;
        this.catalog = $.catalog;
        this.credentialId = $.credentialId;
        this.projectId = $.projectId;
        this.schema = $.schema;
        this.targetName = $.targetName;
        this.token = $.token;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabricksCredentialState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabricksCredentialState $;

        public Builder() {
            $ = new DatabricksCredentialState();
        }

        public Builder(DatabricksCredentialState defaults) {
            $ = new DatabricksCredentialState(Objects.requireNonNull(defaults));
        }

        /**
         * @param adapterId Databricks adapter ID for the credential (do not fill in when using global connections, only to be used for connections created with the legacy connection resource `dbtcloud.Connection`)
         * 
         * @return builder
         * 
         */
        public Builder adapterId(@Nullable Output<Integer> adapterId) {
            $.adapterId = adapterId;
            return this;
        }

        /**
         * @param adapterId Databricks adapter ID for the credential (do not fill in when using global connections, only to be used for connections created with the legacy connection resource `dbtcloud.Connection`)
         * 
         * @return builder
         * 
         */
        public Builder adapterId(Integer adapterId) {
            return adapterId(Output.of(adapterId));
        }

        /**
         * @param adapterType The type of the adapter (databricks or spark)
         * 
         * @return builder
         * 
         */
        public Builder adapterType(@Nullable Output<String> adapterType) {
            $.adapterType = adapterType;
            return this;
        }

        /**
         * @param adapterType The type of the adapter (databricks or spark)
         * 
         * @return builder
         * 
         */
        public Builder adapterType(String adapterType) {
            return adapterType(Output.of(adapterType));
        }

        /**
         * @param catalog The catalog where to create models (only for the databricks adapter)
         * 
         * @return builder
         * 
         */
        public Builder catalog(@Nullable Output<String> catalog) {
            $.catalog = catalog;
            return this;
        }

        /**
         * @param catalog The catalog where to create models (only for the databricks adapter)
         * 
         * @return builder
         * 
         */
        public Builder catalog(String catalog) {
            return catalog(Output.of(catalog));
        }

        /**
         * @param credentialId The system Databricks credential ID
         * 
         * @return builder
         * 
         */
        public Builder credentialId(@Nullable Output<Integer> credentialId) {
            $.credentialId = credentialId;
            return this;
        }

        /**
         * @param credentialId The system Databricks credential ID
         * 
         * @return builder
         * 
         */
        public Builder credentialId(Integer credentialId) {
            return credentialId(Output.of(credentialId));
        }

        /**
         * @param projectId Project ID to create the Databricks credential in
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID to create the Databricks credential in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param schema The schema where to create models
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema The schema where to create models
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param targetName Target name
         * 
         * @return builder
         * 
         * @deprecated
         * This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.
         * 
         */
        @Deprecated /* This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables. */
        public Builder targetName(@Nullable Output<String> targetName) {
            $.targetName = targetName;
            return this;
        }

        /**
         * @param targetName Target name
         * 
         * @return builder
         * 
         * @deprecated
         * This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables.
         * 
         */
        @Deprecated /* This field is deprecated at the environment level (it was never possible to set it in the UI) and will be removed in a future release. Please remove it and set the target name at the job level or leverage environment variables. */
        public Builder targetName(String targetName) {
            return targetName(Output.of(targetName));
        }

        /**
         * @param token Token for Databricks user
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token Token for Databricks user
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        public DatabricksCredentialState build() {
            return $;
        }
    }

}
