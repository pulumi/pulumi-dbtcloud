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

__all__ = [
    'GetGlobalConnectionsResult',
    'AwaitableGetGlobalConnectionsResult',
    'get_global_connections',
    'get_global_connections_output',
]

@pulumi.output_type
class GetGlobalConnectionsResult:
    """
    A collection of values returned by getGlobalConnections.
    """
    def __init__(__self__, connections=None, id=None):
        if connections and not isinstance(connections, list):
            raise TypeError("Expected argument 'connections' to be a list")
        pulumi.set(__self__, "connections", connections)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)

    @property
    @pulumi.getter
    def connections(self) -> Sequence['outputs.GetGlobalConnectionsConnectionResult']:
        """
        A set of all the connections
        """
        return pulumi.get(self, "connections")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")


class AwaitableGetGlobalConnectionsResult(GetGlobalConnectionsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalConnectionsResult(
            connections=self.connections,
            id=self.id)


def get_global_connections(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalConnectionsResult:
    """
    All the connections created on the account with some summary information, like their name, type, when they were created/updated and the number of environments using them.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_dbtcloud as dbtcloud

    my_connections = dbtcloud.get_global_connections()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('dbtcloud:index/getGlobalConnections:getGlobalConnections', __args__, opts=opts, typ=GetGlobalConnectionsResult).value

    return AwaitableGetGlobalConnectionsResult(
        connections=pulumi.get(__ret__, 'connections'),
        id=pulumi.get(__ret__, 'id'))
def get_global_connections_output(opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGlobalConnectionsResult]:
    """
    All the connections created on the account with some summary information, like their name, type, when they were created/updated and the number of environments using them.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_dbtcloud as dbtcloud

    my_connections = dbtcloud.get_global_connections()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('dbtcloud:index/getGlobalConnections:getGlobalConnections', __args__, opts=opts, typ=GetGlobalConnectionsResult)
    return __ret__.apply(lambda __response__: GetGlobalConnectionsResult(
        connections=pulumi.get(__response__, 'connections'),
        id=pulumi.get(__response__, 'id')))