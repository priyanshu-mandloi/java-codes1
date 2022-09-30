public class pm27 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4};
        int[] index = new int[]{0,1,2,2,1};
        System.out.println(lol(nums, index));


}

static int[] lol(int[] nums, int[] index){
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        int idx = index[i];
        if (idx == i) {
            result[i] = nums[i];
        } else {
            int j = i;
            while (j != idx) {
                result[j] = result[j - 1];
                j--;
            }
            result[j] = nums[i];
        }
    }
    return result;
    }
}
