t = int(input())

for tc in range(1, t + 1) :
    n = int(input())
    data = list(input().split())
    if len(data) % 2 == 0 :
        a_list = data[:len(data)//2]
        b_list = data[len(data)//2:]
    else :
        a_list = data[:len(data) // 2 + 1]
        b_list = data[len(data) // 2 + 1:]
    result = []

    while a_list or b_list :
        if a_list :
            result.append(a_list.pop(0))
        if b_list :
            result.append(b_list.pop(0))

    print(f'#{tc}', *result)