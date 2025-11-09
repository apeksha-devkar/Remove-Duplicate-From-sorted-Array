class searchE {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String arg[]) {
        searchE o = new searchE();

        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = o.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < k)
                System.out.print(nums[i]);
            else
                System.out.print("_"); 

            if (i < nums.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }
}
