// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dbtcloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-dbtcloud/sdk/go/dbtcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Configure an external OAuth integration for the data warehouse. Currently supports Okta and Entra ID (i.e. Azure AD) for Snowflake.
//
// See the [documentation](https://docs.getdbt.com/docs/cloud/manage-access/external-oauth) for more information on how to configure it.
//
// ## Import
//
// using  import blocks (requires Terraform >= 1.5)
//
// import {
//
//	to = dbtcloud_oauth_configuration.my_external_oauth
//
//	id = "external_oauth_id"
//
// }
//
// import {
//
//	to = dbtcloud_oauth_configuration.my_external_oauth
//
//	id = "12345"
//
// }
//
// using the older import command
//
// ```sh
// $ pulumi import dbtcloud:index/oauthConfiguration:OauthConfiguration my_external_oauth "external_oauth_id"
// ```
//
// ```sh
// $ pulumi import dbtcloud:index/oauthConfiguration:OauthConfiguration my_external_oauth 12345
// ```
type OauthConfiguration struct {
	pulumi.CustomResourceState

	// The Application ID URI for the OAuth integration. Only for Entra
	ApplicationIdUri pulumi.StringOutput `pulumi:"applicationIdUri"`
	// The Authorize URL for the OAuth integration
	AuthorizeUrl pulumi.StringOutput `pulumi:"authorizeUrl"`
	// The Client ID for the OAuth integration
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// The Client secret for the OAuth integration
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	// The name of OAuth integration
	Name pulumi.StringOutput `pulumi:"name"`
	// The redirect URL for the OAuth integration
	RedirectUri pulumi.StringOutput `pulumi:"redirectUri"`
	// The Token URL for the OAuth integration
	TokenUrl pulumi.StringOutput `pulumi:"tokenUrl"`
	// The type of OAuth integration (`entra` or `okta`)
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewOauthConfiguration registers a new resource with the given unique name, arguments, and options.
func NewOauthConfiguration(ctx *pulumi.Context,
	name string, args *OauthConfigurationArgs, opts ...pulumi.ResourceOption) (*OauthConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AuthorizeUrl == nil {
		return nil, errors.New("invalid value for required argument 'AuthorizeUrl'")
	}
	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.ClientSecret == nil {
		return nil, errors.New("invalid value for required argument 'ClientSecret'")
	}
	if args.RedirectUri == nil {
		return nil, errors.New("invalid value for required argument 'RedirectUri'")
	}
	if args.TokenUrl == nil {
		return nil, errors.New("invalid value for required argument 'TokenUrl'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	if args.ClientSecret != nil {
		args.ClientSecret = pulumi.ToSecret(args.ClientSecret).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"clientSecret",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource OauthConfiguration
	err := ctx.RegisterResource("dbtcloud:index/oauthConfiguration:OauthConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOauthConfiguration gets an existing OauthConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOauthConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OauthConfigurationState, opts ...pulumi.ResourceOption) (*OauthConfiguration, error) {
	var resource OauthConfiguration
	err := ctx.ReadResource("dbtcloud:index/oauthConfiguration:OauthConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OauthConfiguration resources.
type oauthConfigurationState struct {
	// The Application ID URI for the OAuth integration. Only for Entra
	ApplicationIdUri *string `pulumi:"applicationIdUri"`
	// The Authorize URL for the OAuth integration
	AuthorizeUrl *string `pulumi:"authorizeUrl"`
	// The Client ID for the OAuth integration
	ClientId *string `pulumi:"clientId"`
	// The Client secret for the OAuth integration
	ClientSecret *string `pulumi:"clientSecret"`
	// The name of OAuth integration
	Name *string `pulumi:"name"`
	// The redirect URL for the OAuth integration
	RedirectUri *string `pulumi:"redirectUri"`
	// The Token URL for the OAuth integration
	TokenUrl *string `pulumi:"tokenUrl"`
	// The type of OAuth integration (`entra` or `okta`)
	Type *string `pulumi:"type"`
}

type OauthConfigurationState struct {
	// The Application ID URI for the OAuth integration. Only for Entra
	ApplicationIdUri pulumi.StringPtrInput
	// The Authorize URL for the OAuth integration
	AuthorizeUrl pulumi.StringPtrInput
	// The Client ID for the OAuth integration
	ClientId pulumi.StringPtrInput
	// The Client secret for the OAuth integration
	ClientSecret pulumi.StringPtrInput
	// The name of OAuth integration
	Name pulumi.StringPtrInput
	// The redirect URL for the OAuth integration
	RedirectUri pulumi.StringPtrInput
	// The Token URL for the OAuth integration
	TokenUrl pulumi.StringPtrInput
	// The type of OAuth integration (`entra` or `okta`)
	Type pulumi.StringPtrInput
}

func (OauthConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*oauthConfigurationState)(nil)).Elem()
}

type oauthConfigurationArgs struct {
	// The Application ID URI for the OAuth integration. Only for Entra
	ApplicationIdUri *string `pulumi:"applicationIdUri"`
	// The Authorize URL for the OAuth integration
	AuthorizeUrl string `pulumi:"authorizeUrl"`
	// The Client ID for the OAuth integration
	ClientId string `pulumi:"clientId"`
	// The Client secret for the OAuth integration
	ClientSecret string `pulumi:"clientSecret"`
	// The name of OAuth integration
	Name *string `pulumi:"name"`
	// The redirect URL for the OAuth integration
	RedirectUri string `pulumi:"redirectUri"`
	// The Token URL for the OAuth integration
	TokenUrl string `pulumi:"tokenUrl"`
	// The type of OAuth integration (`entra` or `okta`)
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a OauthConfiguration resource.
type OauthConfigurationArgs struct {
	// The Application ID URI for the OAuth integration. Only for Entra
	ApplicationIdUri pulumi.StringPtrInput
	// The Authorize URL for the OAuth integration
	AuthorizeUrl pulumi.StringInput
	// The Client ID for the OAuth integration
	ClientId pulumi.StringInput
	// The Client secret for the OAuth integration
	ClientSecret pulumi.StringInput
	// The name of OAuth integration
	Name pulumi.StringPtrInput
	// The redirect URL for the OAuth integration
	RedirectUri pulumi.StringInput
	// The Token URL for the OAuth integration
	TokenUrl pulumi.StringInput
	// The type of OAuth integration (`entra` or `okta`)
	Type pulumi.StringInput
}

func (OauthConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oauthConfigurationArgs)(nil)).Elem()
}

type OauthConfigurationInput interface {
	pulumi.Input

	ToOauthConfigurationOutput() OauthConfigurationOutput
	ToOauthConfigurationOutputWithContext(ctx context.Context) OauthConfigurationOutput
}

func (*OauthConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**OauthConfiguration)(nil)).Elem()
}

func (i *OauthConfiguration) ToOauthConfigurationOutput() OauthConfigurationOutput {
	return i.ToOauthConfigurationOutputWithContext(context.Background())
}

func (i *OauthConfiguration) ToOauthConfigurationOutputWithContext(ctx context.Context) OauthConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthConfigurationOutput)
}

