// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

//go:generate go run ./generate.go

package main

import (
	"context"

	_ "embed" // to embed schema-embed.json

	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/pf/tfbridge"

	dbtcloud "github.com/pulumi/pulumi-dbtcloud/provider"
)

//go:embed schema-embed.json
var pulumiSchema []byte

func main() {
	ctx := context.Background()
	// Modify the path to point to the new provider
	tfbridge.Main(ctx, "dbtcloud", dbtcloud.Provider(ctx), tfbridge.ProviderMetadata{
		PackageSchema: pulumiSchema,
	})
}
