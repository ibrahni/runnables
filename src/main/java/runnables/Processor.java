package runnables;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public final class Processor
{
    private Processor()
    {

    }

    public static void process(final Class<? extends IndexedRunnable> indexedRunnableType)
    {
        final int times = indexedRunnableType.getAnnotation(Times.class).value();

        final ExecutorService executorService = Executors.newWorkStealingPool();

        IntStream.range(0, times)
            .forEach(index -> {
                executorService.execute(() -> {
                    try
                    {
                        indexedRunnableType.newInstance().run(index);
                    }
                    catch (final Throwable throwable)
                    {
                        throw new RuntimeException(throwable.getMessage(), throwable);
                    }
                });
            });

        executorService.shutdown();

        while (!executorService.isTerminated());
    }
}
