public class RemoveDupliC {
        public static void main(String[] args) {
            int[] inputArray = new int[] { 1, 1, 2, 2, 3, 6, 6, 7, 8, 8, 9, 9 };
            int currentValue = inputArray[0];

            boolean found = false;

            for (int i = 0; i < inputArray.length; i++)
            {
                if ( currentValue == inputArray[i] && !found)
                {
                    found = true;
                } else if (currentValue != inputArray[i])
                {
                    System.out.print(" " + currentValue);
                    currentValue = inputArray[i];
                    found = false;
                }
            }
            System.out.print(" " + currentValue);
        }
    }

