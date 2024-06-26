// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PartialLicenseMapState extends com.pulumi.resources.ResourceArgs {

    public static final PartialLicenseMapState Empty = new PartialLicenseMapState();

    /**
     * The license type to update
     * 
     */
    @Import(name="licenseType")
    private @Nullable Output<String> licenseType;

    /**
     * @return The license type to update
     * 
     */
    public Optional<Output<String>> licenseType() {
        return Optional.ofNullable(this.licenseType);
    }

    /**
     * List of SSO groups to map to the license type.
     * 
     */
    @Import(name="ssoLicenseMappingGroups")
    private @Nullable Output<List<String>> ssoLicenseMappingGroups;

    /**
     * @return List of SSO groups to map to the license type.
     * 
     */
    public Optional<Output<List<String>>> ssoLicenseMappingGroups() {
        return Optional.ofNullable(this.ssoLicenseMappingGroups);
    }

    private PartialLicenseMapState() {}

    private PartialLicenseMapState(PartialLicenseMapState $) {
        this.licenseType = $.licenseType;
        this.ssoLicenseMappingGroups = $.ssoLicenseMappingGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartialLicenseMapState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartialLicenseMapState $;

        public Builder() {
            $ = new PartialLicenseMapState();
        }

        public Builder(PartialLicenseMapState defaults) {
            $ = new PartialLicenseMapState(Objects.requireNonNull(defaults));
        }

        /**
         * @param licenseType The license type to update
         * 
         * @return builder
         * 
         */
        public Builder licenseType(@Nullable Output<String> licenseType) {
            $.licenseType = licenseType;
            return this;
        }

        /**
         * @param licenseType The license type to update
         * 
         * @return builder
         * 
         */
        public Builder licenseType(String licenseType) {
            return licenseType(Output.of(licenseType));
        }

        /**
         * @param ssoLicenseMappingGroups List of SSO groups to map to the license type.
         * 
         * @return builder
         * 
         */
        public Builder ssoLicenseMappingGroups(@Nullable Output<List<String>> ssoLicenseMappingGroups) {
            $.ssoLicenseMappingGroups = ssoLicenseMappingGroups;
            return this;
        }

        /**
         * @param ssoLicenseMappingGroups List of SSO groups to map to the license type.
         * 
         * @return builder
         * 
         */
        public Builder ssoLicenseMappingGroups(List<String> ssoLicenseMappingGroups) {
            return ssoLicenseMappingGroups(Output.of(ssoLicenseMappingGroups));
        }

        /**
         * @param ssoLicenseMappingGroups List of SSO groups to map to the license type.
         * 
         * @return builder
         * 
         */
        public Builder ssoLicenseMappingGroups(String... ssoLicenseMappingGroups) {
            return ssoLicenseMappingGroups(List.of(ssoLicenseMappingGroups));
        }

        public PartialLicenseMapState build() {
            return $;
        }
    }

}
