class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[] = new int[2];
        int sum = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
                sum+=grid[i][j];
            }
        }
        for(Map.Entry<Integer,Integer>e : map.entrySet()){
            if(e.getValue()>1){
                arr[0]=e.getKey();
            }
        }
        sum-=arr[0];
        int n = grid.length;
        arr[1] = (n * n) * (n * n + 1) / 2-sum;
        return arr;
    }
}