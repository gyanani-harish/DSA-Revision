class ArraySubset{
/**  Iterative
     * Generates all possible subsets (power set) of the given integer array.
     *
     * This method uses an iterative (non-recursive) approach to build the power set.
     * It starts with an empty set and progressively adds elements to create new subsets.
     *
     * @param nums  The input array of integers.
     * @return A list of lists, where each inner list represents a unique subset of the input array.
     * [] -> [1] -> [1, 2] -> [1, 2, 3]
             -> [2] -> [2, 3]
                      -> [3]
     */
    public List<List<Integer>> allSubsets(int[] nums) {
        // Initialize the result with an empty subset
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Empty set is always a subset

        // Iterate over each element in the input array
        for (int num : nums) {
            int n = result.size(); // Number of subsets before adding the current element

            // For each existing subset, create a new subset by adding the current element
            for (int i = 0; i < n; i++) {
                List<Integer> newSubset = new ArrayList<>(result.get(i)); // Copy the existing subset

                // Add the current element to the copy
                newSubset.add(num);

                // Add the new subset to the result
                result.add(newSubset);
            }
        }

        return result; // Return the list of all generated subsets
    }
/**
  *Initialization:

result = [[]] (Start with a list containing only the empty set)
Iteration 1: num = 1

n = len(result) = 1 (There's only one subset in the list)
Loop from i = 0 to n - 1 (i.e., 0):
newSubset = result[0].copy() = [] (Copy the empty subset)
newSubset.append(1) = [1] (Add the element '1')
result.append([1])
Now, result = [[], [1]]
Iteration 2: num = 2

n = len(result) = 2 (There are two subsets in the list)
Loop from i = 0 to n - 1 (i.e., 0, 1):
i = 0
newSubset = result[0].copy() = []
newSubset.append(2) = [2]
result.append([2])
i = 1
newSubset = result[1].copy() = [1]
newSubset.append(2) = [1, 2]
result.append([1, 2])
Now, result = [[], [1], [2], [1, 2]]
Iteration 3: num = 3

n = len(result) = 4 (There are four subsets in the list)
Loop from i = 0 to n - 1 (i.e., 0, 1, 2, 3):
i = 0
newSubset = result[0].copy() = []
newSubset.append(3) = [3]
result.append([3])
i = 1
newSubset = result[1].copy() = [1]
newSubset.append(3) = [1, 3]
result.append([1, 3])
i = 2
newSubset = result[2].copy() = [2]
newSubset.append(3) = [2, 3]
result.append([2, 3])
i = 3
newSubset = result[3].copy() = [1, 2]
newSubset.append(3) = [1, 2, 3]
result.append([1, 2, 3])
Now, result = [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
  */
  
}
