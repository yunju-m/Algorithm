n = int(input())
yes = 0
no = 0
for i in range(n):
	ans = int(input())
	if ans == 1: yes += 1 
	else: no += 1
if yes > no: print( "Junhee is cute!")
else: print( "Junhee is not cute!")