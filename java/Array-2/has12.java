public boolean has12(int[] nums) {
  boolean foundOne = false;
  boolean foundOneTwo = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1)
      foundOne = true;
    if (nums[i] == 2 && foundOne)
      foundOneTwo = true;
  }
  return foundOneTwo;
}
