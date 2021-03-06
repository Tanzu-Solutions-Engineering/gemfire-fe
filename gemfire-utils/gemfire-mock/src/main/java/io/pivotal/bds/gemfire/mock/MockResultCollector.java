package io.pivotal.bds.gemfire.mock;

import org.apache.geode.cache.execute.FunctionException;
import org.apache.geode.cache.execute.ResultCollector;
import org.apache.geode.distributed.DistributedMember;

import java.util.Collection;
import java.util.concurrent.TimeUnit;

/**
 * Created by tdalsing on 3/23/17.
 */
public class MockResultCollector<T, S> implements ResultCollector<T, S> {

    private Collection<Object> results;

    public void setResults(Collection<Object> results) {
        this.results = results;
    }

    @Override
    public S getResult() throws FunctionException {
        return (S)results;
    }

    @Override
    public S getResult(long l, TimeUnit timeUnit) throws FunctionException, InterruptedException {
        return (S)results;
    }

    @Override
    public void addResult(DistributedMember distributedMember, T t) {

    }

    @Override
    public void endResults() {

    }

    @Override
    public void clearResults() {

    }
}
