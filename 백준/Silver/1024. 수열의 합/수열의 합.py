n,l = map(int,input().split())
ans_num =-1
S_l = 0
ans_l = 0 
for length in range(l,101):
    S_l = (length*(length-1))/2 
    if((n-S_l)%length==0 and (n-S_l)//length >=0): 
        ans_num = (n-S_l)//length 
        ans_l = length 
        break 
ans_num = int(ans_num)
if(ans_num==-1): 
    print(-1) 
else: 
    for i in range(ans_num,ans_num+ans_l):
        print(i,end=" ")
    print()