// OauthConfigurationArrayInput is an input type that accepts OauthConfigurationArray and OauthConfigurationArrayOutput values.
// You can construct a concrete instance of `OauthConfigurationArrayInput` via:
//
//	OauthConfigurationArray{ OauthConfigurationArgs{...} }
type OauthConfigurationArrayInput interface {
	pulumi.Input

	ToOauthConfigurationArrayOutput() OauthConfigurationArrayOutput
	ToOauthConfigurationArrayOutputWithContext(context.Context) OauthConfigurationArrayOutput
}

type OauthConfigurationArray []OauthConfigurationInput

func (OauthConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OauthConfiguration)(nil)).Elem()
}

func (i OauthConfigurationArray) ToOauthConfigurationArrayOutput() OauthConfigurationArrayOutput {
	return i.ToOauthConfigurationArrayOutputWithContext(context.Background())
}

func (i OauthConfigurationArray) ToOauthConfigurationArrayOutputWithContext(ctx context.Context) OauthConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthConfigurationArrayOutput)
}

// OauthConfigurationMapInput is an input type that accepts OauthConfigurationMap and OauthConfigurationMapOutput values.
// You can construct a concrete instance of `OauthConfigurationMapInput` via:
//
//	OauthConfigurationMap{ "key": OauthConfigurationArgs{...} }
type OauthConfigurationMapInput interface {
	pulumi.Input

	ToOauthConfigurationMapOutput() OauthConfigurationMapOutput
	ToOauthConfigurationMapOutputWithContext(context.Context) OauthConfigurationMapOutput
}

