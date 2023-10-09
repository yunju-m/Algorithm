def GCD(x,  y):
    while(y):
        x, y = y, x%y
    return x

def LCM(x, y):
    result = (x*y)//GCD(x, y)
    return result

T = int(input())
for test_case in range(1, T + 1):
    S, T = map(str, input().split())
    lcm = LCM(len(S), len(T))
    if S*(lcm//len(S)) == T*(lcm//len(T)):
        print(f"#{test_case} yes")
    else:
        print(f"#{test_case} no")     