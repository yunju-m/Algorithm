import sys
input = sys.stdin.readline

ol = list(map(int, input().split()))
st = list(map(int, input().split()))
sum_ol = 0
sum_st = 0
res = False

for i in range(9):
    sum_ol += ol[i]
    if sum_ol > sum_st:
        res = True
    sum_st += st[i]

if res == True and sum_ol < sum_st:
    print("Yes")
else:
    print("No")