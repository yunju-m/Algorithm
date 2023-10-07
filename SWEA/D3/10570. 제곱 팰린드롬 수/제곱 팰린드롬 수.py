T = int(input())
from math import sqrt

for test_case in range(1, T + 1):
    A, B =  map(int, input().split())
    cnt = 0
    for num in range(A, B+1):
        if str(num) == str(num)[::-1]:
            sqnum = sqrt(num)
            if sqnum == int(sqnum):
                if str(int(sqnum)) == str(int(sqnum))[::-1]:
                    cnt +=1
    print(f"#{test_case}", cnt)