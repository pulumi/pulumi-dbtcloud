// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Configure model notifications for a dbt Cloud environment. By default all the `on_...` are set to false. When destroyed, the model notifications are disabled.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as dbtcloud from "@pulumi/dbtcloud";
 *
 * const prodModelNotifications = new dbtcloud.ModelNotifications("prod_model_notifications", {
 *     environmentId: prodEnvironment.environmentId,
 *     enabled: true,
 *     onSuccess: false,
 *     onFailure: true,
 *     onWarning: true,
 * });
 * ```
 *
 * ## Import
 *
 * Model notifications are imported using the environment ID where the notifications are enabled
 *
 * Using import blocks (requires Terraform >= 1.5)
 *
 * import {
 *
 *   to = dbtcloud_model_notifications.my_model_notifications
 *
 *   id = "environment_id"
 *
 * }
 *
 * import {
 *
 *   to = dbtcloud_model_notifications.my_model_notifications
 *
 *   id = "12345"
 *
 * }
 *
 * Using the older import command
 *
 * ```sh
 * $ pulumi import dbtcloud:index/modelNotifications:ModelNotifications my_model_notifications "environment_id"
 * ```
 *
 * ```sh
 * $ pulumi import dbtcloud:index/modelNotifications:ModelNotifications my_model_notifications 12345
 * ```
 */
export class ModelNotifications extends pulumi.CustomResource {
    /**
     * Get an existing ModelNotifications resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ModelNotificationsState, opts?: pulumi.CustomResourceOptions): ModelNotifications {
        return new ModelNotifications(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'dbtcloud:index/modelNotifications:ModelNotifications';

    /**
     * Returns true if the given object is an instance of ModelNotifications.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ModelNotifications {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ModelNotifications.__pulumiType;
    }

    /**
     * Whether model notifications are enabled for this environment
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * The ID of the dbt Cloud environment
     */
    public readonly environmentId!: pulumi.Output<string>;
    /**
     * Whether to send notifications for failed model runs
     */
    public readonly onFailure!: pulumi.Output<boolean>;
    /**
     * Whether to send notifications for skipped model runs
     */
    public readonly onSkipped!: pulumi.Output<boolean>;
    /**
     * Whether to send notifications for successful model runs
     */
    public readonly onSuccess!: pulumi.Output<boolean>;
    /**
     * Whether to send notifications for model runs with warnings
     */
    public readonly onWarning!: pulumi.Output<boolean>;

    /**
     * Create a ModelNotifications resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ModelNotificationsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ModelNotificationsArgs | ModelNotificationsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ModelNotificationsState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["environmentId"] = state ? state.environmentId : undefined;
            resourceInputs["onFailure"] = state ? state.onFailure : undefined;
            resourceInputs["onSkipped"] = state ? state.onSkipped : undefined;
            resourceInputs["onSuccess"] = state ? state.onSuccess : undefined;
            resourceInputs["onWarning"] = state ? state.onWarning : undefined;
        } else {
            const args = argsOrState as ModelNotificationsArgs | undefined;
            if ((!args || args.environmentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'environmentId'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["environmentId"] = args ? args.environmentId : undefined;
            resourceInputs["onFailure"] = args ? args.onFailure : undefined;
            resourceInputs["onSkipped"] = args ? args.onSkipped : undefined;
            resourceInputs["onSuccess"] = args ? args.onSuccess : undefined;
            resourceInputs["onWarning"] = args ? args.onWarning : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ModelNotifications.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ModelNotifications resources.
 */
export interface ModelNotificationsState {
    /**
     * Whether model notifications are enabled for this environment
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The ID of the dbt Cloud environment
     */
    environmentId?: pulumi.Input<string>;
    /**
     * Whether to send notifications for failed model runs
     */
    onFailure?: pulumi.Input<boolean>;
    /**
     * Whether to send notifications for skipped model runs
     */
    onSkipped?: pulumi.Input<boolean>;
    /**
     * Whether to send notifications for successful model runs
     */
    onSuccess?: pulumi.Input<boolean>;
    /**
     * Whether to send notifications for model runs with warnings
     */
    onWarning?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a ModelNotifications resource.
 */
export interface ModelNotificationsArgs {
    /**
     * Whether model notifications are enabled for this environment
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * The ID of the dbt Cloud environment
     */
    environmentId: pulumi.Input<string>;
    /**
     * Whether to send notifications for failed model runs
     */
    onFailure?: pulumi.Input<boolean>;
    /**
     * Whether to send notifications for skipped model runs
     */
    onSkipped?: pulumi.Input<boolean>;
    /**
     * Whether to send notifications for successful model runs
     */
    onSuccess?: pulumi.Input<boolean>;
    /**
     * Whether to send notifications for model runs with warnings
     */
    onWarning?: pulumi.Input<boolean>;
}
