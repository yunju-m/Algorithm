T = int(input())
for test_case in range(1, T + 1):
    inputNumber = input()
    result = 99999999
    for i in range(len(inputNumber)-1):
        result = min(int(inputNumber[:i+1]) + int(inputNumber[i+1:]), result)
    print("#{} {}".format(test_case, result))