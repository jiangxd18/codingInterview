package 剑指offer.第二章;

/**
 * @author juran
 * @date 2020/2/24 2:53 PM
 */
public class Solution {

    //二维数组中的查找
    public boolean Find(int target, int [][] array) {
        if(array == null){
            return false;
        }
        //取左下角数值
        int row = array.length - 1, column = 0;
        while( row >= 0 && row < array.length && column >=0 && column < array[0].length){
            if(array[row][column] == target){
                return true;
            }else if(array[row][column] > target){
                row --;
            }else{
                column ++;
            }
        }
        return false;
    }
}
