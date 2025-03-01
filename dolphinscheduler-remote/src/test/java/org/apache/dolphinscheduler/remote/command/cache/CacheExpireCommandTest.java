/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.remote.command.cache;

import org.apache.dolphinscheduler.common.enums.CacheType;
import org.apache.dolphinscheduler.remote.command.CacheExpireCommand;
import org.apache.dolphinscheduler.remote.command.Command;
import org.apache.dolphinscheduler.remote.command.CommandType;

import org.junit.Assert;
import org.junit.Test;

public class CacheExpireCommandTest {

    @Test
    public void testConvert2Command() {
        CacheExpireCommand cacheExpireCommand = new CacheExpireCommand(CacheType.TENANT, 1);
        Assert.assertEquals(Integer.class, cacheExpireCommand.getUpdateObjClass());
        Assert.assertEquals("1", cacheExpireCommand.getUpdateObjJson());

        Command command = cacheExpireCommand.convert2Command();
        Assert.assertEquals(CommandType.CACHE_EXPIRE, command.getType());
    }
}
