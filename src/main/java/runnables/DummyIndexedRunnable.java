package runnables;

import java.util.logging.Logger;

@Times(10)
public final class DummyIndexedRunnable implements IndexedRunnable
{
    final static Logger logger = Logger.getLogger(DummyIndexedRunnable.class.getSimpleName());

    public void run(int index) throws Throwable
    {
        logger.info(String.valueOf(index));
    }
}
