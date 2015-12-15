/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

  namespace java org.apache.airavata.model.data.resource
  namespace php Airavata.Model.Data.Resource
  namespace cpp apache.airavata.model.data.resource
  namespace py apache.airavata.model.data.resource

enum ReplicaLocationCategory {
    GATEWAY_DATA_STORE,
    COMPUTE_RESOURCE,
    LONG_TERM_STORAGE_RESOURCE,
    OTHER
}

enum ReplicaPersistentType {
    TRANSIENT,
    PERSISTENT
}

struct DataResourceModel {
    1: optional string resourceId,
    2: optional string gatewayId,
    3: optional string resourceName,
    4: optional string resourceDescription,
    5: optional string ownerName,
    6: optional i32 resourceSize,
    7: optional i64 creationTime,
    8: optional i64 lastModifiedTime,
    9: optional map<string, string> resourceMetadata,
    10: optional list<DataReplicaLocationModel> dataReplicaLocations
}

struct DataReplicaLocationModel {
    1: optional string replicaId,
    2: optional string resourceId,
    3: optional string replicaName,
    4: optional string replicaDescription,
    5: optional i64 creationTime,
    6: optional i64 lastModifiedTime,
    7: optional ReplicaLocationCategory replicaLocationCategory,
    8: optional ReplicaPersistentType replicaPersistentType,
    9: optional list<string> dataLocations,
    10: optional map<string, string> replicaMetadata
}