// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetBigQueryConnectionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBigQueryConnectionPlainArgs Empty = new GetBigQueryConnectionPlainArgs();

    /**
     * Connection Identifier
     * 
     */
    @Import(name="connectionId", required=true)
    private Integer connectionId;

    /**
     * @return Connection Identifier
     * 
     */
    public Integer connectionId() {
        return this.connectionId;
    }

    /**
     * Project ID to create the connection in
     * 
     */
    @Import(name="projectId", required=true)
    private Integer projectId;

    /**
     * @return Project ID to create the connection in
     * 
     */
    public Integer projectId() {
        return this.projectId;
    }

    private GetBigQueryConnectionPlainArgs() {}

    private GetBigQueryConnectionPlainArgs(GetBigQueryConnectionPlainArgs $) {
        this.connectionId = $.connectionId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBigQueryConnectionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBigQueryConnectionPlainArgs $;

        public Builder() {
            $ = new GetBigQueryConnectionPlainArgs();
        }

        public Builder(GetBigQueryConnectionPlainArgs defaults) {
            $ = new GetBigQueryConnectionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId Connection Identifier
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Integer connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param projectId Project ID to create the connection in
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetBigQueryConnectionPlainArgs build() {
            if ($.connectionId == null) {
                throw new MissingRequiredPropertyException("GetBigQueryConnectionPlainArgs", "connectionId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("GetBigQueryConnectionPlainArgs", "projectId");
            }
            return $;
        }
    }

}