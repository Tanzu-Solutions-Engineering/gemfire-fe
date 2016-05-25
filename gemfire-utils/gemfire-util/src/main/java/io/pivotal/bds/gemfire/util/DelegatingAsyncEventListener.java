package io.pivotal.bds.gemfire.util;

import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import com.gemstone.gemfire.cache.Declarable;
import com.gemstone.gemfire.cache.asyncqueue.AsyncEvent;
import com.gemstone.gemfire.cache.asyncqueue.AsyncEventListener;

public class DelegatingAsyncEventListener implements AsyncEventListener, Declarable {

    private Set<AsyncEventListener> delegates = new HashSet<>();

    public void addDelegate(AsyncEventListener ael) {
        delegates.add(ael);
    }

    public void removeDelegate(AsyncEventListener ael) {
        delegates.remove(ael);
    }

    @Override
    public void close() {
    }

    @Override
    public void init(Properties props) {
    }

    @SuppressWarnings("rawtypes")
    @Override
    public boolean processEvents(List<AsyncEvent> events) {
        for (AsyncEventListener ael : delegates) {
            boolean b = ael.processEvents(events);
            if (!b) {
                return false;
            }
        }
        return true;
    }

}