type OauthConfigurationMap map[string]OauthConfigurationInput

func (OauthConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OauthConfiguration)(nil)).Elem()
}

func (i OauthConfigurationMap) ToOauthConfigurationMapOutput() OauthConfigurationMapOutput {
	return i.ToOauthConfigurationMapOutputWithContext(context.Background())
}

func (i OauthConfigurationMap) ToOauthConfigurationMapOutputWithContext(ctx context.Context) OauthConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OauthConfigurationMapOutput)
}

type OauthConfigurationOutput struct{ *pulumi.OutputState }

func (OauthConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OauthConfiguration)(nil)).Elem()
}

func (o OauthConfigurationOutput) ToOauthConfigurationOutput() OauthConfigurationOutput {
	return o
}

func (o OauthConfigurationOutput) ToOauthConfigurationOutputWithContext(ctx context.Context) OauthConfigurationOutput {
	return o
}

// The Application ID URI for the OAuth integration. Only for Entra
func (o OauthConfigurationOutput) ApplicationIdUri() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthConfiguration) pulumi.StringOutput { return v.ApplicationIdUri }).(pulumi.StringOutput)
}

// The Authorize URL for the OAuth integration
func (o OauthConfigurationOutput) AuthorizeUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthConfiguration) pulumi.StringOutput { return v.AuthorizeUrl }).(pulumi.StringOutput)
}

// The Client ID for the OAuth integration
func (o OauthConfigurationOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthConfiguration) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// The Client secret for the OAuth integration
func (o OauthConfigurationOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthConfiguration) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

// The name of OAuth integration
func (o OauthConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The redirect URL for the OAuth integration
func (o OauthConfigurationOutput) RedirectUri() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthConfiguration) pulumi.StringOutput { return v.RedirectUri }).(pulumi.StringOutput)
}

// The Token URL for the OAuth integration
func (o OauthConfigurationOutput) TokenUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthConfiguration) pulumi.StringOutput { return v.TokenUrl }).(pulumi.StringOutput)
}

// The type of OAuth integration (`entra` or `okta`)
func (o OauthConfigurationOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *OauthConfiguration) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type OauthConfigurationArrayOutput struct{ *pulumi.OutputState }

func (OauthConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OauthConfiguration)(nil)).Elem()
}

func (o OauthConfigurationArrayOutput) ToOauthConfigurationArrayOutput() OauthConfigurationArrayOutput {
	return o
}

func (o OauthConfigurationArrayOutput) ToOauthConfigurationArrayOutputWithContext(ctx context.Context) OauthConfigurationArrayOutput {
	return o
}

func (o OauthConfigurationArrayOutput) Index(i pulumi.IntInput) OauthConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OauthConfiguration {
		return vs[0].([]*OauthConfiguration)[vs[1].(int)]
	}).(OauthConfigurationOutput)
}

type OauthConfigurationMapOutput struct{ *pulumi.OutputState }

func (OauthConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OauthConfiguration)(nil)).Elem()
}

func (o OauthConfigurationMapOutput) ToOauthConfigurationMapOutput() OauthConfigurationMapOutput {
	return o
}

func (o OauthConfigurationMapOutput) ToOauthConfigurationMapOutputWithContext(ctx context.Context) OauthConfigurationMapOutput {
	return o
}

func (o OauthConfigurationMapOutput) MapIndex(k pulumi.StringInput) OauthConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OauthConfiguration {
		return vs[0].(map[string]*OauthConfiguration)[vs[1].(string)]
	}).(OauthConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OauthConfigurationInput)(nil)).Elem(), &OauthConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*OauthConfigurationArrayInput)(nil)).Elem(), OauthConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OauthConfigurationMapInput)(nil)).Elem(), OauthConfigurationMap{})
	pulumi.RegisterOutputType(OauthConfigurationOutput{})
	pulumi.RegisterOutputType(OauthConfigurationArrayOutput{})
	pulumi.RegisterOutputType(OauthConfigurationMapOutput{})
}