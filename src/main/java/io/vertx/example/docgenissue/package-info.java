/*
 * Copyright (c) 2011-2014 The original author or authors
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 *     The Eclipse Public License is available at
 *     http://www.eclipse.org/legal/epl-v10.html
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
/**
 * = Docgen issue
 * issue present:
 * [source,java]
 * ----
 * JsonObject json = new JsonObject();
 * json.put("key", "\u0000\u0001\u0080\u009f\u00a0\u00ff");
 * json.put("key", "\u00c3\u00bc");
 * ----
 * issue fixed:
 * [source,$lang]
 * ----
 * {@link examples.Examples#example1}
 * ----
 */
@Document(fileName = "index.adoc")
@GenModule(name = "docgen-issue")
package io.vertx.example.docgenissue;
import io.vertx.codegen.annotations.GenModule;
import io.vertx.docgen.Document;
