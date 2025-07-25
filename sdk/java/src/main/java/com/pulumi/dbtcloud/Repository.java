// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dbtcloud.RepositoryArgs;
import com.pulumi.dbtcloud.Utilities;
import com.pulumi.dbtcloud.inputs.RepositoryState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage connections to git repositories in dbt Cloud.
 * 
 * By itself, this resource won&#39;t show you the repository in the dbt Cloud UI.
 * You will need to also set up a `dbtcloud.ProjectRepository` resource as well to link your dbt Cloud project and the git repository.
 * 
 * In order to find the `github_installation_id`, you can log in to dbt Cloud, replace `&lt;dbt_cloud_url&gt;` by your dbt Cloud
 * URL and run the following commands in the Google Chrome console:
 * 
 * Alternatively, you can go to the page `https://&lt;dbt_cloud_url&gt;/api/v2/integrations/github/installations/` and read the
 * value of `id`  or use the `http` provider to retrieve it automatically like in the example below.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * using  import blocks (requires Terraform &gt;= 1.5)
 * 
 * import {
 * 
 *   to = dbtcloud_repository.my_repository
 * 
 *   id = &#34;project_id:repository_id&#34;
 * 
 * }
 * 
 * import {
 * 
 *   to = dbtcloud_repository.my_repository
 * 
 *   id = &#34;12345:6789&#34;
 * 
 * }
 * 
 * using the older import command
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/repository:Repository my_repository &#34;project_id:repository_id&#34;
 * ```
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/repository:Repository my_repository 12345:6789
 * ```
 * 
 */
@ResourceType(type="dbtcloud:index/repository:Repository")
public class Repository extends com.pulumi.resources.CustomResource {
    /**
     * The Azure Dev Ops project ID. It can be retrieved via the Azure API or using the data source `dbtcloud.getAzureDevOpsProject` and the project name - (for ADO native integration only)
     * 
     */
    @Export(name="azureActiveDirectoryProjectId", refs={String.class}, tree="[0]")
    private Output<String> azureActiveDirectoryProjectId;

    /**
     * @return The Azure Dev Ops project ID. It can be retrieved via the Azure API or using the data source `dbtcloud.getAzureDevOpsProject` and the project name - (for ADO native integration only)
     * 
     */
    public Output<String> azureActiveDirectoryProjectId() {
        return this.azureActiveDirectoryProjectId;
    }
    /**
     * The Azure Dev Ops repository ID. It can be retrieved via the Azure API or using the data source `dbtcloud.getAzureDevOpsRepository` along with the ADO Project ID and the repository name - (for ADO native integration only)
     * 
     */
    @Export(name="azureActiveDirectoryRepositoryId", refs={String.class}, tree="[0]")
    private Output<String> azureActiveDirectoryRepositoryId;

