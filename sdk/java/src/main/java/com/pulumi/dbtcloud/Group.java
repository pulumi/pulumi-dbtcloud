// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.dbtcloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.dbtcloud.GroupArgs;
import com.pulumi.dbtcloud.Utilities;
import com.pulumi.dbtcloud.inputs.GroupState;
import com.pulumi.dbtcloud.outputs.GroupGroupPermission;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.dbtcloud.Group;
 * import com.pulumi.dbtcloud.GroupArgs;
 * import com.pulumi.dbtcloud.inputs.GroupGroupPermissionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var tfGroup1 = new Group("tfGroup1", GroupArgs.builder()
 *             .name("TF Group 1")
 *             .groupPermissions(            
 *                 GroupGroupPermissionArgs.builder()
 *                     .permissionSet("member")
 *                     .allProjects(true)
 *                     .build(),
 *                 GroupGroupPermissionArgs.builder()
 *                     .permissionSet("developer")
 *                     .allProjects(false)
 *                     .projectId(dbtProject.id())
 *                     .writableEnvironmentCategories(                    
 *                         "development",
 *                         "staging")
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * using  import blocks (requires Terraform &gt;= 1.5)
 * 
 * import {
 * 
 *   to = dbtcloud_group.my_group
 * 
 *   id = &#34;group_id&#34;
 * 
 * }
 * 
 * import {
 * 
 *   to = dbtcloud_group.my_group
 * 
 *   id = &#34;12345&#34;
 * 
 * }
 * 
 * using the older import command
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/group:Group my_group &#34;group_id&#34;
 * ```
 * 
 * ```sh
 * $ pulumi import dbtcloud:index/group:Group my_group 12345
 * ```
 * 
 */
@ResourceType(type="dbtcloud:index/group:Group")
public class Group extends com.pulumi.resources.CustomResource {
    /**
     * Whether the group will be assigned by default to users. The value needs to be the same for all partial permissions for the same group.
     * 
     */
    @Export(name="assignByDefault", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> assignByDefault;

    /**
     * @return Whether the group will be assigned by default to users. The value needs to be the same for all partial permissions for the same group.
     * 
     */
    public Output<Boolean> assignByDefault() {
        return this.assignByDefault;
    }
    /**
     * Partial permissions for the group. Those permissions will be added/removed when config is added/removed.
     * 
     */
    @Export(name="groupPermissions", refs={List.class,GroupGroupPermission.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GroupGroupPermission>> groupPermissions;

    /**
     * @return Partial permissions for the group. Those permissions will be added/removed when config is added/removed.
     * 
     */
    public Output<Optional<List<GroupGroupPermission>>> groupPermissions() {
        return Codegen.optional(this.groupPermissions);
    }
    /**
     * The name of the group. This is used to identify an existing group
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the group. This is used to identify an existing group
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Mapping groups from the IdP. At the moment the complete list needs to be provided in each partial permission for the same group.
     * 
     */
    @Export(name="ssoMappingGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> ssoMappingGroups;

    /**
     * @return Mapping groups from the IdP. At the moment the complete list needs to be provided in each partial permission for the same group.
     * 
     */
    public Output<List<String>> ssoMappingGroups() {
        return this.ssoMappingGroups;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Group(java.lang.String name) {
        this(name, GroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Group(java.lang.String name, @Nullable GroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Group(java.lang.String name, @Nullable GroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/group:Group", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Group(java.lang.String name, Output<java.lang.String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("dbtcloud:index/group:Group", name, state, makeResourceOptions(options, id), false);
    }

    private static GroupArgs makeArgs(@Nullable GroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GroupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static Group get(java.lang.String name, Output<java.lang.String> id, @Nullable GroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Group(name, id, state, options);
    }
}