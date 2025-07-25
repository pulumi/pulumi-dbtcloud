# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities

__all__ = ['PartialLicenseMapArgs', 'PartialLicenseMap']

@pulumi.input_type
class PartialLicenseMapArgs:
    def __init__(__self__, *,
                 license_type: pulumi.Input[_builtins.str],
                 sso_license_mapping_groups: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        """
        The set of arguments for constructing a PartialLicenseMap resource.
        :param pulumi.Input[_builtins.str] license_type: The license type to update
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] sso_license_mapping_groups: List of SSO groups to map to the license type.
        """
        pulumi.set(__self__, "license_type", license_type)
        pulumi.set(__self__, "sso_license_mapping_groups", sso_license_mapping_groups)

    @_builtins.property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> pulumi.Input[_builtins.str]:
        """
        The license type to update
        """
        return pulumi.get(self, "license_type")

    @license_type.setter
    def license_type(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "license_type", value)

    @_builtins.property
    @pulumi.getter(name="ssoLicenseMappingGroups")
    def sso_license_mapping_groups(self) -> pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]:
        """
        List of SSO groups to map to the license type.
        """
        return pulumi.get(self, "sso_license_mapping_groups")

    @sso_license_mapping_groups.setter
    def sso_license_mapping_groups(self, value: pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]):
        pulumi.set(self, "sso_license_mapping_groups", value)


@pulumi.input_type
class _PartialLicenseMapState:
    def __init__(__self__, *,
                 license_type: Optional[pulumi.Input[_builtins.str]] = None,
                 sso_license_mapping_groups: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None):
        """
        Input properties used for looking up and filtering PartialLicenseMap resources.
        :param pulumi.Input[_builtins.str] license_type: The license type to update
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] sso_license_mapping_groups: List of SSO groups to map to the license type.
        """
        if license_type is not None:
            pulumi.set(__self__, "license_type", license_type)
        if sso_license_mapping_groups is not None:
            pulumi.set(__self__, "sso_license_mapping_groups", sso_license_mapping_groups)

    @_builtins.property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        The license type to update
        """
        return pulumi.get(self, "license_type")

    @license_type.setter
    def license_type(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "license_type", value)

    @_builtins.property
    @pulumi.getter(name="ssoLicenseMappingGroups")
    def sso_license_mapping_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]:
        """
        List of SSO groups to map to the license type.
        """
        return pulumi.get(self, "sso_license_mapping_groups")

    @sso_license_mapping_groups.setter
    def sso_license_mapping_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]]):
        pulumi.set(self, "sso_license_mapping_groups", value)


@pulumi.type_token("dbtcloud:index/partialLicenseMap:PartialLicenseMap")
class PartialLicenseMap(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 license_type: Optional[pulumi.Input[_builtins.str]] = None,
                 sso_license_mapping_groups: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_dbtcloud as dbtcloud

        # Developer license group mapping
        dev_license_map = dbtcloud.PartialLicenseMap("dev_license_map",
            license_type="developer",
            sso_license_mapping_groups=["DEV-SSO-GROUP"])
        # Read-only license mapping
        read_only_license_map = dbtcloud.PartialLicenseMap("read_only_license_map",
            license_type="read_only",
            sso_license_mapping_groups=["READ-ONLY-SSO-GROUP"])
        # IT license mapping
        it_license_map = dbtcloud.PartialLicenseMap("it_license_map",
            license_type="it",
            sso_license_mapping_groups=["IT-SSO-GROUP"])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] license_type: The license type to update
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] sso_license_mapping_groups: List of SSO groups to map to the license type.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PartialLicenseMapArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_dbtcloud as dbtcloud

        # Developer license group mapping
        dev_license_map = dbtcloud.PartialLicenseMap("dev_license_map",
            license_type="developer",
            sso_license_mapping_groups=["DEV-SSO-GROUP"])
        # Read-only license mapping
        read_only_license_map = dbtcloud.PartialLicenseMap("read_only_license_map",
            license_type="read_only",
            sso_license_mapping_groups=["READ-ONLY-SSO-GROUP"])
        # IT license mapping
        it_license_map = dbtcloud.PartialLicenseMap("it_license_map",
            license_type="it",
            sso_license_mapping_groups=["IT-SSO-GROUP"])
        ```

        :param str resource_name: The name of the resource.
        :param PartialLicenseMapArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PartialLicenseMapArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 license_type: Optional[pulumi.Input[_builtins.str]] = None,
                 sso_license_mapping_groups: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PartialLicenseMapArgs.__new__(PartialLicenseMapArgs)

            if license_type is None and not opts.urn:
                raise TypeError("Missing required property 'license_type'")
            __props__.__dict__["license_type"] = license_type
            if sso_license_mapping_groups is None and not opts.urn:
                raise TypeError("Missing required property 'sso_license_mapping_groups'")
            __props__.__dict__["sso_license_mapping_groups"] = sso_license_mapping_groups
        super(PartialLicenseMap, __self__).__init__(
            'dbtcloud:index/partialLicenseMap:PartialLicenseMap',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            license_type: Optional[pulumi.Input[_builtins.str]] = None,
            sso_license_mapping_groups: Optional[pulumi.Input[Sequence[pulumi.Input[_builtins.str]]]] = None) -> 'PartialLicenseMap':
        """
        Get an existing PartialLicenseMap resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[_builtins.str] license_type: The license type to update
        :param pulumi.Input[Sequence[pulumi.Input[_builtins.str]]] sso_license_mapping_groups: List of SSO groups to map to the license type.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PartialLicenseMapState.__new__(_PartialLicenseMapState)

        __props__.__dict__["license_type"] = license_type
        __props__.__dict__["sso_license_mapping_groups"] = sso_license_mapping_groups
        return PartialLicenseMap(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> pulumi.Output[_builtins.str]:
        """
        The license type to update
        """
        return pulumi.get(self, "license_type")

    @_builtins.property
    @pulumi.getter(name="ssoLicenseMappingGroups")
    def sso_license_mapping_groups(self) -> pulumi.Output[Sequence[_builtins.str]]:
        """
        List of SSO groups to map to the license type.
        """
        return pulumi.get(self, "sso_license_mapping_groups")

