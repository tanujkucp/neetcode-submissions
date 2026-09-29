// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> sol = new ArrayList<>();
        if (pairs.isEmpty()) {
            return sol;
        }
        sol.add(new ArrayList<>(pairs));

        for(int i=1; i<pairs.size(); i++){
            int j=i-1;
            Pair curr = pairs.get(i);
            while(j>=0 && curr.key < pairs.get(j).key){
                pairs.set(j + 1, pairs.get(j));
                j--;
            }
            pairs.set(j + 1, curr);

            sol.add(new ArrayList<>(pairs));
        }

        return sol;
    }
}
