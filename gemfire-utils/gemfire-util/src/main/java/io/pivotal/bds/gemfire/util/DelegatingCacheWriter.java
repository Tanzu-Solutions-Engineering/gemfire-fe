package io.pivotal.bds.gemfire.util;

import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

import org.springframework.util.Assert;

import org.apache.geode.cache.CacheWriter;
import org.apache.geode.cache.CacheWriterException;
import org.apache.geode.cache.Declarable;
import org.apache.geode.cache.EntryEvent;
import org.apache.geode.cache.RegionEvent;

public class DelegatingCacheWriter<K, V> implements CacheWriter<K, V>, Declarable {

    private Set<CacheWriter<K, V>> delegates = new HashSet<>();
    
    public void addDelegate(CacheWriter<K, V> cw) {
        Assert.notNull(cw);
        delegates.add(cw);
    }
    
    public void removeDelegate(CacheWriter<K, V> cw) {
        Assert.notNull(cw);
        delegates.remove(cw);
    }
    
    @Override
    public void close() {
    }

    @Override
    public void init(Properties props) {
    }

    @Override
    public void beforeCreate(EntryEvent<K, V> event) throws CacheWriterException {
        for (CacheWriter<K, V> cw: delegates) {
            cw.beforeCreate(event);
        }
    }

    @Override
    public void beforeDestroy(EntryEvent<K, V> event) throws CacheWriterException {
        for (CacheWriter<K, V> cw: delegates) {
            cw.beforeDestroy(event);
        }
    }

    @Override
    public void beforeRegionClear(RegionEvent<K, V> event) throws CacheWriterException {
        for (CacheWriter<K, V> cw: delegates) {
            cw.beforeRegionClear(event);
        }
    }

    @Override
    public void beforeRegionDestroy(RegionEvent<K, V> event) throws CacheWriterException {
        for (CacheWriter<K, V> cw: delegates) {
            cw.beforeRegionDestroy(event);
        }
    }

    @Override
    public void beforeUpdate(EntryEvent<K, V> event) throws CacheWriterException {
        for (CacheWriter<K, V> cw: delegates) {
            cw.beforeUpdate(event);
        }
    }

}
