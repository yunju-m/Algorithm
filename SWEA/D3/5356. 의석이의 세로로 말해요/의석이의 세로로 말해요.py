T = int(input())
for tc in range(1, T + 1):  # 1,2
    word = []
    for _ in range(5): 
        word.append(input())

    max_len = 0
    for r in word:
        if len(r) > max_len:
            max_len = len(r)

    uiseok_babbling = ''
    for i in range(max_len):
        for j in range(5):
            if i < len(word[j]):
                uiseok_babbling += word[j][i]

    print("#{} {}".format(tc, uiseok_babbling))