// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountFeaturesState extends com.pulumi.resources.ResourceArgs {

    public static final AccountFeaturesState Empty = new AccountFeaturesState();

    /**
     * Whether advanced CI is enabled.
     * 
     */
    @Import(name="advancedCi")
    private @Nullable Output<Boolean> advancedCi;

    /**
     * @return Whether advanced CI is enabled.
     * 
     */
    public Optional<Output<Boolean>> advancedCi() {
        return Optional.ofNullable(this.advancedCi);
    }

    /**
     * Whether AI features are enabled.
     * 
     */
    @Import(name="aiFeatures")
    private @Nullable Output<Boolean> aiFeatures;

    /**
     * @return Whether AI features are enabled.
     * 
     */
    public Optional<Output<Boolean>> aiFeatures() {
        return Optional.ofNullable(this.aiFeatures);
    }

    /**
     * Whether partial parsing is enabled.
     * 
     */
    @Import(name="partialParsing")
    private @Nullable Output<Boolean> partialParsing;

    /**
     * @return Whether partial parsing is enabled.
     * 
     */
    public Optional<Output<Boolean>> partialParsing() {
        return Optional.ofNullable(this.partialParsing);
    }

    /**
     * Whether repository caching is enabled.
     * 
     */
    @Import(name="repoCaching")
    private @Nullable Output<Boolean> repoCaching;

    /**
     * @return Whether repository caching is enabled.
     * 
     */
    public Optional<Output<Boolean>> repoCaching() {
        return Optional.ofNullable(this.repoCaching);
    }

    /**
     * Whether warehouse cost visibility is enabled.
     * 
     */
    @Import(name="warehouseCostVisibility")
    private @Nullable Output<Boolean> warehouseCostVisibility;

    /**
     * @return Whether warehouse cost visibility is enabled.
     * 
     */
    public Optional<Output<Boolean>> warehouseCostVisibility() {
        return Optional.ofNullable(this.warehouseCostVisibility);
    }

    private AccountFeaturesState() {}

    private AccountFeaturesState(AccountFeaturesState $) {
        this.advancedCi = $.advancedCi;
        this.aiFeatures = $.aiFeatures;
        this.partialParsing = $.partialParsing;
        this.repoCaching = $.repoCaching;
        this.warehouseCostVisibility = $.warehouseCostVisibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountFeaturesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountFeaturesState $;

        public Builder() {
            $ = new AccountFeaturesState();
        }

        public Builder(AccountFeaturesState defaults) {
            $ = new AccountFeaturesState(Objects.requireNonNull(defaults));
        }

        /**
         * @param advancedCi Whether advanced CI is enabled.
         * 
         * @return builder
         * 
         */
        public Builder advancedCi(@Nullable Output<Boolean> advancedCi) {
            $.advancedCi = advancedCi;
            return this;
        }

        /**
         * @param advancedCi Whether advanced CI is enabled.
         * 
         * @return builder
         * 
         */
        public Builder advancedCi(Boolean advancedCi) {
            return advancedCi(Output.of(advancedCi));
        }

        /**
         * @param aiFeatures Whether AI features are enabled.
         * 
         * @return builder
         * 
         */
        public Builder aiFeatures(@Nullable Output<Boolean> aiFeatures) {
            $.aiFeatures = aiFeatures;
            return this;
        }

        /**
         * @param aiFeatures Whether AI features are enabled.
         * 
         * @return builder
         * 
         */
        public Builder aiFeatures(Boolean aiFeatures) {
            return aiFeatures(Output.of(aiFeatures));
        }

        /**
         * @param partialParsing Whether partial parsing is enabled.
         * 
         * @return builder
         * 
         */
        public Builder partialParsing(@Nullable Output<Boolean> partialParsing) {
            $.partialParsing = partialParsing;
            return this;
        }

        /**
         * @param partialParsing Whether partial parsing is enabled.
         * 
         * @return builder
         * 
         */
        public Builder partialParsing(Boolean partialParsing) {
            return partialParsing(Output.of(partialParsing));
        }

        /**
         * @param repoCaching Whether repository caching is enabled.
         * 
         * @return builder
         * 
         */
        public Builder repoCaching(@Nullable Output<Boolean> repoCaching) {
            $.repoCaching = repoCaching;
            return this;
        }

        /**
         * @param repoCaching Whether repository caching is enabled.
         * 
         * @return builder
         * 
         */
        public Builder repoCaching(Boolean repoCaching) {
            return repoCaching(Output.of(repoCaching));
        }

        /**
         * @param warehouseCostVisibility Whether warehouse cost visibility is enabled.
         * 
         * @return builder
         * 
         */
        public Builder warehouseCostVisibility(@Nullable Output<Boolean> warehouseCostVisibility) {
            $.warehouseCostVisibility = warehouseCostVisibility;
            return this;
        }

        /**
         * @param warehouseCostVisibility Whether warehouse cost visibility is enabled.
         * 
         * @return builder
         * 
         */
        public Builder warehouseCostVisibility(Boolean warehouseCostVisibility) {
            return warehouseCostVisibility(Output.of(warehouseCostVisibility));
        }

        public AccountFeaturesState build() {
            return $;
        }
    }

}
