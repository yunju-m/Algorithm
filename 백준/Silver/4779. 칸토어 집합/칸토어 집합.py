import sys
input = sys.stdin.readline

def cut(a,n): # a = 시작점
    if n == 1:
        return
    for i in range(a + n//3, a +(n//3)*2): # 가운데 문자열을 공백으로
        result[i] = ' '
    cut(a, n//3) # 왼쪽 잘라나가기
    cut(a + n//3 * 2, n//3) # 오른족 잘라나가기

while(1):
    try :
        N = int(input())
        result = ['-']*(3**N) # 최초 리스트 집합
        cut(0,3**N) # 자르기
        print(''.join(result))
    except : # EOF 발생시
        break # 종료