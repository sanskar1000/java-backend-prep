import java.util.LinkedHashSet;

public class LinkedHashSetMasteryChallenge {
    public static void main(String[] args) {

        String[] names = {

                "Aradhya",

                "Rahul",

                "Priya",

                "Aradhya",

                "Aman",

                "Rahul",

                "Neha",

                "Priya"

        };

        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();

        // TODO 1:

        // Traverse the names array.

        // Add every name to uniqueNames.
        for (int i = 0 ; i< names.length ; i++){
            uniqueNames.add(names[i]);
        }

        // TODO 2:

        // Print the final LinkedHashSet.
        System.out.println(uniqueNames);
        // Expected:

        // [Aradhya, Rahul, Priya, Aman, Neha]

        // TODO 3:

        // Print the size.
        System.out.println(uniqueNames.size());
        // TODO 4:

        // Try adding "Aradhya" again.

        // Store the return value of add().

        // Print the return value.
        System.out.println(uniqueNames.add("Aradhya"));
        // TODO 5:

        // Remove "Rahul".
         uniqueNames.remove("Rahul");
        // TODO 6:

        // Add "Rahul" again.
        uniqueNames.add("Rahul");
        // TODO 7:

        // Print the final set.

        // Carefully observe Rahul's position.
        System.out.println(uniqueNames);

        // TODO 8:

        // Answer these questions in comments:

        /*

         * Q1. Why does Aradhya appear only once?
             because it does not support duplicates 
         *

         * Q2. Why does Aradhya remain before Rahul initially?
              because it added first 
         *

         * Q3. What happens to Rahul after remove() and add()?
              it goes in the last position 
         *

         * Q4. Does LinkedHashSet sort the elements?
              no 
         *

         * Q5. What does add() return when the element already exists?
                false
         *

         * Q6. What is the average time complexity of add()?
             O(1)
         *

         * Q7. When would you choose LinkedHashSet instead of HashSet?
               when i need uniqueness and insertion order 
         *

         * Q8. What is the difference between:

         *

         *     HashSet = Uniqueness 

         *     LinkedHashSet = uniqueness and insertion order

         *     TreeSet = uniqueness and sorted

         */
    }
}
