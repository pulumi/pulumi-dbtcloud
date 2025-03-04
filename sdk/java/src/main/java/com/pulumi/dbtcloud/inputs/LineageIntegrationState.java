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


public final class LineageIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final LineageIntegrationState Empty = new LineageIntegrationState();

    /**
     * The URL of the BI server (see docs for more details)
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    /**
     * @return The URL of the BI server (see docs for more details)
     * 
     */
    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The ID of the lineage integration
     * 
     */
    @Import(name="lineageIntegrationId")
    private @Nullable Output<Integer> lineageIntegrationId;

    /**
     * @return The ID of the lineage integration
     * 
     */
    public Optional<Output<Integer>> lineageIntegrationId() {
        return Optional.ofNullable(this.lineageIntegrationId);
    }

    /**
     * The integration type. Today only &#39;tableau&#39; is supported
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The integration type. Today only &#39;tableau&#39; is supported
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The dbt Cloud project ID for the integration
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<Integer> projectId;

    /**
     * @return The dbt Cloud project ID for the integration
     * 
     */
    public Optional<Output<Integer>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The sitename for the collections of dashboards (see docs for more details)
     * 
     */
    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    /**
     * @return The sitename for the collections of dashboards (see docs for more details)
     * 
     */
    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    /**
     * The secret token value to use to authenticate to the BI server
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return The secret token value to use to authenticate to the BI server
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * The token to use to authenticate to the BI server
     * 
     */
    @Import(name="tokenName")
    private @Nullable Output<String> tokenName;

    /**
     * @return The token to use to authenticate to the BI server
     * 
     */
    public Optional<Output<String>> tokenName() {
        return Optional.ofNullable(this.tokenName);
    }

    private LineageIntegrationState() {}

    private LineageIntegrationState(LineageIntegrationState $) {
        this.host = $.host;
        this.lineageIntegrationId = $.lineageIntegrationId;
        this.name = $.name;
        this.projectId = $.projectId;
        this.siteId = $.siteId;
        this.token = $.token;
        this.tokenName = $.tokenName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LineageIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LineageIntegrationState $;

        public Builder() {
            $ = new LineageIntegrationState();
        }

        public Builder(LineageIntegrationState defaults) {
            $ = new LineageIntegrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param host The URL of the BI server (see docs for more details)
         * 
         * @return builder
         * 
         */
        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        /**
         * @param host The URL of the BI server (see docs for more details)
         * 
         * @return builder
         * 
         */
        public Builder host(String host) {
            return host(Output.of(host));
        }

        /**
         * @param lineageIntegrationId The ID of the lineage integration
         * 
         * @return builder
         * 
         */
        public Builder lineageIntegrationId(@Nullable Output<Integer> lineageIntegrationId) {
            $.lineageIntegrationId = lineageIntegrationId;
            return this;
        }

        /**
         * @param lineageIntegrationId The ID of the lineage integration
         * 
         * @return builder
         * 
         */
        public Builder lineageIntegrationId(Integer lineageIntegrationId) {
            return lineageIntegrationId(Output.of(lineageIntegrationId));
        }

        /**
         * @param name The integration type. Today only &#39;tableau&#39; is supported
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The integration type. Today only &#39;tableau&#39; is supported
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param projectId The dbt Cloud project ID for the integration
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The dbt Cloud project ID for the integration
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param siteId The sitename for the collections of dashboards (see docs for more details)
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId The sitename for the collections of dashboards (see docs for more details)
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        /**
         * @param token The secret token value to use to authenticate to the BI server
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token The secret token value to use to authenticate to the BI server
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param tokenName The token to use to authenticate to the BI server
         * 
         * @return builder
         * 
         */
        public Builder tokenName(@Nullable Output<String> tokenName) {
            $.tokenName = tokenName;
            return this;
        }

        /**
         * @param tokenName The token to use to authenticate to the BI server
         * 
         * @return builder
         * 
         */
        public Builder tokenName(String tokenName) {
            return tokenName(Output.of(tokenName));
        }

        public LineageIntegrationState build() {
            return $;
        }
    }

}
