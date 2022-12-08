S, K, H = map(int, input().split())
if S+K+H < 100:
	if S <= K:
		if S <= H:
			result = 'Soongsil'
		else:
			result = 'Hanyang'
	else:
		if K <= H:
			result = 'Korea'
		else:
			result = 'Hanyang'
	print(result)
else:
	print("OK")