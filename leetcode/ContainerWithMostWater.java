/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point
 * at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
 * of line i is at (i, ai) and (i, 0). Find two lines, which together with
 * x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container and n is at least 2.
 */
class Solution {
    public int maxArea(int[] height) {
        int largestArea = 0;
        int area;
        int selectedIndex1 = 0;
        int selectedIndex2 = height.length - 1;
        int maxHeight = 0;
        int maxHeightRight = 0;
        
        for(int i = 0; i < height.length; i++) {
            maxHeight = getMaxHeight(height[selectedIndex1], height[selectedIndex2]);
            area = calculateArea(selectedIndex1, selectedIndex2, maxHeight);
            
            largestArea = area > largestArea ? area : largestArea;
            
            for (int j = height.length - 1; j > 0; j--) {
                maxHeight = getMaxHeight(height[selectedIndex1], height[j]);
                area = calculateArea(selectedIndex1, j, maxHeight);
                
                largestArea = area > largestArea ? area : largestArea;
            }
            
            selectedIndex1++;
        }
        
        return largestArea;
    }
    
    private int getMaxHeight(int height1, int height2) {
        return height1 <= height2 ? height1 : height2;
    }
    
    private int calculateArea(int index1, int index2, int height) {
        return (index2 - index1) * height;
    }
}