// https://leetcode.com/problems/pascals-triangle/
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < numRows + 1; i++){
            List<Integer> currList = new ArrayList<Integer>();
            if (i > 2) {
                currList.add(1);
                for(int x = 2; x < i; x++) {
                    currList.add(result.get(i - 2).get(x - 1) + result.get(i - 2).get(x - 2));
                }
                currList.add(1);
            } else {
                for (int j = 0; j < i; j++) {
                    currList.add(1);
                }
            }
            result.add(currList);
        }
        return result;
    }
}
