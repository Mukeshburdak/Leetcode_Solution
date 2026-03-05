int missingNumber(int* nums, int numsSize) {
    int i = 0, n, j, flag = 0;
    n = numsSize;
    i = n * (n + 1) / 2;
    for (j = 0; j < n; j++) {
        flag += nums[j];
    }
    return i - flag;
}
