n = int(input())
if n <= 3:
    print(0)
else:
    cnt = (n * (n-1) * (n-2) * (n-3))//24
    print(cnt)
