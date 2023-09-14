T = 10
 
for test_case in range(1, T + 1):
    count = int(input())
    arr = [list(map(int, input().split())) for _ in range(100)]
    dest = 0
    for i in range(100):
        if arr[0][i] == 1:
            row, col = 0, i
            while row != 99:
                row += 1
                if col > 0 and arr[row][col-1] == 1:
                    while col > 0 and arr[row][col-1] == 1:
                        col -= 1
                elif col < 99 and arr[row][col+1] == 1:
                    while col < 99 and arr[row][col+1] == 1:
                        col += 1
            if arr[row][col] == 2:
                dest = i
                break
 
    print(f"#{count} {dest}")