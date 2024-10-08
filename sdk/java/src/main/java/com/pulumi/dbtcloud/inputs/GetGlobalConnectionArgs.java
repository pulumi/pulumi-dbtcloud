// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.util.Objects;


public final class GetGlobalConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalConnectionArgs Empty = new GetGlobalConnectionArgs();

    /**
     * Connection Identifier
     * 
     */
    @Import(name="id", required=true)
    private Output<Integer> id;

    /**
     * @return Connection Identifier
     * 
     */
    public Output<Integer> id() {
        return this.id;
    }

    private GetGlobalConnectionArgs() {}

    private GetGlobalConnectionArgs(GetGlobalConnectionArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalConnectionArgs $;

        public Builder() {
            $ = new GetGlobalConnectionArgs();
        }

        public Builder(GetGlobalConnectionArgs defaults) {
            $ = new GetGlobalConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Connection Identifier
         * 
         * @return builder
         * 
         */
        public Builder id(Output<Integer> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Connection Identifier
         * 
         * @return builder
         * 
         */
        public Builder id(Integer id) {
            return id(Output.of(id));
        }

        public GetGlobalConnectionArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("GetGlobalConnectionArgs", "id");
            }
            return $;
        }
    }

}
