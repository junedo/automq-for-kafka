/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kafka.log.stream.s3;

import com.automq.stream.s3.Config;
import kafka.server.KafkaConfig;

public class ConfigUtils {

    public static Config to(KafkaConfig s) {
        return new Config()
                .brokerId(s.brokerId())
                .s3Endpoint(s.s3Endpoint())
                .s3Region(s.s3Region())
                .s3Bucket(s.s3Bucket())
                .s3WALPath(s.s3WALPath())
                .s3WALCacheSize(s.s3WALCacheSize())
                .s3WALCapacity(s.s3WALCapacity())
                .s3WALHeaderFlushIntervalSeconds(s.s3WALHeaderFlushIntervalSeconds())
                .s3WALThread(s.s3WALThread())
                .s3WALWindowInitial(s.s3WALWindowInitial())
                .s3WALWindowIncrement(s.s3WALWindowIncrement())
                .s3WALWindowMax(s.s3WALWindowMax())
                .s3WALObjectSize(s.s3WALObjectSize())
                .s3StreamSplitSize(s.s3StreamSplitSize())
                .s3ObjectBlockSize(s.s3ObjectBlockSize())
                .s3ObjectPartSize(s.s3ObjectPartSize())
                .s3BlockCacheSize(s.s3BlockCacheSize())
                .s3StreamObjectCompactionIntervalMinutes(s.s3StreamObjectCompactionTaskIntervalMinutes())
                .s3StreamObjectCompactionMaxSizeBytes(s.s3StreamObjectCompactionMaxSizeBytes())
                .s3StreamObjectCompactionLivingTimeMinutes(s.s3StreamObjectCompactionLivingTimeMinutes())
                .s3ControllerRequestRetryMaxCount(s.s3ControllerRequestRetryMaxCount())
                .s3ControllerRequestRetryBaseDelayMs(s.s3ControllerRequestRetryBaseDelayMs())
                .s3WALObjectCompactionInterval(s.s3WALObjectCompactionInterval())
                .s3WALObjectCompactionCacheSize(s.s3WALObjectCompactionCacheSize())
                .s3WALObjectCompactionUploadConcurrency(s.s3WALObjectCompactionUploadConcurrency())
                .s3MaxStreamNumPerWALObject(s.s3MaxStreamNumPerWALObject())
                .s3MaxStreamObjectNumPerCommit(s.s3MaxStreamObjectNumPerCommit())
                .s3WALObjectCompactionStreamSplitSize(s.s3WALObjectCompactionStreamSplitSize())
                .s3WALObjectCompactionForceSplitPeriod(s.s3WALObjectCompactionForceSplitPeriod())
                .s3WALObjectCompactionMaxObjectNum(s.s3WALObjectCompactionMaxObjectNum())
                .s3MockEnable(s.s3MockEnable())
                .s3ObjectLogEnable(s.s3ObjectLogEnable())
                .networkBaselineBandwidth(s.s3NetworkBaselineBandwidthProp())
                .refillPeriodMs(s.s3RefillPeriodMsProp());

    }

}
