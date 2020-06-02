/*-
 * ---license-start
 * Corona-Warn-App
 * ---
 * Copyright (C) 2020 SAP SE and all other contributors
 * ---
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ---license-end
 */

package app.coronawarn.server.services.distribution.assembly.structure.util.functional;

import app.coronawarn.server.services.distribution.assembly.structure.Writable;
import app.coronawarn.server.services.distribution.assembly.structure.util.ImmutableStack;
import java.util.function.Function;

/**
 * A {@code Function<Stack<Object>, Writable>}.
 *
 * @param <T> The specific type of {@link Writable} that this {@link WritableFunction} can create.
 */
@FunctionalInterface
public interface WritableFunction<T extends Writable<T>> extends Function<ImmutableStack<Object>, Writable<T>> {

  Writable<T> apply(ImmutableStack<Object> t);
}
