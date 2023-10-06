d = [0] 
def find(n):
    global d
    if n <= d[-1]: 
        k = len(d) 
        for i in range(len(d)-1,-1,-1):
            if d[i-1]<n<=d[i]:
                k = i 
                break
        return [1+n-(1 + (k-1)*k//2),k-(n-(1 + (k-1)*k//2))] 
    else:
        k = len(d) 
        while True:
            if (1 + (k-1)*k//2)<= n <= k*(k+1)//2:
                break
            d.append(k*(k+1)//2) 
            k += 1
        return [1+n-(1 + (k-1)*k//2),k-(n-(1 + (k-1)*k//2))]
res = []
for tc in range(int(input())):
    P,Q = map(int,input().split())
    p_xy = find(P)
    q_xy = find(Q)
    xy = [p_xy[0]+q_xy[0],p_xy[1]+q_xy[1]]
    r = 1+(xy[0]+xy[1]-1)*(xy[0]+xy[1]-2)//2+xy[0]-1
    res.append("#{} {}".format(tc+1,r))
print("\n".join(res))