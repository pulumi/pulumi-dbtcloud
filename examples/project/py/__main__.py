import pulumi
import pulumi_dbtcloud as dbtcloud

project = dbtcloud.Project("py-project", name="py-project")

pulumi.export("project_name", project.name)
