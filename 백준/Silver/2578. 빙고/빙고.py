bingo1 = [list(map(int,input().split()))for i in range(5)] # 빙고판
bingo2 = list(map(list,zip(*bingo1)))  		# 빙고 세로줄로 된 판

bingo3 = [] 
bingo4 = []

for i in range(len(bingo1)) :
    bingo3.append(bingo1[i][i]) #빙고 왼쪽 대각선
    bingo4.append(bingo2[i][4-i]) #빙고 오른쪽 대각선 

#빙고가 되는 경우의 수 12가지 만들기 
bingo = bingo1+bingo2
bingo.append(bingo3)
bingo.append(bingo4) 

lst = []
for i in range(5) :
    lst += list(map(int,input().split()))
n = 0
for i in lst :
    n +=1
    cnt = 0
    for j in bingo :
        if i in j :
            j.remove(i) #숫자가 선언되면 빙고 경우의 수 리스트에서 수를 지우기 
        if j == [] : #빈 리스트이면 cnt + 1
            cnt +=1
    if cnt >= 3: #빙고가 세개이면 종료 
        break
print(n)    