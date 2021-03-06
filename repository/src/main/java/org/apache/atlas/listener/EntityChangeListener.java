/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.atlas.listener;

import org.apache.atlas.AtlasException;
import org.apache.atlas.typesystem.ITypedReferenceableInstance;

/**
 * Entity (a Typed instance) change notification listener.
 */
public interface EntityChangeListener {

    /**
     * This is upon adding a new typed instance to the repository.
     *
     * @param typedInstance a typed instance
     * @throws AtlasException
     */
    void onEntityAdded(ITypedReferenceableInstance typedInstance) throws AtlasException;

    /**
     * This is upon adding a new trait to a typed instance.
     *
     * @param guid          globally unique identifier for the entity
     * @param traitName     trait name for the instance that needs to be added to entity
     * @throws AtlasException
     */
    void onTraitAdded(String guid, String traitName) throws AtlasException;

    /**
     * This is upon deleting a trait from a typed instance.
     *
     * @param guid          globally unique identifier for the entity
     * @param traitName     trait name for the instance that needs to be deleted from entity
     * @throws AtlasException
     */
    void onTraitDeleted(String guid, String traitName) throws AtlasException;
}
