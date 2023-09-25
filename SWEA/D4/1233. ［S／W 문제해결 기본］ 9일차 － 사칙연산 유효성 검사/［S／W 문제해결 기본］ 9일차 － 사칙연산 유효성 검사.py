operator = ['+', '-', '*', '/']

def operate(v):
    if tree[v] in operator:
        if not left_child[v] or not right_child[v]:
            return 'invalid'
        left_val = operate(left_child[v])
        right_val = operate(right_child[v])
        if left_val == 'invalid' or right_val == 'invalid':
            return 'invalid'
        if left_val == 'zero division error' or right_val == 'zero division error':
            return 'zero division error'
        result = 0
        if tree[v] == '+': result = left_val + right_val
        elif tree[v] == '-': result = left_val - right_val
        elif tree[v] == '*': result = left_val * right_val
        else:
            if right_val == 0:
                return 'zero division error'
            result = left_val / right_val
        return result
    else:
        if left_child[v] or right_child[v]:
            return 'invalid'
        return tree[v]

for t_case in range(1, 11):
    N = int(input())
    in_arr = [input().split() for _ in range(N)]
    tree = [0] * (N + 1)
    left_child = [0] * (N + 1)
    right_child = [0] * (N + 1)

    for arr in in_arr:
        node = int(arr[0])
        if arr[1] not in operator:
            arr[1] = int(arr[1])
        tree[node] = arr[1]
        if len(arr) >= 3:
            left_child[node] = int(arr[2])
            if len(arr) == 4:
                right_child[node] = int(arr[3])
    result = 1
    if operate(1) == 'invalid': result = 0
    print(f'#{t_case} {result}')