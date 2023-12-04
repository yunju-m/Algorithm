student_num = int(input())
numbers = list(map(int, input().split()))
student = []
for i in range(1, student_num+1):
    student.insert(numbers[i-1], i)
student.reverse()
print(*student)