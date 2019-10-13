/*
 * Copyright (C) 2019 Michael Clarke
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */
package com.github.mc1arke.sonarqube.plugin.ce.pullrequest.github.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLProperty;

@GraphQLProperty(name = "createCheckRun", arguments = {@GraphQLArgument(name = "input")})
public class CreateCheckRun {

    private final String clientMutationId;
    private final CheckRun checkRun;

    @JsonCreator
    public CreateCheckRun(@JsonProperty("clientMutationId") String clientMutationId,
                          @JsonProperty("checkRun") CheckRun checkRun) {
        this.clientMutationId = clientMutationId;
        this.checkRun = checkRun;
    }

    public String getClientMutationId() {
        return clientMutationId;
    }

    public CheckRun getCheckRun() {
        return checkRun;
    }

}