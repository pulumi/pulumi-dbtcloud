// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class ProjectConnectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectConnectionArgs Empty = new ProjectConnectionArgs();

    /**
     * Connection ID
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<Integer> connectionId;

    /**
     * @return Connection ID
     * 
     */
    public Output<Integer> connectionId() {
        return this.connectionId;
    }

    /**
     * Project ID
     * 
     */
    @Import(name="projectId", required=true)
    private Output<Integer> projectId;

    /**
     * @return Project ID
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }

    private ProjectConnectionArgs() {}

    private ProjectConnectionArgs(ProjectConnectionArgs $) {
        this.connectionId = $.connectionId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectConnectionArgs $;

        public Builder() {
            $ = new ProjectConnectionArgs();
        }

        public Builder(ProjectConnectionArgs defaults) {
            $ = new ProjectConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionId Connection ID
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<Integer> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId Connection ID
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Integer connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param projectId Project ID
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project ID
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        public ProjectConnectionArgs build() {
            if ($.connectionId == null) {
                throw new MissingRequiredPropertyException("ProjectConnectionArgs", "connectionId");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("ProjectConnectionArgs", "projectId");
            }
            return $;
        }
    }

}