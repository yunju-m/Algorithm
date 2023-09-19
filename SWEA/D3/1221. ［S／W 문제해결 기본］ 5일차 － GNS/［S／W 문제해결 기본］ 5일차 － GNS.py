T = int(input())
num_arr = ["ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"]
for test_case in range(1, T + 1):
    test_num, test_len = input().split()
    arr = list(input().split())
    print(test_num)
    for na in num_arr:
        num_cnt = arr.count(na)
        for _ in range(num_cnt):
        	print(na, end=" ")
            