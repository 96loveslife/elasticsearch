/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0 and the Server Side Public License, v 1; you may not use this file except
 * in compliance with, at your election, the Elastic License 2.0 or the Server
 * Side Public License, v 1.
 */

package org.elasticsearch.action.bulk;

public class ShardExecutionMetrics {

    final String indexName;
    final int shardId;
    final long durationMillis;

    ShardExecutionMetrics(String indexName, int shardId, long durationMillis) {
        this.indexName = indexName;
        this.shardId = shardId;
        this.durationMillis = durationMillis;
    }

    public int getShardId() {
        return shardId;
    }

    public String getIndexName() {
        return indexName;
    }

    public long getDurationMillis() {
        return durationMillis;
    }
}
