T = int(input())
for tc in range(1, T + 1):
    N = int(input())
    S = input()
    if S[:N//2] == S[N//2:]:
        print(f"#{tc} Yes")
    else:
        print(f"#{tc} No")
        