# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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

__all__ = [
    'GetRepositoryResult',
    'AwaitableGetRepositoryResult',
    'get_repository',
    'get_repository_output',
]

@pulumi.output_type
class GetRepositoryResult:
    """
    A collection of values returned by getRepository.
    """
    def __init__(__self__, deploy_key=None, fetch_deploy_key=None, git_clone_strategy=None, github_installation_id=None, gitlab_project_id=None, id=None, is_active=None, project_id=None, remote_url=None, repository_credentials_id=None, repository_id=None):
        if deploy_key and not isinstance(deploy_key, str):
            raise TypeError("Expected argument 'deploy_key' to be a str")
        pulumi.set(__self__, "deploy_key", deploy_key)
        if fetch_deploy_key and not isinstance(fetch_deploy_key, bool):
            raise TypeError("Expected argument 'fetch_deploy_key' to be a bool")
        pulumi.set(__self__, "fetch_deploy_key", fetch_deploy_key)
        if git_clone_strategy and not isinstance(git_clone_strategy, str):
            raise TypeError("Expected argument 'git_clone_strategy' to be a str")
        pulumi.set(__self__, "git_clone_strategy", git_clone_strategy)
        if github_installation_id and not isinstance(github_installation_id, int):
            raise TypeError("Expected argument 'github_installation_id' to be a int")
        pulumi.set(__self__, "github_installation_id", github_installation_id)
        if gitlab_project_id and not isinstance(gitlab_project_id, int):
            raise TypeError("Expected argument 'gitlab_project_id' to be a int")
        pulumi.set(__self__, "gitlab_project_id", gitlab_project_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_active and not isinstance(is_active, bool):
            raise TypeError("Expected argument 'is_active' to be a bool")
        pulumi.set(__self__, "is_active", is_active)
        if project_id and not isinstance(project_id, int):
            raise TypeError("Expected argument 'project_id' to be a int")
        pulumi.set(__self__, "project_id", project_id)
        if remote_url and not isinstance(remote_url, str):
            raise TypeError("Expected argument 'remote_url' to be a str")
        pulumi.set(__self__, "remote_url", remote_url)
        if repository_credentials_id and not isinstance(repository_credentials_id, int):
            raise TypeError("Expected argument 'repository_credentials_id' to be a int")
        pulumi.set(__self__, "repository_credentials_id", repository_credentials_id)
        if repository_id and not isinstance(repository_id, int):
            raise TypeError("Expected argument 'repository_id' to be a int")
        pulumi.set(__self__, "repository_id", repository_id)

    @property
    @pulumi.getter(name="deployKey")
    def deploy_key(self) -> builtins.str:
        """
        Public key generated by dbt when using `deploy_key` clone strategy
        """
        return pulumi.get(self, "deploy_key")

    @property
    @pulumi.getter(name="fetchDeployKey")
    @_utilities.deprecated("""This field is deprecated and will be removed in a future version of the provider. The key is always fetched when the clone strategy is `deploy_key`""")
    def fetch_deploy_key(self) -> Optional[builtins.bool]:
        """
        Whether we should return the public deploy key
        """
        return pulumi.get(self, "fetch_deploy_key")

    @property
    @pulumi.getter(name="gitCloneStrategy")
    def git_clone_strategy(self) -> builtins.str:
        """
        Git clone strategy for the repository
        """
        return pulumi.get(self, "git_clone_strategy")

    @property
    @pulumi.getter(name="githubInstallationId")
    def github_installation_id(self) -> builtins.int:
        """
        Identifier for the GitHub installation
        """
        return pulumi.get(self, "github_installation_id")

    @property
    @pulumi.getter(name="gitlabProjectId")
    def gitlab_project_id(self) -> builtins.int:
        """
        Identifier for the Gitlab project
        """
        return pulumi.get(self, "gitlab_project_id")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isActive")
    def is_active(self) -> builtins.bool:
        """
        Whether the repository is active
        """
        return pulumi.get(self, "is_active")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> builtins.int:
        """
        Project ID to create the repository in
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="remoteUrl")
    def remote_url(self) -> builtins.str:
        """
        Connection name
        """
        return pulumi.get(self, "remote_url")

    @property
    @pulumi.getter(name="repositoryCredentialsId")
    def repository_credentials_id(self) -> builtins.int:
        """
        Credentials ID for the repository (From the repository side not the dbt Cloud ID)
        """
        return pulumi.get(self, "repository_credentials_id")

    @property
    @pulumi.getter(name="repositoryId")
    def repository_id(self) -> builtins.int:
        """
        ID for the repository
        """
        return pulumi.get(self, "repository_id")


class AwaitableGetRepositoryResult(GetRepositoryResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetRepositoryResult(
            deploy_key=self.deploy_key,
            fetch_deploy_key=self.fetch_deploy_key,
            git_clone_strategy=self.git_clone_strategy,
            github_installation_id=self.github_installation_id,
            gitlab_project_id=self.gitlab_project_id,
            id=self.id,
            is_active=self.is_active,
            project_id=self.project_id,
            remote_url=self.remote_url,
            repository_credentials_id=self.repository_credentials_id,
            repository_id=self.repository_id)


def get_repository(fetch_deploy_key: Optional[builtins.bool] = None,
                   project_id: Optional[builtins.int] = None,
                   repository_id: Optional[builtins.int] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetRepositoryResult:
    """
    Use this data source to access information about an existing resource.

    :param builtins.bool fetch_deploy_key: Whether we should return the public deploy key
    :param builtins.int project_id: Project ID to create the repository in
    :param builtins.int repository_id: ID for the repository
    """
    __args__ = dict()
    __args__['fetchDeployKey'] = fetch_deploy_key
    __args__['projectId'] = project_id
    __args__['repositoryId'] = repository_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('dbtcloud:index/getRepository:getRepository', __args__, opts=opts, typ=GetRepositoryResult).value

    return AwaitableGetRepositoryResult(
        deploy_key=pulumi.get(__ret__, 'deploy_key'),
        fetch_deploy_key=pulumi.get(__ret__, 'fetch_deploy_key'),
        git_clone_strategy=pulumi.get(__ret__, 'git_clone_strategy'),
        github_installation_id=pulumi.get(__ret__, 'github_installation_id'),
        gitlab_project_id=pulumi.get(__ret__, 'gitlab_project_id'),
        id=pulumi.get(__ret__, 'id'),
        is_active=pulumi.get(__ret__, 'is_active'),
        project_id=pulumi.get(__ret__, 'project_id'),
        remote_url=pulumi.get(__ret__, 'remote_url'),
        repository_credentials_id=pulumi.get(__ret__, 'repository_credentials_id'),
        repository_id=pulumi.get(__ret__, 'repository_id'))
def get_repository_output(fetch_deploy_key: Optional[pulumi.Input[Optional[builtins.bool]]] = None,
                          project_id: Optional[pulumi.Input[builtins.int]] = None,
                          repository_id: Optional[pulumi.Input[builtins.int]] = None,
                          opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetRepositoryResult]:
    """
    Use this data source to access information about an existing resource.

    :param builtins.bool fetch_deploy_key: Whether we should return the public deploy key
    :param builtins.int project_id: Project ID to create the repository in
    :param builtins.int repository_id: ID for the repository
    """
    __args__ = dict()
    __args__['fetchDeployKey'] = fetch_deploy_key
    __args__['projectId'] = project_id
    __args__['repositoryId'] = repository_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('dbtcloud:index/getRepository:getRepository', __args__, opts=opts, typ=GetRepositoryResult)
    return __ret__.apply(lambda __response__: GetRepositoryResult(
        deploy_key=pulumi.get(__response__, 'deploy_key'),
        fetch_deploy_key=pulumi.get(__response__, 'fetch_deploy_key'),
        git_clone_strategy=pulumi.get(__response__, 'git_clone_strategy'),
        github_installation_id=pulumi.get(__response__, 'github_installation_id'),
        gitlab_project_id=pulumi.get(__response__, 'gitlab_project_id'),
        id=pulumi.get(__response__, 'id'),
        is_active=pulumi.get(__response__, 'is_active'),
        project_id=pulumi.get(__response__, 'project_id'),
        remote_url=pulumi.get(__response__, 'remote_url'),
        repository_credentials_id=pulumi.get(__response__, 'repository_credentials_id'),
        repository_id=pulumi.get(__response__, 'repository_id')))
