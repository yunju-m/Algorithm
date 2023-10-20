T = int(input())
d_day = ["SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"]
for test_case in range(1, T + 1):
    day = input()
    print("#{} {}".format(test_case, d_day.index(day)+1))