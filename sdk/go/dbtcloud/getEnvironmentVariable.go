// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dbtcloud

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-dbtcloud/sdk/go/dbtcloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func LookupEnvironmentVariable(ctx *pulumi.Context, args *LookupEnvironmentVariableArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentVariableResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupEnvironmentVariableResult
	err := ctx.Invoke("dbtcloud:index/getEnvironmentVariable:getEnvironmentVariable", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironmentVariable.
type LookupEnvironmentVariableArgs struct {
	// Name for the variable
	Name string `pulumi:"name"`
	// Project ID the variable exists in
	ProjectId int `pulumi:"projectId"`
}

// A collection of values returned by getEnvironmentVariable.
type LookupEnvironmentVariableResult struct {
	// Map containing the environment variables
	EnvironmentValues map[string]interface{} `pulumi:"environmentValues"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Name for the variable
	Name string `pulumi:"name"`
	// Project ID the variable exists in
	ProjectId int `pulumi:"projectId"`
}

func LookupEnvironmentVariableOutput(ctx *pulumi.Context, args LookupEnvironmentVariableOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentVariableResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentVariableResult, error) {
			args := v.(LookupEnvironmentVariableArgs)
			r, err := LookupEnvironmentVariable(ctx, &args, opts...)
			var s LookupEnvironmentVariableResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEnvironmentVariableResultOutput)
}

// A collection of arguments for invoking getEnvironmentVariable.
type LookupEnvironmentVariableOutputArgs struct {
	// Name for the variable
	Name pulumi.StringInput `pulumi:"name"`
	// Project ID the variable exists in
	ProjectId pulumi.IntInput `pulumi:"projectId"`
}

func (LookupEnvironmentVariableOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentVariableArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironmentVariable.
type LookupEnvironmentVariableResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentVariableResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentVariableResult)(nil)).Elem()
}

func (o LookupEnvironmentVariableResultOutput) ToLookupEnvironmentVariableResultOutput() LookupEnvironmentVariableResultOutput {
	return o
}

func (o LookupEnvironmentVariableResultOutput) ToLookupEnvironmentVariableResultOutputWithContext(ctx context.Context) LookupEnvironmentVariableResultOutput {
	return o
}

// Map containing the environment variables
func (o LookupEnvironmentVariableResultOutput) EnvironmentValues() pulumi.MapOutput {
	return o.ApplyT(func(v LookupEnvironmentVariableResult) map[string]interface{} { return v.EnvironmentValues }).(pulumi.MapOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEnvironmentVariableResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentVariableResult) string { return v.Id }).(pulumi.StringOutput)
}

// Name for the variable
func (o LookupEnvironmentVariableResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentVariableResult) string { return v.Name }).(pulumi.StringOutput)
}

// Project ID the variable exists in
func (o LookupEnvironmentVariableResultOutput) ProjectId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupEnvironmentVariableResult) int { return v.ProjectId }).(pulumi.IntOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentVariableResultOutput{})
}
