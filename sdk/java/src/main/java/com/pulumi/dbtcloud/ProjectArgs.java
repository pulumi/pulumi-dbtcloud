// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * dbt project subdirectory path
     * 
     */
    @Import(name="dbtProjectSubdirectory")
    private @Nullable Output<String> dbtProjectSubdirectory;

    /**
     * @return dbt project subdirectory path
     * 
     */
    public Optional<Output<String>> dbtProjectSubdirectory() {
        return Optional.ofNullable(this.dbtProjectSubdirectory);
    }

    /**
     * Project name
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Project name
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.dbtProjectSubdirectory = $.dbtProjectSubdirectory;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbtProjectSubdirectory dbt project subdirectory path
         * 
         * @return builder
         * 
         */
        public Builder dbtProjectSubdirectory(@Nullable Output<String> dbtProjectSubdirectory) {
            $.dbtProjectSubdirectory = dbtProjectSubdirectory;
            return this;
        }

        /**
         * @param dbtProjectSubdirectory dbt project subdirectory path
         * 
         * @return builder
         * 
         */
        public Builder dbtProjectSubdirectory(String dbtProjectSubdirectory) {
            return dbtProjectSubdirectory(Output.of(dbtProjectSubdirectory));
        }

        /**
         * @param name Project name
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Project name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ProjectArgs build() {
            return $;
        }
    }

}
