// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTriggers {
    /**
     * @return Whether the job runs automatically on PR creation
     * 
     */
    private @Nullable Boolean gitProviderWebhook;
    /**
     * @return Whether the job runs automatically on PR creation
     * 
     */
    private @Nullable Boolean githubWebhook;
    /**
     * @return Whether the job runs automatically once a PR is merged
     * 
     */
    private @Nullable Boolean onMerge;
    /**
     * @return Whether the job runs on a schedule
     * 
     */
    private @Nullable Boolean schedule;

    private JobTriggers() {}
    /**
     * @return Whether the job runs automatically on PR creation
     * 
     */
    public Optional<Boolean> gitProviderWebhook() {
        return Optional.ofNullable(this.gitProviderWebhook);
    }
    /**
     * @return Whether the job runs automatically on PR creation
     * 
     */
    public Optional<Boolean> githubWebhook() {
        return Optional.ofNullable(this.githubWebhook);
    }
    /**
     * @return Whether the job runs automatically once a PR is merged
     * 
     */
    public Optional<Boolean> onMerge() {
        return Optional.ofNullable(this.onMerge);
    }
    /**
     * @return Whether the job runs on a schedule
     * 
     */
    public Optional<Boolean> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTriggers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean gitProviderWebhook;
        private @Nullable Boolean githubWebhook;
        private @Nullable Boolean onMerge;
        private @Nullable Boolean schedule;
        public Builder() {}
        public Builder(JobTriggers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gitProviderWebhook = defaults.gitProviderWebhook;
    	      this.githubWebhook = defaults.githubWebhook;
    	      this.onMerge = defaults.onMerge;
    	      this.schedule = defaults.schedule;
        }

        @CustomType.Setter
        public Builder gitProviderWebhook(@Nullable Boolean gitProviderWebhook) {

            this.gitProviderWebhook = gitProviderWebhook;
            return this;
        }
        @CustomType.Setter
        public Builder githubWebhook(@Nullable Boolean githubWebhook) {

            this.githubWebhook = githubWebhook;
            return this;
        }
        @CustomType.Setter
        public Builder onMerge(@Nullable Boolean onMerge) {

            this.onMerge = onMerge;
            return this;
        }
        @CustomType.Setter
        public Builder schedule(@Nullable Boolean schedule) {

            this.schedule = schedule;
            return this;
        }
        public JobTriggers build() {
            final var _resultValue = new JobTriggers();
            _resultValue.gitProviderWebhook = gitProviderWebhook;
            _resultValue.githubWebhook = githubWebhook;
            _resultValue.onMerge = onMerge;
            _resultValue.schedule = schedule;
            return _resultValue;
        }
    }
}
