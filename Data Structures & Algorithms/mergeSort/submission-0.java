// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        //base case
        if(pairs.size() <=1) {
            return pairs;
        }
//divide the list into two halves
        int mid = pairs.size()/2;
        List<Pair> left =new ArrayList<>(); List<Pair> right=new ArrayList<>();
        for(int i = 0; i < mid; i++) {left.add(pairs.get(i));}
        for(int i = mid; i < pairs.size(); i++) {right.add(pairs.get(i));}

        //sort each half till size() is 1
        mergeSort(left);
        mergeSort(right);

        //merge the sorted halves 
        merge(pairs, left, right);

        return pairs;
    }

    public void merge(List<Pair> pairs, List<Pair> left, List<Pair> right) {
        int i=0, j=0, k=0;

        while(i<left.size() && j<right.size()) {
            if(left.get(i).key <= right.get(j).key) {
                pairs.set(k, left.get(i));
                i++;
            }else {
                pairs.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while(i<left.size()) {
            pairs.set(k++, left.get(i++));
        }
        while(j<right.size()) {
            pairs.set(k++, right.get(j++));
        }
    }
}
