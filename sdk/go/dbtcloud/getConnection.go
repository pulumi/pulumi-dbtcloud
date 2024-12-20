// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dbtcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-dbtcloud/sdk/go/dbtcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupConnection(ctx *pulumi.Context, args *LookupConnectionArgs, opts ...pulumi.InvokeOption) (*LookupConnectionResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupConnectionResult
	err := ctx.Invoke("dbtcloud:index/getConnection:getConnection", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getConnection.
type LookupConnectionArgs struct {
	// ID for the connection
	ConnectionId int `pulumi:"connectionId"`
	// Project ID to create the connection in
	ProjectId int `pulumi:"projectId"`
}

// A collection of values returned by getConnection.
type LookupConnectionResult struct {
	// Account for the connection
	Account string `pulumi:"account"`
	// Flag for whether or not to use the keep session alive parameter in the connection
	AllowKeepAlive bool `pulumi:"allowKeepAlive"`
	// Flag for whether or not to use SSO for the connection
	AllowSso bool `pulumi:"allowSso"`
	// ID for the connection
	ConnectionId int `pulumi:"connectionId"`
	// Database name for the connection
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Whether the connection is active
	IsActive bool `pulumi:"isActive"`
	// Connection name
	Name string `pulumi:"name"`
	// The ID of the PrivateLink connection
	PrivateLinkEndpointId string `pulumi:"privateLinkEndpointId"`
	// Project ID to create the connection in
	ProjectId int `pulumi:"projectId"`
	// Role name for the connection
	Role string `pulumi:"role"`
	// Connection type
	Type string `pulumi:"type"`
	// Warehouse name for the connection
	Warehouse string `pulumi:"warehouse"`
}

func LookupConnectionOutput(ctx *pulumi.Context, args LookupConnectionOutputArgs, opts ...pulumi.InvokeOption) LookupConnectionResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupConnectionResultOutput, error) {
			args := v.(LookupConnectionArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("dbtcloud:index/getConnection:getConnection", args, LookupConnectionResultOutput{}, options).(LookupConnectionResultOutput), nil
		}).(LookupConnectionResultOutput)
}

// A collection of arguments for invoking getConnection.
type LookupConnectionOutputArgs struct {
	// ID for the connection
	ConnectionId pulumi.IntInput `pulumi:"connectionId"`
	// Project ID to create the connection in
	ProjectId pulumi.IntInput `pulumi:"projectId"`
}

func (LookupConnectionOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionArgs)(nil)).Elem()
}

// A collection of values returned by getConnection.
type LookupConnectionResultOutput struct{ *pulumi.OutputState }

func (LookupConnectionResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupConnectionResult)(nil)).Elem()
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutput() LookupConnectionResultOutput {
	return o
}

func (o LookupConnectionResultOutput) ToLookupConnectionResultOutputWithContext(ctx context.Context) LookupConnectionResultOutput {
	return o
}

// Account for the connection
func (o LookupConnectionResultOutput) Account() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Account }).(pulumi.StringOutput)
}

// Flag for whether or not to use the keep session alive parameter in the connection
func (o LookupConnectionResultOutput) AllowKeepAlive() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupConnectionResult) bool { return v.AllowKeepAlive }).(pulumi.BoolOutput)
}

// Flag for whether or not to use SSO for the connection
func (o LookupConnectionResultOutput) AllowSso() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupConnectionResult) bool { return v.AllowSso }).(pulumi.BoolOutput)
}

// ID for the connection
func (o LookupConnectionResultOutput) ConnectionId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupConnectionResult) int { return v.ConnectionId }).(pulumi.IntOutput)
}

// Database name for the connection
func (o LookupConnectionResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupConnectionResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Id }).(pulumi.StringOutput)
}

// Whether the connection is active
func (o LookupConnectionResultOutput) IsActive() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupConnectionResult) bool { return v.IsActive }).(pulumi.BoolOutput)
}

// Connection name
func (o LookupConnectionResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Name }).(pulumi.StringOutput)
}

// The ID of the PrivateLink connection
func (o LookupConnectionResultOutput) PrivateLinkEndpointId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.PrivateLinkEndpointId }).(pulumi.StringOutput)
}

// Project ID to create the connection in
func (o LookupConnectionResultOutput) ProjectId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupConnectionResult) int { return v.ProjectId }).(pulumi.IntOutput)
}

// Role name for the connection
func (o LookupConnectionResultOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Role }).(pulumi.StringOutput)
}

// Connection type
func (o LookupConnectionResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Type }).(pulumi.StringOutput)
}

// Warehouse name for the connection
func (o LookupConnectionResultOutput) Warehouse() pulumi.StringOutput {
	return o.ApplyT(func(v LookupConnectionResult) string { return v.Warehouse }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupConnectionResultOutput{})
}
