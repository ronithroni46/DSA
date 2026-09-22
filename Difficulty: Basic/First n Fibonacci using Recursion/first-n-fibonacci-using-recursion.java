class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(0);

        if (n > 1) {
            arr.add(1);
        }

        for (int i = 2; i < n; i++) {
            int next = arr.get(i - 1) + arr.get(i - 2);
            arr.add(next);
        }

        return arr;
    }
}