# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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
from . import outputs
from ._inputs import *

__all__ = [
    'GetServiceTokenResult',
    'AwaitableGetServiceTokenResult',
    'get_service_token',
    'get_service_token_output',
]

@pulumi.output_type
class GetServiceTokenResult:
    """
    A collection of values returned by getServiceToken.
    """
    def __init__(__self__, id=None, name=None, service_token_id=None, service_token_permissions=None, uid=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if service_token_id and not isinstance(service_token_id, int):
            raise TypeError("Expected argument 'service_token_id' to be a int")
        pulumi.set(__self__, "service_token_id", service_token_id)
        if service_token_permissions and not isinstance(service_token_permissions, list):
            raise TypeError("Expected argument 'service_token_permissions' to be a list")
        pulumi.set(__self__, "service_token_permissions", service_token_permissions)
        if uid and not isinstance(uid, str):
            raise TypeError("Expected argument 'uid' to be a str")
        pulumi.set(__self__, "uid", uid)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the service token
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        Service token name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="serviceTokenId")
    def service_token_id(self) -> int:
        """
        The ID of the service token
        """
        return pulumi.get(self, "service_token_id")

    @property
    @pulumi.getter(name="serviceTokenPermissions")
    def service_token_permissions(self) -> Optional[Sequence['outputs.GetServiceTokenServiceTokenPermissionResult']]:
        """
        Permissions set for the service token
        """
        return pulumi.get(self, "service_token_permissions")

    @property
    @pulumi.getter
    def uid(self) -> str:
        """
        Service token UID (part of the token)
        """
        return pulumi.get(self, "uid")


class AwaitableGetServiceTokenResult(GetServiceTokenResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceTokenResult(
            id=self.id,
            name=self.name,
            service_token_id=self.service_token_id,
            service_token_permissions=self.service_token_permissions,
            uid=self.uid)


def get_service_token(service_token_id: Optional[int] = None,
                      service_token_permissions: Optional[Sequence[Union['GetServiceTokenServiceTokenPermissionArgs', 'GetServiceTokenServiceTokenPermissionArgsDict']]] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceTokenResult:
    """
    Use this data source to access information about an existing resource.

    :param int service_token_id: The ID of the service token
    :param Sequence[Union['GetServiceTokenServiceTokenPermissionArgs', 'GetServiceTokenServiceTokenPermissionArgsDict']] service_token_permissions: Permissions set for the service token
    """
    __args__ = dict()
    __args__['serviceTokenId'] = service_token_id
    __args__['serviceTokenPermissions'] = service_token_permissions
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('dbtcloud:index/getServiceToken:getServiceToken', __args__, opts=opts, typ=GetServiceTokenResult).value

    return AwaitableGetServiceTokenResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        service_token_id=pulumi.get(__ret__, 'service_token_id'),
        service_token_permissions=pulumi.get(__ret__, 'service_token_permissions'),
        uid=pulumi.get(__ret__, 'uid'))
def get_service_token_output(service_token_id: Optional[pulumi.Input[int]] = None,
                             service_token_permissions: Optional[pulumi.Input[Optional[Sequence[Union['GetServiceTokenServiceTokenPermissionArgs', 'GetServiceTokenServiceTokenPermissionArgsDict']]]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceTokenResult]:
    """
    Use this data source to access information about an existing resource.

    :param int service_token_id: The ID of the service token
    :param Sequence[Union['GetServiceTokenServiceTokenPermissionArgs', 'GetServiceTokenServiceTokenPermissionArgsDict']] service_token_permissions: Permissions set for the service token
    """
    __args__ = dict()
    __args__['serviceTokenId'] = service_token_id
    __args__['serviceTokenPermissions'] = service_token_permissions
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('dbtcloud:index/getServiceToken:getServiceToken', __args__, opts=opts, typ=GetServiceTokenResult)
    return __ret__.apply(lambda __response__: GetServiceTokenResult(
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        service_token_id=pulumi.get(__response__, 'service_token_id'),
        service_token_permissions=pulumi.get(__response__, 'service_token_permissions'),
        uid=pulumi.get(__response__, 'uid')))