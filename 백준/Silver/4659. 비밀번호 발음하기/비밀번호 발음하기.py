mo = ['a','e','i','o','u']
while True:
	result = False		# 조건 충족 판단
	m_cnt = 0 			# 모음 연속 개수
	z_cnt = 0 			# 자음 연속 개수
	p_keyward = ''		# 이전의 테스트 케이스
	keyward = input()
	if keyward == 'end':
		break
	for k in keyward:
		if k in mo:
			m_cnt += 1
			z_cnt = 0
			result = True
		else:
			m_cnt = 0
			z_cnt += 1
		if m_cnt == 3 or z_cnt == 3:
			result = False
			break
		if p_keyward != '':
			if p_keyward not in ['e', 'o'] and p_keyward == k:
				result = False
				break
		p_keyward = k
	if result:
		print(f'<{keyward}> is acceptable.')
	else:
		print(f'<{keyward}> is not acceptable.')