    /**
     * @return The Azure Dev Ops repository ID. It can be retrieved via the Azure API or using the data source `dbtcloud.getAzureDevOpsRepository` along with the ADO Project ID and the repository name - (for ADO native integration only)
     * 
     */
    public Output<String> azureActiveDirectoryRepositoryId() {
        return this.azureActiveDirectoryRepositoryId;
    }
    /**
     * If set to False (the default), the connection will fail if the service user doesn&#39;t have access to set webhooks (required for auto-triggering CI jobs). If set to True, the connection will be successful but no automated CI job will be triggered - (for ADO native integration only)
     * 
     */
    @Export(name="azureBypassWebhookRegistrationFailure", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> azureBypassWebhookRegistrationFailure;

    /**
     * @return If set to False (the default), the connection will fail if the service user doesn&#39;t have access to set webhooks (required for auto-triggering CI jobs). If set to True, the connection will be successful but no automated CI job will be triggered - (for ADO native integration only)
     * 
     */
    public Output<Boolean> azureBypassWebhookRegistrationFailure() {
        return this.azureBypassWebhookRegistrationFailure;
    }
    /**
     * Public key generated by dbt when using `deploy_key` clone strategy
     * 
     */
    @Export(name="deployKey", refs={String.class}, tree="[0]")
    private Output<String> deployKey;

    /**
     * @return Public key generated by dbt when using `deploy_key` clone strategy
     * 
     */
    public Output<String> deployKey() {
        return this.deployKey;
    }
    /**
     * Whether we should return the public deploy key - (for the `deploy_key` strategy)
     * 
     * @deprecated
     * This field is deprecated and will be removed in a future version of the provider, please remove it from your configuration. The key is always fetched when the clone strategy is `deploy_key`
     * 
     */
    @Deprecated /* This field is deprecated and will be removed in a future version of the provider, please remove it from your configuration. The key is always fetched when the clone strategy is `deploy_key` */
    @Export(name="fetchDeployKey", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> fetchDeployKey;

    /**
     * @return Whether we should return the public deploy key - (for the `deploy_key` strategy)
     * 
     */
    public Output<Boolean> fetchDeployKey() {
        return this.fetchDeployKey;
    }
    /**
     * Git clone strategy for the repository. Can be `deploy_key` (default) for cloning via SSH Deploy Key, `github_app` for GitHub native integration, `deploy_token` for the GitLab native integration and `azure_active_directory_app` for ADO native integration
     * 
     */
    @Export(name="gitCloneStrategy", refs={String.class}, tree="[0]")
    private Output<String> gitCloneStrategy;

    /**
     * @return Git clone strategy for the repository. Can be `deploy_key` (default) for cloning via SSH Deploy Key, `github_app` for GitHub native integration, `deploy_token` for the GitLab native integration and `azure_active_directory_app` for ADO native integration
     * 
     */
    public Output<String> gitCloneStrategy() {
        return this.gitCloneStrategy;
    }
    /**
     * Identifier for the GitHub App - (for GitHub native integration only)
     * 
     */
    @Export(name="githubInstallationId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> githubInstallationId;

    /**
     * @return Identifier for the GitHub App - (for GitHub native integration only)
     * 
     */
    public Output<Optional<Integer>> githubInstallationId() {
        return Codegen.optional(this.githubInstallationId);
    }
    /**
     * Identifier for the Gitlab project -  (for GitLab native integration only)
     * 
     */
    @Export(name="gitlabProjectId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> gitlabProjectId;

    /**
     * @return Identifier for the Gitlab project -  (for GitLab native integration only)
     * 
     */
    public Output<Optional<Integer>> gitlabProjectId() {
        return Codegen.optional(this.gitlabProjectId);
    }
    /**
     * Whether the repository is active
     * 
     */
    @Export(name="isActive", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isActive;

    /**
     * @return Whether the repository is active
     * 
     */
    public Output<Boolean> isActive() {
        return this.isActive;
    }
    /**
     * Identifier for the PrivateLink endpoint.
     * 
     */
    @Export(name="privateLinkEndpointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateLinkEndpointId;

    /**
     * @return Identifier for the PrivateLink endpoint.
     * 
     */
    public Output<Optional<String>> privateLinkEndpointId() {
        return Codegen.optional(this.privateLinkEndpointId);
    }
    /**
     * Project ID to create the repository in
     * 
     */
    @Export(name="projectId", refs={Integer.class}, tree="[0]")
    private Output<Integer> projectId;

    /**
     * @return Project ID to create the repository in
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }
    /**
     * URL template for creating a pull request. If it is not set, the default template will create a PR from the current branch to the branch configured in the Development environment.
     * 
     */
    @Export(name="pullRequestUrlTemplate", refs={String.class}, tree="[0]")
    private Output<String> pullRequestUrlTemplate;

    /**
     * @return URL template for creating a pull request. If it is not set, the default template will create a PR from the current branch to the branch configured in the Development environment.
     * 
     */
    public Output<String> pullRequestUrlTemplate() {
        return this.pullRequestUrlTemplate;
    }
    /**
     * Git URL for the repository or &lt;Group&gt;/&lt;Project&gt; for Gitlab
     * 
     */
    @Export(name="remoteUrl", refs={String.class}, tree="[0]")
    private Output<String> remoteUrl;

    /**
     * @return Git URL for the repository or &lt;Group&gt;/&lt;Project&gt; for Gitlab
     * 
     */
    public Output<String> remoteUrl() {
        return this.remoteUrl;
    }
    /**
     * Credentials ID for the repository (From the repository side not the dbt Cloud ID)
     * 
     */
    @Export(name="repositoryCredentialsId", refs={Integer.class}, tree="[0]")
    private Output<Integer> repositoryCredentialsId;

    /**
     * @return Credentials ID for the repository (From the repository side not the dbt Cloud ID)
     * 
     */
    public Output<Integer> repositoryCredentialsId() {
        return this.repositoryCredentialsId;
    }
    /**
     * Repository Identifier
     * 
     */
    @Export(name="repositoryId", refs={Integer.class}, tree="[0]")
    private Output<Integer> repositoryId;

    /**
     * @return Repository Identifier
     * 
     */
    public Output<Integer> repositoryId() {
        return this.repositoryId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Repository(java.lang.String name) {
        this(name, RepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Repository(java.lang.String name, RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(java.lang.String name, RepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/repository:Repository", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Repository(java.lang.String name, Output<java.lang.String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/repository:Repository", name, state, makeResourceOptions(options, id), false);
    }

    private static RepositoryArgs makeArgs(RepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? RepositoryArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .pluginDownloadURL("github://api.github.com/pulumi/pulumi-dbtcloud")
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Repository get(java.lang.String name, Output<java.lang.String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, state, options);
    }
}
