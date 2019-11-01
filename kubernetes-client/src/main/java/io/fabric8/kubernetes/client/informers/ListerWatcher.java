/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.informers;

import io.fabric8.kubernetes.api.model.ListOptions;
import io.fabric8.kubernetes.client.KubernetesClientException;
import io.fabric8.kubernetes.client.Watch;
import io.fabric8.kubernetes.client.Watcher;
import io.fabric8.kubernetes.client.dsl.base.OperationContext;

/**
 * ListerWatcher is any object that knows how to perform an initial list and
 * start a watch on a resource.
 *
 * @param <T> type
 * @param <TList> list for that type
 */
public interface ListerWatcher<T, TList> {
  Watch watch(ListOptions params, String namespace, OperationContext context, Watcher<T> watcher) throws KubernetesClientException;

  TList list(ListOptions params, String namespace, OperationContext context) throws KubernetesClientException;
}