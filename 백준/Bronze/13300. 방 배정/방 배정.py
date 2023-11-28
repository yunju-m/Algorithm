def maxRooms(st):
    global rooms, K
    while True:
        if st == 0:
            break
        elif st < K:
            rooms += 1
            break
        rooms += st // K
        st = st % K

N, K = map(int, input().split())
f_student = []
b_student = []
for i in range(N):
    S, Y = map(int, input().split())
    if S == 0:
        f_student.append(Y)
    else:
        b_student.append(Y)

rooms = 0
for i in range(1, 7):
    f_st = f_student.count(i)
    b_st = b_student.count(i)
    maxRooms(f_st)
    maxRooms(b_st)
print(rooms)