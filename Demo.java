import java.util.Random;

class Demo 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        final int arraySize = 10000;
        int[] numberArray = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numberArray[i] = rand.nextInt(100000) + 1;
        }

        int threadCount = 5;

        largestFind[] maxFind = new largestFind[threadCount];

        int size = arraySize / threadCount;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < threadCount; i++)
         {
            maxFind[i] = new largestFind(numberArray, i * size, (i + 1) * size - 1);
            maxFind[i].start();
        }
        try
         {
            for (largestFind m : maxFind)
             {
                if (m != null) {
                    m.join();
                }
            }
        }
         catch (InterruptedException e)
          {
          }

        int max = Integer.MIN_VALUE;
        ;

        for (largestFind m : maxFind)
         {
            if (m != null) 
            {
                int retMax = m.getMax();
                if (max < retMax)
                 {
                    max = retMax;
                 }
            }
        }

        System.out.println("\nMax Value: " + max);

        long endTime = System.currentTimeMillis();
        System.out.println("\nTotal time in mili-second= " + (endTime - startTime));
    }
}