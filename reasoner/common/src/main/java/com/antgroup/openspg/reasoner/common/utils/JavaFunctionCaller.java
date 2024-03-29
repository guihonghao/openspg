/*
 * Copyright 2023 OpenSPG Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 */
package com.antgroup.openspg.reasoner.common.utils;
/**
 * @author peilong.zpl
 * @version $Id: FunctionUtils.java, v 0.1 2024-03-19 21:42 peilong.zpl Exp $$
 */
@FunctionalInterface
public interface JavaFunctionCaller<T, R> {
  R apply(T t);
}
