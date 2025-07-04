// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProjectRepository {
    /**
     * @return Repository ID
     * 
     */
    private Integer id;
    /**
     * @return URL template for PRs
     * 
     */
    private String pullRequestUrlTemplate;
    /**
     * @return URL of the git repo remote
     * 
     */
    private String remoteUrl;

    private GetProjectRepository() {}
    /**
     * @return Repository ID
     * 
     */
    public Integer id() {
        return this.id;
    }
    /**
     * @return URL template for PRs
     * 
     */
    public String pullRequestUrlTemplate() {
        return this.pullRequestUrlTemplate;
    }
    /**
     * @return URL of the git repo remote
     * 
     */
    public String remoteUrl() {
        return this.remoteUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectRepository defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer id;
        private String pullRequestUrlTemplate;
        private String remoteUrl;
        public Builder() {}
        public Builder(GetProjectRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.pullRequestUrlTemplate = defaults.pullRequestUrlTemplate;
    	      this.remoteUrl = defaults.remoteUrl;
        }

        @CustomType.Setter
        public Builder id(Integer id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetProjectRepository", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder pullRequestUrlTemplate(String pullRequestUrlTemplate) {
            if (pullRequestUrlTemplate == null) {
              throw new MissingRequiredPropertyException("GetProjectRepository", "pullRequestUrlTemplate");
            }
            this.pullRequestUrlTemplate = pullRequestUrlTemplate;
            return this;
        }
        @CustomType.Setter
        public Builder remoteUrl(String remoteUrl) {
            if (remoteUrl == null) {
              throw new MissingRequiredPropertyException("GetProjectRepository", "remoteUrl");
            }
            this.remoteUrl = remoteUrl;
            return this;
        }
        public GetProjectRepository build() {
            final var _resultValue = new GetProjectRepository();
            _resultValue.id = id;
            _resultValue.pullRequestUrlTemplate = pullRequestUrlTemplate;
            _resultValue.remoteUrl = remoteUrl;
            return _resultValue;
        }
    }
}
