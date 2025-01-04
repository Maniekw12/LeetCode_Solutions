
//ontainer With Most Water
public class Problem10 {
    public int maxArea(int[] heights) {
        int leftIndex = 0;
        int rightIndex = heights.length - 1;
        int surface = 0;

        while (rightIndex > leftIndex) {
            int area = Math.min(heights[leftIndex], heights[rightIndex]) * (rightIndex - leftIndex);
            surface = Math.max(surface,area);
            if(heights[leftIndex] < heights[rightIndex]){
                leftIndex++;
            }else{
                rightIndex--;
            }
        }
        return surface;
    }

}
